import SwiftUI
import composeApp

struct VocabularyListView: View {
    @StateObject private var viewModel = VocabularyListViewModel()
    @State private var vocabularySets: [VocabularySet] = []

    var body: some View {
        NavigationView {
            List(vocabularySets, id: \.id) { set in
                NavigationLink(destination: ModeSelectionView(setId: set.id)) {
                    VStack(alignment: .leading) {
                        Text(set.name)
                            .font(.headline)
                        Text("\(set.words.count) words")
                            .font(.subheadline)
                            .foregroundColor(.secondary)
                    }
                }
            }
            .navigationTitle("Vocabulary")
            .toolbar {
                ToolbarItem(placement: .navigationBarTrailing) {
                    Button(action: {
                        viewModel.addSampleSet()
                    }) {
                        Image(systemName: "plus")
                    }
                }
            }
        }
        .onAppear {
            viewModel.ensureSampleData()
        }
        .collect(viewModel.vocabularySets) { sets in
            self.vocabularySets = sets
        }
    }
}
