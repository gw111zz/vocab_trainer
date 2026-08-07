import SwiftUI
import composeApp

struct SessionView: View {
    let setId: String
    let mode: SessionMode
    let direction: SessionDirection

    @StateObject private var viewModel: SessionViewModel
    @State private var state = SessionState(
        currentSet: nil,
        currentIndex: 0,
        isFinished: false,
        score: 0,
        userInput: "",
        feedbackMessage: nil,
        isCorrect: nil,
        canMoveToNext: false
    )
    
    @FocusState private var isTextFieldFocused: Bool

    @Environment(\.presentationMode) var presentationMode

    init(setId: String, mode: SessionMode, direction: SessionDirection) {
        self.setId = setId
        self.mode = mode
        self.direction = direction
        // Append a timestamp or unique ID to the factory key if SKIE/KMP ViewModel management reuses instances
        self._viewModel = StateObject(wrappedValue: SessionViewModel(setId: setId, mode: mode, direction: direction))
    }

    var body: some View {
        VStack {
            if state.isFinished {
                VStack(spacing: 20) {
                    Text("Session Finished!")
                        .font(.largeTitle)
                        .bold()

                    if mode == .testing {
                        Text("Score: \(state.score) / \(state.currentSet?.words.count ?? 0)")
                            .font(.title2)
                    }

                    Button("Back to Menu") {
                        presentationMode.wrappedValue.dismiss()
                    }
                    .buttonStyle(.borderedProminent)
                }
            } else if let currentWord = state.currentSet?.words[Int(state.currentIndex)] {
                let prompt = direction == .italyantoenglish ? currentWord.original : currentWord.translation
                
                VStack(spacing: 20) {
                    CardView(text: prompt)
                    
                    TextField("Translation", text: Binding(
                        get: { state.userInput },
                        set: { if !state.canMoveToNext { viewModel.onUserInputChanged(input: $0) } }
                    ))
                    .textFieldStyle(.roundedBorder)
                    .autocapitalization(.none)
                    .disableAutocorrection(true)
                    .focused($isTextFieldFocused)
                    .onSubmit {
                        if state.canMoveToNext {
                            viewModel.nextWord()
                        } else if !state.userInput.isEmpty {
                            viewModel.checkAnswer()
                        }
                    }

                    if let feedback = state.feedbackMessage {
                        Text(feedback)
                            .foregroundColor(state.isCorrect?.boolValue == true ? .green : .red)
                            .font(.headline)
                    }

                    Spacer()

                    Button(action: {
                        if state.canMoveToNext {
                            viewModel.nextWord()
                        } else {
                            viewModel.checkAnswer()
                        }
                    }) {
                        Text(state.canMoveToNext ? "Next" : "Check")
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(state.userInput.isEmpty && !state.canMoveToNext ? Color.gray : Color.accentColor)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }
                    .disabled(state.userInput.isEmpty && !state.canMoveToNext)
                }
                .padding()
                .onAppear {
                    isTextFieldFocused = true
                }
                .onChange(of: state.currentIndex) { _ in
                    isTextFieldFocused = true
                }
            } else {
                ProgressView()
            }
        }
        .navigationTitle(mode == .spacedrepetition ? "Learning" : "Testing")
        .collect(viewModel.state) { newState in
            self.state = newState
        }
    }
}

struct CardView: View {
    let text: String

    var body: some View {
        ZStack {
            RoundedRectangle(cornerRadius: 20)
                .fill(Color.accentColor.opacity(0.1))
                .overlay(
                    RoundedRectangle(cornerRadius: 20)
                        .stroke(Color.accentColor, lineWidth: 2)
                )

            Text(text)
                .font(.system(size: 40, weight: .bold))
                .multilineTextAlignment(.center)
                .padding()
        }
        .frame(height: 200)
    }
}
