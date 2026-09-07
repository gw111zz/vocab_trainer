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
    ),
    VocabularySet(
        id = "it-possessive",
        name = "Possessive",
        words = listOf(
            VocabularyWord("mio", "my (masculine, singular)"),
            VocabularyWord("mia", "my (femanine, singular)"),
            VocabularyWord("miei", "my (masculine, plural)"),
            VocabularyWord("mie", "my (femanine, plural)"),
            VocabularyWord("tuo", "your (masculine, informal, singular)"),
            VocabularyWord("tua", "your (femanine, informal, singular)"),
            VocabularyWord("suo", "his/her (masculine, singular)"),
            VocabularyWord("sua", "his/her (femanine, singular)"),
            VocabularyWord("nostro", "our (masculine, singular)"),
            VocabularyWord("nostra", "our (femanine, singular)"),
            VocabularyWord("nostri", "our (masculine, plural)"),
            VocabularyWord("nostre", "our (femanine, plural)"),
            VocabularyWord("vostro", "your (masculine, formal, singular)"),
            VocabularyWord("vostra", "your (femanine, formal, singular)"),
            VocabularyWord("loro", "your (plural, formal)"),
            VocabularyWord("loro", "their")
        )
    ),
    VocabularySet(
        id = "it-possessive-examples",
        name = "Possessive examples",
        words = listOf(
            VocabularyWord("la mia macchina", "my car"),
            VocabularyWord("i miei libri", "my books"),
            VocabularyWord("il suo libro", "his book"),
            VocabularyWord("il suo vestito", "her dress"),
            VocabularyWord("il nostro gatto", "our cat"),
            VocabularyWord("il vostro giardino", "your (formal) garden"),
            VocabularyWord("le loro scarpe", "your (formal) shoes"),
            VocabularyWord("i miei libri", "my books"),
            VocabularyWord("le mie amiche", "my friends"),
            VocabularyWord("mio lavoro", "my workplace")
        )
    ),
    VocabularySet(
        id = "it-meal",
        name = "Talking about a meal",
        words = listOf(
            VocabularyWord("È molto gustoso", "It's very tasty"),
            VocabularyWord("È saporito", "It's flavorful"),
            VocabularyWord("Sono sazio/sa", "I'm full"),
            VocabularyWord("Mi è piaciuto", "I liked it"),
            VocabularyWord("È stato incredibile", "It was amazing"),
            VocabularyWord("Il cibo era eccellente", "The food was excellent"),
            VocabularyWord("L'atmosfera era accogliente", "The atmosphere was cozy")
        )
    ),
    VocabularySet(
        id = "it-weather",
        name = "Weather",
        words = listOf(
            VocabularyWord("domani farà caldo", "tomorrow it will be hot"),
            VocabularyWord("che tempo fa a Roma?", "what's the weather in Rome?"),
            VocabularyWord("fa caldo oggi", "it's hot today"),
            VocabularyWord("ventoso", "windy"),
            VocabularyWord("soleggiato", "sunny")
        )
    ),
    VocabularySet(
        id = "it-school",
        name = "School",
        words = listOf(
            VocabularyWord("il banco", "desk"),
            VocabularyWord("la sedia", "chair"),
            VocabularyWord("la lavagna", "board (i.e. whiteboard, blackboard)"),
            VocabularyWord("il cestino", "waste paper basket"),
            VocabularyWord("il quaderno", "notebook"),
            VocabularyWord("la classe", "class (not classroom)"),
            VocabularyWord("il libro", "book"),
            VocabularyWord("la mensa", "canteen"),
            VocabularyWord("la penna", "pen"),
            VocabularyWord("la matita", "pencil"),
            VocabularyWord("leggere", "to read"),
            VocabularyWord("scrivere", "to write"),
            VocabularyWord("imparare", "to learn"),
            VocabularyWord("parlare", "to speak"),
            VocabularyWord("contare", "to count"),
            VocabularyWord("cantare", "to sing")
        )
    ),
    VocabularySet(
        id = "it-writing-words",
        name = "Writing words",
        words = listOf(
            VocabularyWord("annotare", "to note / annotate"),
            VocabularyWord("il temperino", "pencil sharpener"),
            VocabularyWord("temperare", "to sharpen"),
            VocabularyWord("la colla", "glue"),
            VocabularyWord("incollare", "to glue"),
            VocabularyWord("colorare", "to colour in"),
            VocabularyWord("pennarello", "felt-tip pen"),
            VocabularyWord("la gomma", "rubber"),
            VocabularyWord("cancellare", "to erase"),
            VocabularyWord("disegnare", "to draw")
        )
    ),
    VocabularySet(
        id = "it-professions",
        name = "Professions",
        words = listOf(
            VocabularyWord("l’operaio, l’operaia", "manual labourer"),
            VocabularyWord("il commesso, la commessa", "sales assistant"),
            VocabularyWord("l’insegnante", "teacher"),
            VocabularyWord("l’infermiere, l’infermiera", "nurse"),
            VocabularyWord("il farmacista, la farmacista", "pharmacist"),
            VocabularyWord("lo studente, la studentessa", "student"),
            VocabularyWord("il cameriere, la cameriera", "waiter"),
            VocabularyWord("l’impiegato, la impiegata", "office worker"),
            VocabularyWord("il dottore, la dottoressa", "doctor"),
            VocabularyWord("il casalingo, la casalinga", "house husband, housewife"),
            VocabularyWord("l’attore, l’attrice", "actor/actress"),
            VocabularyWord("lo scrittore, la scrittrice", "writer"),
            VocabularyWord("il cantante, la cantante", "singer")
        )
    ),
    VocabularySet(
        id = "it-professions-2",
        name = "Professions 2",
        words = listOf(
            VocabularyWord("il panettiere", "baker"),
            VocabularyWord("il barbiere", "barber"),
            VocabularyWord("la parrucchiera", "hairdresser"),
            VocabularyWord("il giornalaio", "newsagent"),
            VocabularyWord("il giornalista", "journalist"),
            VocabularyWord("il tabaccaio", "tobacconist"),
            VocabularyWord("il meccanico", "mechanician"),
            VocabularyWord("l'elettricista", "electrician"),
            VocabularyWord("il medico", "doctor"),
            VocabularyWord("il veterinario", "vet"),
            VocabularyWord("il muratore", "bricklayer"),
            VocabularyWord("il fruttivendolo", "greengrocer"),
            VocabularyWord("il contadino", "farmer"),
            VocabularyWord("il libraio", "bookseller"),
            VocabularyWord("il macellaio", "butcher"),
            VocabularyWord("il falegname", "carpenter"),
            VocabularyWord("il pescivendolo", "fishmonger"),
            VocabularyWord("il gioielliere", "jeweler")
        )
    ),
    VocabularySet(
        id = "it-professions-3",
        name = "Professions 3",
        words = listOf(
            VocabularyWord("il fornaio", "baker"),
            VocabularyWord("il insegnante", "teacher"),
            VocabularyWord("il sindaco", "mayor"),
            VocabularyWord("il ospedale", "hospital"),
            VocabularyWord("il panificio", "bakery"),
            VocabularyWord("chi insegna a scuola?", "who teaches in a school?"),
            VocabularyWord("chi vende le aspirine?", "who sells aspirin?"),
            VocabularyWord("il commesso", "salesman"),
            VocabularyWord("l'impiegato", "employee / clerk"),
            VocabularyWord("l'uomo d'affari", "business man"),
            VocabularyWord("una grande azienda", "a big company")
        )
    ),
    VocabularySet(
        id = "it-professions-4",
        name = "Professions 4",
        words = listOf(
            VocabularyWord("l'ufficio", "office"),
            VocabularyWord("la fabbrica", "factory"),
            VocabularyWord("l'officina", "workshop"),
            VocabularyWord("il cantiere", "yard"),
            VocabularyWord("il pronto soccorso", "emergency room")
        )
    ),
    VocabularySet(
        id = "it-kitchen",
        name = "Kitchen",
        words = listOf(
            VocabularyWord("la forchetta", "fork"),
            VocabularyWord("il coltello", "knife"),
            VocabularyWord("il cucchiaio", "spoon"),
            VocabularyWord("il cucchiaino", "teaspoon"),
            VocabularyWord("il piatto", "plate"),
            VocabularyWord("il bicchiere", "glass"),
            VocabularyWord("la tazza", "cup"),
            VocabularyWord("la tazzina", "espresso cup"),
            VocabularyWord("la pentola", "pot"),
            VocabularyWord("la padella", "pan"),
            VocabularyWord("il tovagliolo", "napkin"),
            VocabularyWord("il frigorifero", "fridge"),
            VocabularyWord("il forno", "oven"),
            VocabularyWord("il bollitore", "kettle"),
            VocabularyWord("il lavandino", "sink")
        )
    ),
    VocabularySet(
        id = "it-furniture",
        name = "Furniture",
        words = listOf(
            VocabularyWord("il divano", "sofa"),
            VocabularyWord("la poltrona", "armchair"),
            VocabularyWord("il tavolo", "table"),
            VocabularyWord("la sedia", "chair"),
            VocabularyWord("il letto", "bed"),
            VocabularyWord("l'armadio", "wardrobe/closet"),
            VocabularyWord("la scrivania", "desk"),
            VocabularyWord("la libreria", "bookcase"),
            VocabularyWord("il comodino", "bedside table"),
            VocabularyWord("il cassettone", "chest of drawers"),
            VocabularyWord("lo specchio", "mirror"),
            VocabularyWord("la lampada", "lamp"),
            VocabularyWord("il tappeto", "rug/carpet"),
            VocabularyWord("le tende", "curtains"),
            VocabularyWord("lo scaffale", "shelf")
        )
    ),
    VocabularySet(
        id = "it-prepositions-di",
        name = "Prepositions - di",
        words = listOf(
            VocabularyWord("Un bicchiere di vino", "A glass of wine"),
            VocabularyWord("Una mappa di Firenze", "A map of Florence"),
            VocabularyWord("Un piatto di pasta", "A plate of pasta"),
            VocabularyWord("Questa pizza è di Matteo", "This is Matteo’s pizza"),
            VocabularyWord("Il passaporto è di Katie?", "Is it Katie's passport?")
        )
    ),
    VocabularySet(
        id = "it-prepositions-a",
        name = "Prepositions - a",
        words = listOf(
            VocabularyWord("Sono a casa", "I’m at home"),
            VocabularyWord("Andiamo a Roma", "We’re going to Rome"),
            VocabularyWord("Vado al supermercato", "I’m going to the supermarket"),
            VocabularyWord("Il nostro hotel è a Roma", "Our hotel is in Rome"),
            VocabularyWord("Siamo a Positano", "We’re in Positano"),
            VocabularyWord("A che ora comincia?", "What time does it start?"),
            VocabularyWord("Alle otto", "At eight")
        )
    )
)
