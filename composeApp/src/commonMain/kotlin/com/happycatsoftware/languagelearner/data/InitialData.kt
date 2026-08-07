package com.happycatsoftware.languagelearner.data

val initialItalianSets = listOf(
    VocabularySet(
        id = "it-1",
        name = "Italian Basics",
        words = listOf(
            VocabularyWord("Ciao", "Hello/Goodbye"),
            VocabularyWord("Buongiorno", "Good morning"),
            VocabularyWord("Buonasera", "Good evening"),
            VocabularyWord("Per favore", "Please"),
            VocabularyWord("Grazie", "Thank you"),
            VocabularyWord("Prego", "You're welcome"),
            VocabularyWord("Sì", "Yes"),
            VocabularyWord("No", "No"),
            VocabularyWord("Mi scusi", "Excuse me"),
            VocabularyWord("Come stai?", "How are you?")
        )
    ),
    VocabularySet(
        id = "it-2",
        name = "Common Verbs",
        words = listOf(
            VocabularyWord("Essere", "To be"),
            VocabularyWord("Avere", "To have"),
            VocabularyWord("Fare", "To do/make"),
            VocabularyWord("Andare", "To go"),
            VocabularyWord("Venire", "To come"),
            VocabularyWord("Potere", "To be able to"),
            VocabularyWord("Volere", "To want"),
            VocabularyWord("Dovere", "To have to"),
            VocabularyWord("Parlare", "To speak"),
            VocabularyWord("Mangiare", "To eat")
        )
    ),

    VocabularySet(
        id = "it-essere-presente",
        name = "Essere - Presente",
        words = listOf(
            VocabularyWord("Io sono", "I am"),
            VocabularyWord("Tu sei", "You are"),
            VocabularyWord("Lei è", "She is"),
            VocabularyWord("Noi siamo", "We are"),
            VocabularyWord("Voi siete", "You (plural) are"),
            VocabularyWord("Loro sono", "They are")
        )
    ),

    VocabularySet(
        id = "it-essere-passato-prossimo",
        name = "Essere - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io sono stata", "I was / I have been"),
            VocabularyWord("Tu sei stata", "You were / You have been"),
            VocabularyWord("Lei è stata", "She was / She has been"),
            VocabularyWord("Noi siamo state", "We were / We have been"),
            VocabularyWord("Voi siete state", "You (plural) were / have been"),
            VocabularyWord("Loro sono state", "They were / They have been")
        )
    ),

    VocabularySet(
        id = "it-avere-presente",
        name = "Avere - Presente",
        words = listOf(
            VocabularyWord("Io ho", "I have"),
            VocabularyWord("Tu hai", "You have"),
            VocabularyWord("Lei ha", "She has"),
            VocabularyWord("Noi abbiamo", "We have"),
            VocabularyWord("Voi avete", "You (plural) have"),
            VocabularyWord("Loro hanno", "They have")
        )
    ),

    VocabularySet(
        id = "it-avere-passato-prossimo",
        name = "Avere - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho avuto", "I had / I have had"),
            VocabularyWord("Tu hai avuto", "You had / You have had"),
            VocabularyWord("Lei ha avuto", "She had / She has had"),
            VocabularyWord("Noi abbiamo avuto", "We had / We have had"),
            VocabularyWord("Voi avete avuto", "You (plural) had / have had"),
            VocabularyWord("Loro hanno avuto", "They had / They have had")
        )
    ),

    VocabularySet(
        id = "it-fare-presente",
        name = "Fare - Presente",
        words = listOf(
            VocabularyWord("Io faccio", "I do / I make"),
            VocabularyWord("Tu fai", "You do / make"),
            VocabularyWord("Lei fa", "She does / makes"),
            VocabularyWord("Noi facciamo", "We do / make"),
            VocabularyWord("Voi fate", "You (plural) do / make"),
            VocabularyWord("Loro fanno", "They do / make")
        )
    ),

    VocabularySet(
        id = "it-fare-passato-prossimo",
        name = "Fare - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho fatto", "I did / I have done"),
            VocabularyWord("Tu hai fatto", "You did / You have done"),
            VocabularyWord("Lei ha fatto", "She did / She has done"),
            VocabularyWord("Noi abbiamo fatto", "We did / We have done"),
            VocabularyWord("Voi avete fatto", "You (plural) did / have done"),
            VocabularyWord("Loro hanno fatto", "They did / They have done")
        )
    ),

    VocabularySet(
        id = "it-andare-presente",
        name = "Andare - Presente",
        words = listOf(
            VocabularyWord("Io vado", "I go"),
            VocabularyWord("Tu vai", "You go"),
            VocabularyWord("Lei va", "She goes"),
            VocabularyWord("Noi andiamo", "We go"),
            VocabularyWord("Voi andate", "You (plural) go"),
            VocabularyWord("Loro vanno", "They go")
        )
    ),

    VocabularySet(
        id = "it-andare-passato-prossimo",
        name = "Andare - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io sono andata", "I went / I have gone"),
            VocabularyWord("Tu sei andata", "You went / You have gone"),
            VocabularyWord("Lei è andata", "She went / She has gone"),
            VocabularyWord("Noi siamo andate", "We went / We have gone"),
            VocabularyWord("Voi siete andate", "You (plural) went / have gone"),
            VocabularyWord("Loro sono andate", "They went / They have gone")
        )
    ),

    VocabularySet(
        id = "it-venire-presente",
        name = "Venire - Presente",
        words = listOf(
            VocabularyWord("Io vengo", "I come"),
            VocabularyWord("Tu vieni", "You come"),
            VocabularyWord("Lei viene", "She comes"),
            VocabularyWord("Noi veniamo", "We come"),
            VocabularyWord("Voi venite", "You (plural) come"),
            VocabularyWord("Loro vengono", "They come")
        )
    ),

    VocabularySet(
        id = "it-venire-passato-prossimo",
        name = "Venire - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io sono venuta", "I came / I have come"),
            VocabularyWord("Tu sei venuta", "You came / You have come"),
            VocabularyWord("Lei è venuta", "She came / She has come"),
            VocabularyWord("Noi siamo venute", "We came / We have come"),
            VocabularyWord("Voi siete venute", "You (plural) came / have come"),
            VocabularyWord("Loro sono venute", "They came / They have come")
        )
    ),

    VocabularySet(
        id = "it-potere-presente",
        name = "Potere - Presente",
        words = listOf(
            VocabularyWord("Io posso", "I can"),
            VocabularyWord("Tu puoi", "You can"),
            VocabularyWord("Lei può", "She can"),
            VocabularyWord("Noi possiamo", "We can"),
            VocabularyWord("Voi potete", "You (plural) can"),
            VocabularyWord("Loro possono", "They can")
        )
    ),

    VocabularySet(
        id = "it-potere-passato-prossimo",
        name = "Potere - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho potuto", "I could / I have been able to"),
            VocabularyWord("Tu hai potuto", "You could / You have been able to"),
            VocabularyWord("Lei ha potuto", "She could / She has been able to"),
            VocabularyWord("Noi abbiamo potuto", "We could / We have been able to"),
            VocabularyWord("Voi avete potuto", "You (plural) could / have been able to"),
            VocabularyWord("Loro hanno potuto", "They could / They have been able to")
        )
    ),

    VocabularySet(
        id = "it-volere-presente",
        name = "Volere - Presente",
        words = listOf(
            VocabularyWord("Io voglio", "I want"),
            VocabularyWord("Tu vuoi", "You want"),
            VocabularyWord("Lei vuole", "She wants"),
            VocabularyWord("Noi vogliamo", "We want"),
            VocabularyWord("Voi volete", "You (plural) want"),
            VocabularyWord("Loro vogliono", "They want")
        )
    ),

    VocabularySet(
        id = "it-volere-passato-prossimo",
        name = "Volere - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho voluto", "I wanted / I have wanted"),
            VocabularyWord("Tu hai voluto", "You wanted / You have wanted"),
            VocabularyWord("Lei ha voluto", "She wanted / She has wanted"),
            VocabularyWord("Noi abbiamo voluto", "We wanted / We have wanted"),
            VocabularyWord("Voi avete voluto", "You (plural) wanted / have wanted"),
            VocabularyWord("Loro hanno voluto", "They wanted / They have wanted")
        )
    ),

    VocabularySet(
        id = "it-dovere-presente",
        name = "Dovere - Presente",
        words = listOf(
            VocabularyWord("Io devo", "I must / I have to"),
            VocabularyWord("Tu devi", "You must / have to"),
            VocabularyWord("Lei deve", "She must / has to"),
            VocabularyWord("Noi dobbiamo", "We must / have to"),
            VocabularyWord("Voi dovete", "You (plural) must / have to"),
            VocabularyWord("Loro devono", "They must / have to")
        )
    ),

    VocabularySet(
        id = "it-dovere-passato-prossimo",
        name = "Dovere - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho dovuto", "I had to / I have had to"),
            VocabularyWord("Tu hai dovuto", "You had to / You have had to"),
            VocabularyWord("Lei ha dovuto", "She had to / She has had to"),
            VocabularyWord("Noi abbiamo dovuto", "We had to / We have had to"),
            VocabularyWord("Voi avete dovuto", "You (plural) had to / have had to"),
            VocabularyWord("Loro hanno dovuto", "They had to / They have had to")
        )
    ),

    VocabularySet(
        id = "it-parlare-presente",
        name = "Parlare - Presente",
        words = listOf(
            VocabularyWord("Io parlo", "I speak"),
            VocabularyWord("Tu parli", "You speak"),
            VocabularyWord("Lei parla", "She speaks"),
            VocabularyWord("Noi parliamo", "We speak"),
            VocabularyWord("Voi parlate", "You (plural) speak"),
            VocabularyWord("Loro parlano", "They speak")
        )
    ),

    VocabularySet(
        id = "it-parlare-passato-prossimo",
        name = "Parlare - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho parlato", "I spoke / I have spoken"),
            VocabularyWord("Tu hai parlato", "You spoke / You have spoken"),
            VocabularyWord("Lei ha parlato", "She spoke / She has spoken"),
            VocabularyWord("Noi abbiamo parlato", "We spoke / We have spoken"),
            VocabularyWord("Voi avete parlato", "You (plural) spoke / have spoken"),
            VocabularyWord("Loro hanno parlato", "They spoke / They have spoken")
        )
    ),

    VocabularySet(
        id = "it-mangiare-presente",
        name = "Mangiare - Presente",
        words = listOf(
            VocabularyWord("Io mangio", "I eat"),
            VocabularyWord("Tu mangi", "You eat"),
            VocabularyWord("Lei mangia", "She eats"),
            VocabularyWord("Noi mangiamo", "We eat"),
            VocabularyWord("Voi mangiate", "You (plural) eat"),
            VocabularyWord("Loro mangiano", "They eat")
        )
    ),

    VocabularySet(
        id = "it-mangiare-passato-prossimo",
        name = "Mangiare - Passato Prossimo",
        words = listOf(
            VocabularyWord("Io ho mangiato", "I ate / I have eaten"),
            VocabularyWord("Tu hai mangiato", "You ate / You have eaten"),
            VocabularyWord("Lei ha mangiato", "She ate / She has eaten"),
            VocabularyWord("Noi abbiamo mangiato", "We ate / We have eaten"),
            VocabularyWord("Voi avete mangiato", "You (plural) ate / have eaten"),
            VocabularyWord("Loro hanno mangiato", "They ate / They have eaten")
        )
    ),
    VocabularySet(
        id = "it-3",
        name = "Numbers 1-10",
        words = listOf(
            VocabularyWord("Uno", "One"),
            VocabularyWord("Due", "Two"),
            VocabularyWord("Tre", "Three"),
            VocabularyWord("Quattro", "Four"),
            VocabularyWord("Cinque", "Five"),
            VocabularyWord("Sei", "Six"),
            VocabularyWord("Sette", "Seven"),
            VocabularyWord("Otto", "Eight"),
            VocabularyWord("Nove", "Nine"),
            VocabularyWord("Dieci", "Ten")
        )
    ),
    VocabularySet(
        id = "it-4",
        name = "Family",
        words = listOf(
            VocabularyWord("La famiglia", "The family"),
            VocabularyWord("Madre", "Mother"),
            VocabularyWord("Padre", "Father"),
            VocabularyWord("Fratello", "Brother"),
            VocabularyWord("Sorella", "Sister"),
            VocabularyWord("Figlio", "Son"),
            VocabularyWord("Figlia", "Daughter"),
            VocabularyWord("Nonno", "Grandfather"),
            VocabularyWord("Nonna", "Grandmother"),
            VocabularyWord("Zio", "Uncle")
        )
    ),
    VocabularySet(
        id = "it-5",
        name = "Food & Drink",
        words = listOf(
            VocabularyWord("Pane", "Bread"),
            VocabularyWord("Acqua", "Water"),
            VocabularyWord("Vino", "Wine"),
            VocabularyWord("Caffè", "Coffee"),
            VocabularyWord("Latte", "Milk"),
            VocabularyWord("Pasta", "Pasta"),
            VocabularyWord("Pizza", "Pizza"),
            VocabularyWord("Formaggio", "Cheese"),
            VocabularyWord("Frutta", "Fruit"),
            VocabularyWord("Verdura", "Vegetable")
        )
    ),
    VocabularySet(
        id = "it-6",
        name = "Colors",
        words = listOf(
            VocabularyWord("Rosso", "Red"),
            VocabularyWord("Blu", "Blue"),
            VocabularyWord("Verde", "Green"),
            VocabularyWord("Giallo", "Yellow"),
            VocabularyWord("Nero", "Black"),
            VocabularyWord("Bianco", "White"),
            VocabularyWord("Grigio", "Grey"),
            VocabularyWord("Arancione", "Orange"),
            VocabularyWord("Viola", "Purple"),
            VocabularyWord("Marrone", "Brown")
        )
    ),
    VocabularySet(
        id = "it-7",
        name = "Days of the Week",
        words = listOf(
            VocabularyWord("Lunedì", "Monday"),
            VocabularyWord("Martedì", "Tuesday"),
            VocabularyWord("Mercoledì", "Wednesday"),
            VocabularyWord("Giovedì", "Thursday"),
            VocabularyWord("Venerdì", "Friday"),
            VocabularyWord("Sabato", "Saturday"),
            VocabularyWord("Domenica", "Sunday"),
            VocabularyWord("Oggi", "Today"),
            VocabularyWord("Domani", "Tomorrow"),
            VocabularyWord("Ieri", "Yesterday")
        )
    ),
    VocabularySet(
        id = "it-8",
        name = "The House",
        words = listOf(
            VocabularyWord("La casa", "The house"),
            VocabularyWord("La camera", "The room"),
            VocabularyWord("La cucina", "The kitchen"),
            VocabularyWord("Il bagno", "The bathroom"),
            VocabularyWord("Il letto", "The bed"),
            VocabularyWord("La tavola", "The table"),
            VocabularyWord("La sedia", "The chair"),
            VocabularyWord("La finestra", "The window"),
            VocabularyWord("La porta", "The door"),
            VocabularyWord("Il giardino", "The garden")
        )
    ),
    VocabularySet(
        id = "it-9",
        name = "Clothes",
        words = listOf(
            VocabularyWord("Vestiti", "Clothes"),
            VocabularyWord("Camicia", "Shirt"),
            VocabularyWord("Pantaloni", "Trousers"),
            VocabularyWord("Gonna", "Skirt"),
            VocabularyWord("Vestito", "Dress"),
            VocabularyWord("Scarpe", "Shoes"),
            VocabularyWord("Calze", "Socks"),
            VocabularyWord("Giacca", "Jacket"),
            VocabularyWord("Cappello", "Hat"),
            VocabularyWord("Cappotto", "Coat")
        )
    ),
    VocabularySet(
        id = "it-10",
        name = "Animals",
        words = listOf(
            VocabularyWord("Cane", "Dog"),
            VocabularyWord("Gatto", "Cat"),
            VocabularyWord("Cavallo", "Horse"),
            VocabularyWord("Uccello", "Bird"),
            VocabularyWord("Pesce", "Fish"),
            VocabularyWord("Topo", "Mouse"),
            VocabularyWord("Mucca", "Cow"),
            VocabularyWord("Maiale", "Pig"),
            VocabularyWord("Pecora", "Sheep"),
            VocabularyWord("Leone", "Lion")
        )
    )
)
