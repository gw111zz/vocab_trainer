import SwiftUI
import composeApp

struct ModeSelectionView: View {
    let setId: String

    var body: some View {
        VStack(spacing: 32) {
            VStack(spacing: 16) {
                Text("Spaced Repetition")
                    .font(.headline)

                HStack(spacing: 16) {
                    NavigationLink(destination: SessionView(setId: setId, mode: .spacedrepetition, direction: .italyantoenglish)) {
                        Text("IT -> EN")
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.blue)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }

                    NavigationLink(destination: SessionView(setId: setId, mode: .spacedrepetition, direction: .englishtoitalian)) {
                        Text("EN -> IT")
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.blue)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }
                }
            }

            VStack(spacing: 16) {
                Text("Testing Mode")
                    .font(.headline)

                HStack(spacing: 16) {
                    NavigationLink(destination: SessionView(setId: setId, mode: .testing, direction: .italyantoenglish)) {
                        Text("IT -> EN")
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.green)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }

                    NavigationLink(destination: SessionView(setId: setId, mode: .testing, direction: .englishtoitalian)) {
                        Text("EN -> IT")
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.green)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }
                }
            }

            Spacer()
        }
        .padding()
        .navigationTitle("Select Mode")
    }
}
