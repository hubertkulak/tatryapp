package com.example.tatryapp.data

import com.example.tatryapp.R

object DataProvider {
    val mountains =
        Mountains(
            id = 1,
            name = "Gęsia Szyja",
            difficulty = 5,
            distance = "12.8 km",
            time = "2h 15min",
            description = "Szczyt w reglowej części Tatr Wysokich. Jest najwyższy w grupie masywu o tej samej nazwie. Grupę Gęsiej Szyi od masywu Koszystej oddziela Rówień Waksmundzka. Dawniej nazwa Gęsia Szyja dotyczyła tylko wąskiego i wygiętego upłazu na wschodnim grzbiecie, od strony Rusinowej Polany. Jego kształt przypominał góralom gęsią szyję. Później nazwę tę zastosowano do całego masywu. Wierzchołkowa część grzbietu Gęsiej Szyi zbudowana jest z dolomitowych skałek wypiętrzonych na ok. 15 m (tzw. Waksmundzkie Skałki). Już z Rusinowej Polany, a także z drogi na szczyt i samego wierzchołka, można podziwiać szeroką panoramę Tatr od Tatr Bielskich przez Tatry Wysokie do Tatr Zachodnich. Z polany widoczne są Tatry Bielskie i Wysokie do Mięguszowieckich Szczytów. Panorama była propagowana przez Tytusa Chałubińskiego jako „widok na 100 szczytów i przełęczy” już w 1878 r.",
            mountainImageId = R.drawable.gesiaszyja,
            latitude = 49.1534,
            longitude = 20.0436,
            elevation = "1489 m",
            route = "Toporowa Cyrhla – Gęsią Szyja",
            type = "Wysokie"
    )

    val mountainList = listOf(
        mountains,
        Mountains(
            id = 2,
            name = "Żleb Kulczyńskiego",
            difficulty = 5,
            distance = "8,8 km",
            time = "4h 54 min",
            description = "Żleb opadający z Przełączki nad Dolinką Buczynową do Dolinki Koziej w polskich Tatrach Wysokich. Nazwa pochodzi od nazwiska przyrodnika Władysława Kulczyńskiego, który w 1893 r. wraz z przewodnikiem Szymonem Tatarem młodszym przeszedł nim jako pierwszy turysta. Nazwę żlebowi nadał Mariusz Zaruski w 1910 roku[2]. Obecnie żleb jest bardzo popularny ze względu na poprowadzony nim czarno znakowany szlak turystyczny łączący tę dolinkę ze szlakiem Orlej Perci.\n" +
                    "Tuż ponad Dolinką Kozią żleb jest podcięty bardzo stromym progiem. Miejsce to szlak turystyczny omija po prawej stronie (patrząc od dołu) przez Rysę Zaruskiego. Ścieżka prowadzi pod samą podstawę tej rysy (śnieg zalega tutaj bardzo długo, często jeszcze w lipcu), następnie skośnie po skałach, potem ubezpieczonym łańcuchami pionowym kominem i stromą rynną do Żlebu Kulczyńskiego, już powyżej stromego progu. Jest to najtrudniejszy odcinek na czarnym szlaku. Dalsza trasa Żlebem Kulczyńskiego jest nieco łatwiejsza, prowadzi po wielkich głazach i mniejszą nieco stromizną.",
            mountainImageId = R.drawable.zleb,
            latitude = 49.1316,
            longitude = 20.0148,
            elevation = "1313 m",
            route = "Kuźnice – Hala Gąsienicowa – Murowaniec – Czarny Staw Gąsienicowy – Zmarzły Staw – Kozia Dolinka – Żleb Kulczyńskiego" ,
            type = "Wysokie"
        ),
        Mountains(
            id = 3,
            name = "Kozi Wierch",
            difficulty = 5,
            distance = "20,7 km",
            time = "9h 04 min",
            description = "Kozi Wierch jest najwyższą górą o zauważalnej wybitności znajdującą się w całości na terenie Polski. Kozi Wierch wznosi się w długiej wschodniej grani Świnicy pomiędzy Doliną Gąsienicową a Doliną Pięciu Stawów Polskich, a dokładniej między dwiema dolinkami wiszącymi: Dolinką Kozią i Dolinką Pustą. Wzdłuż grani tej poprowadzono szlak turystyczny zwany Orlą Percią. Nazwa szczytu pochodzi od często pasących się na jej zboczach stad kozic, zwłaszcza na jego łagodniejszych, południowych stokach. Stosowana była ona od dawna przez pasterzy wypasających w Dolinie Pięciu Stawów Polskich, pasterze z Doliny Gąsienicowej nazywali ten szczyt natomiast Czarnymi Ścianami (nazwa ta została później przesunięta przez turystów na sąsiedni szczyt). W piśmiennictwie nazwa Kozi Wierch pojawiła się dopiero w 1851 r.",
            mountainImageId = R.drawable.koziwierch,
            latitude = 49.1305,
            longitude = 20.0142,
            elevation = "1528 m",
            route = "Palenica Białczańska – Wodogrzmoty Mickiewicza – Dolina Roztoki – Schronisko PTTK w Dolinie Pięciu Stawów Polskich – Kozi Wierch",
            type = "Wysokie"
        ),
        Mountains(
            id = 4,
            name = "Hala Gąsienicowa",
            difficulty = 5,
            distance = "12,2 km",
            time = "5h 02 min",
            description = "Hala Gąsienicowa – obecnie w potocznym rozumieniu jest to nazwa północnej części Doliny Gąsienicowej w Tatrach obejmującej Rówienki i otoczenie schroniska „Murowaniec”. Dojście z Kuźnic możliwe jest jednym z dwóch szlaków: przez Boczań i Skupniów Upłaz szlakiem niebieskim lub przez dolinę Jaworzynka szlakiem żółtym. Szlaki te łączą się na Przełęczy między Kopami, oba warianty zajmują tyle samo czasu. Dalej przez Królową Rówień i Rówienki – razem nieco ponad dwie godziny.Nazwa hali pochodzi od licznego w Zakopanem i okolicach góralskiego rodu Gąsieniców. W XVII w. byli jej właścicielami. Pierwotnie nazwa dotyczyła tylko hali pasterskiej i nie była pierwszą jej nazwą. Miejscowi nazywali ją halą Stawów, zaś wypasających na niej nazywano stawianami. W dokumentach z I połowy XIX wieku, zwłaszcza austriackich, zwana była Doliną Siedmiu Stawów, rzadziej Doliną Pięciu Stawów. Zofia Hołub-Pacewiczowa pisała: Dla Hali Gąsienicowej dopiero w nowszych czasach utarła się nazwa w tej formie. Później od nazwy hali nazwano dolinę i liczne na niej obiekty.",
            mountainImageId = R.drawable.halagasienicowa,
            latitude = 49.1339,
            longitude = 20.0026,
            elevation = "798 m",
            route = "Kuźnice – Boczań – Przełęcz między Kopami (Karczmisko) – Betlejemka – Schronisko PTTK Murowaniec – Czarny Staw Gąsienicowy – Dolina Jaworzynki – Kuźnice",
            type = "Wysokie"
        ),
        Mountains(
            id = 5,
            name = "Rysy",
            difficulty = 5,
            distance = "25,5 km",
            time = "11 h 42 min",
            description = "Góra zlokalizowana na granicy polsko-słowackiej, w Tatrach Wysokich (jednej z części Tatr). Ma trzy wierzchołki, z których najwyższy jest środkowy (2501 m n.p.m.), znajdujący się w całości na terytorium Słowacji. Wierzchołek północno-zachodni, przez który biegnie granica, stanowi najwyżej położony punkt Polski (według większości najbardziej wiarygodnych źródeł 2499 m – więcej informacji w sekcji „Topografia”) i należy do Korony Europy. Masyw Rysów posiada trzy wierzchołki. Na granicy polsko-słowackiej znajduje się średni co do wysokości wierzchołek północno-zachodni, którego różne pomiary dały wysokość od 2498,7 do 2499,6 m[2] (zgodną z tradycyjnie uznawaną wartością 2499 m[3]). Wierzchołek ten jest najwyżej położonym punktem Polski. Spośród klasycznych pomiarów geodezyjnych wykonanych dla tego wierzchołka najdokładniejsze przeprowadzono w 1988 r., kiedy metodą precyzyjnej niwelacji trygonometrycznej wyznaczono, niezależnie od strony polskiej oraz słowackiej, wysokość punktu geodezyjnego zlokalizowanego 60 cm poniżej szczytu. Otrzymano wynik 2498,712 m od strony polskiej i 2498,724 m od strony słowackiej (różnica jedynie 1,2 cm) – a więc wysokość północno-zachodniego wierzchołka Rysów wynoszącą (po zaokrągleniu do 0,1 m) 2499,3 m.",
            mountainImageId = R.drawable.rysy,
            latitude = 49.1045,
            longitude = 20.0518,
            elevation = "1844 m",
            route = "Palenica Białczańska – Morskie Oko – Czarny Staw – Bula pod Rysami – Rysy i powrót do Palenicy Białczańskiej",
            type = "Wysokie"
        ),

        Mountains(
            id = 6,
            name = "Szpiglasowy Wierch",
            difficulty = 5,
            distance = "23,5 km",
            time = "9h 16 min",
            description = "Nazwa pochodzi od spolszczonego niemieckiego słowa Spiessglas lub Spiessglanz oznaczających antymonit. Rudę tę dawniej wydobywano w kopalni Szpiglas założonej w drugiej połowie XVIII wieku. Pisał o niej Ładowski w 1783 r. Były też Szpiglasowe Perci i od nich pochodzi nazwa Szpiglasowej Przełęczy. Nazwę Szpiglasowy Wierch wprowadził Witold Henryk Paryski w 1951 r. Wcześniej szczyt ten nazywano Hrubym Wierchem, Grubym, Liptowskimi Murami, Miedzianym. Co prawda Maria Steczkowska w 1856 r. podawała nazwę Szpiglas, ale w odniesieniu do Cubryny.Nazwa niemiecka i węgierska są przekładem dawnej nazwy polskiej Liptowskie Mury. Szpiglasowy Wierch to szeroki masyw o kilku wierzchołkach. Zwornikiem jest najwyższy. Środkowy wierzchołek, położony w grani głównej kilkanaście metrów na południowy wschód, jest minimalnie niższy i oddzielony od głównego płytkim siodełkiem. Nieco dalej w stronę Wrót Chałubińskiego wznosi się wierzchołek południowy, a na zachód od głównej kulminacji (w stronę Czarnej Ławki) – wierzchołek zachodni. Wierzchołek wschodni jako jedyny nie leży w głównej grani, jest on kulminacją południowo-wschodniej ściany, opadającej do Doliny za Mnichem. Północna ściana Szpiglasowego Wierchu wznosi się nad Doliną Pięciu Stawów Polskich, południowo-zachodnie zbocza szczytu opadają natomiast do Doliny Ciemnosmreczyńskiej (Temnosmrečinská dolina), górnego piętra Doliny Koprowej po stronie Słowacji.",
            mountainImageId = R.drawable.szpiglasowy,
            latitude = 49.1150,
            longitude = 20.0224,
            elevation = "1453 m",
            route = "Palenica Białczańska – Wodogrzmoty Mickiewicza – Dolina Roztoki –  Dolina Pięciu Stawów – Szpiglasowa Przełęcz – Szpiglasowy Wierch – Morskie Oko – Droga Oswalda Balzera – Palenica Białczańska",
            type = "Wysokie"
        ),
        Mountains(
            id = 7,
            name = "Kościelec",
            difficulty = 5,
            distance = "16,3 km",
            time = "7h 39 min",
            description = "Szczyt w Dolinie Gąsienicowej w Tatrach Wysokich. Znajduje się w bocznej Grani Kościelców, która od Zawratowej Turni odbiega w północnym kierunku, dzieląc Dolinę Gąsienicową na Czarną i Zieloną. Nazwa szczytu wywodzi się prawdopodobnie od kształtu przypominającego wieżę kościoła. Jego sylwetka w kształcie stromej piramidy to bardzo charakterystyczny element panoramy Doliny Gąsienicowej. Kościelec zbudowany jest z zapadających na północną stronę ławic granitu o grubości prawie 100 m, tworzących połogi i stromy cios. Ciekawa flora. M.in. stwierdzono tutaj występowanie saussurei wielkogłowej – bardzo rzadkiej rośliny, w Polsce występującej tylko w Tatrach i to w nielicznych tylko miejscach. Tutaj też znajduje się najwyższe w polskich Tatrach stanowisko drzewiastej formy świerka. Na szczyt prowadzi czarny szlak turystyczny z przełęczy Karb. Z przełęczy szlak biegnie zakosami blisko lewej krawędzi płytowego stoku o nachyleniu ok. 30° aż do pionowego skalnego progu o wysokości około siedmiu metrów. Przez ów próg, bez klamer i łańcuchów, w górę i dalej na wierzchołek, zakosami poprzez mniejsze progi, których przejście ułatwiają półki i rynny skalne.",
            mountainImageId = R.drawable.koscielec,
            latitude = 49.1331,
            longitude = 20.0052,
            elevation = "1374 m",
            route = "Kuźnice – Boczań – Przełęcz między Kopami –  PTTK Murowaniec – Czarny Staw Gąsienicowy – Karb – Kościelec – Karb  – Pod Murowańcem – Karczmisko – Dolina Jaworzynka",
            type = "Wysokie"
        ),
    )


    val mountainsZach =
        Mountains(
            id = 1,
            name = "Sarnia Skała",
            difficulty = 5,
            distance = "8,7 km",
            time = "3h 43 min",
            description = "Szczyt w pasie reglowym Tatr Zachodnich, między Doliną Białego a Doliną Strążyską. Sarnia Skała tworzy skalistą grań o długości około 300 m i przebiegu równoleżnikowym. Na południu Czerwona Przełęcz (1300 m) oddziela ją od Suchego Wierchu (1539 m). Ku północy od Sarniej Skały odbiegają dwa grzbiety tworzące obramowanie dla dwóch dolin reglowych znajdujących się poniżej Sarniej Skały: doliny Spadowiec i Doliny ku Dziurze. Obydwa ramiona noszą nazwę Spaleniec. Sarnia Skała zbudowana jest z wapieni dolomitowych. Pod jej skalistymi ścianami znajduje się niewielka, zarastająca kosodrzewiną polana. Dawniej Sarnią Skałę nazywano Małą Świnicą, Świniczką lub Świnią Skałą i była ona intensywnie penetrowana przez poszukiwaczy skarbów (na skałach zachowały się do tej pory wyryte przez nich znaki).\n" +
                    "Sarnia Skała jest w sezonie turystycznym zwykle masowo oblegana przez turystów. Z jej szczytu jest doskonały widok na masyw Giewontu, a w drugą stronę na Zakopane.",
            mountainImageId = R.drawable.sarniaskala,
            latitude = 49.1552,
            longitude = 19.5629,
            elevation = "614 m",
            route = "Dolina Białego – Czerwona Przełęcz – Sarnia Skała – Czerwona Przełęcz – Siklawica – Dolina Strążyska",
            type = "Zachodnie"
        )

    val mountainListZach = listOf(
        mountainsZach,
        Mountains(
            id = 2,
            name = "Czerwone Wierchy",
            difficulty = 1,
            distance = "17,5 km",
            time = "8h 55 min",
            description = "Masyw górski znajdujący się w ciągu głównego grzbietu Tatr Zachodnich. Biegnie nim granica polsko-słowacka. Położony jest nad trzema dolinami walnymi: Cichą, Kościeliską, Doliną Bystrej i ich odnogami: Tomanową, Tomanową Liptowską, Kondratową, Małej Łąki, Miętusią. Z odsłoniętych na całej długości grzbietów i szczytów Czerwonych Wierchów roztaczają się rozległe widoki. Tereny te są stosunkowo łatwo dostępne i w sezonie letnim nie stwarzają dla turysty problemów technicznych. Już Eugeniusz Janota polecał Czerwone Wierchy jako właściwy cel wycieczek dla osób niedoświadczonych lub słabych fizycznie; według legendy Józef Stolarczyk miał przejechać ich granią na rowerze, co wydaje się zupełnie nieprawdopodobne, ponieważ w owych czasach ten sposób komunikacji był jeszcze prawie nieznany, a grań ta jest jednak stanowczo zbyt stroma i byłoby to skrajnie niebezpieczne. Z punktu widzenia pieszego Czerwone Wierchy są trawiaste, łagodne i zaokrąglone, natomiast poniżej zbocza przeważnie kończą się stromo podciętymi, kilkusetmetrowymi urwiskami, co było przyczyną licznych wypadków wśród turystów.",
            mountainImageId = R.drawable.czerwonewierchy,
            latitude = 49.1351,
            longitude = 19.5411,
            elevation = "1487 m",
            route = "Kiry - Ciemniak - Małołączniak - Kondracka Kopa - Kiry",
            type = "Zachodnie"
        ),
        Mountains(
            id = 3,
            name = "Starorobociański Wierch",
            difficulty = 4,
            distance = "24,3 km",
            time = "10h 22 min",
            description = "Najwyższy szczyt w polskiej części Tatr Zachodnich i jeden z najwyższych szczytów Tatr Zachodnich. Starorobociański Wierch leży w grani głównej Tatr, którą biegnie granica polsko-słowacka. Od sąsiedniego w tej grani na zachód szczytu Kończystego Wierchu oddzielony jest Starorobociańską Przełęczą (1963 m). Od wschodu sąsiaduje z nim niewybitny szczyt zwany Siwym Zwornikiem, oddzielony od niego Gaborową Przełęczą. Starorobociański Wierch góruje ponad dolinami: Starorobociańską, Zadnią Raczkową i Gaborową. Jego wierzchołek to krótka grań o przebiegu południkowym, która jak klin wciska się pomiędzy Dolinę Gaborową i Raczkową (stąd też pochodzi słowacka nazwa tej góry – Klin). W grani głównej pomiędzy Starorobociańskim Wierchem a Starorobociańską Przełęczą znajduje się niewysoki, nienazwany wierzchołek. Pomiędzy nim a Kończystym Wierchem grań rozcięta jest długim na kilkaset metrów rowem grzbietowym kilkumetrowej głębokości.\n",
            mountainImageId = R.drawable.starobocianskiwierch,
            latitude = 49.1157,
            longitude = 19.4911,
            elevation = " 1675 m ",
            route = "Kiry - Schronisko PTTK na Hali Ornak -Starorobociański Wierch -Siwa Polana - Dolina Chochołowska",
            type = "Zachodnie"
        ),
        Mountains(
            id = 4,
            name = "Nosal",
            difficulty = 5,
            distance = "3 km",
            time = "1h 18min",
            description = "Szczyt reglowy w Tatrach Zachodnich nad Kuźnicami, między Doliną Bystrej a Doliną Olczyską. Nazwa góry pochodzi od przypominających nos skał od północno-zachodniej strony. Stanowi zakończenie północno-wschodniej grani Kasprowego Wierchu. Północnymi podnóżami przebiega granica między Tatrami a Rowem Podtatrzańskim (jego częścią zwaną Rowem Zakopiańskim). Od południa Nosalowa Przełęcz oddziela go od zalesionego Nieboraka. Na północ Nosal tworzy trójkątny stok z wierzchołkiem na szczycie i podstawą tworzącą północną granicę Tatr. Obydwa ramiona tego stoku (północno-zachodnie i południowo-wschodnie) podcięte są pasem stromych skał. Największe ściany, o wysokości dochodzącej do 50 m, są pod ramieniem północno-zachodnim, opadającym do Doliny Bystrej. Pod grzbietem północno-wschodnim jest mniejszy pas skał opadający do Doliny Olczyskiej. Najwybitniejszą skałą jest tam Pióro. Zbudowany jest wyłącznie ze skał osadowych – wapieni i dolomitów ze środkowego triasu. Poza tym jest całkowicie porośnięty lasem, który mimo bliskości osad ludzkich jest w dobrym stanie. Oprócz pospolitego w Tatrach świerka rosną buki, sosny zwyczajne oraz sztucznie wprowadzona sosna czarna.",
            mountainImageId = R.drawable.nosal,
            latitude = 49.1635,
            longitude = 19.5922,
            elevation = "309 m",
            route = "Murowanica – Kuźnicka Polana – Nosal – Przełęcz Nosalowa – Kuźnicka Polana",
            type = "Zachodnie"
        ),
        Mountains(
            id = 5,
            name = "Giewont",
            difficulty = 5,
            distance = "5,9 km",
            time = "3h 21 min",
            description = "Masyw górski w Tatrach Zachodnich o wysokości 1895 m n.p.m.i długości 2,7 km. Jego główny wierzchołek, Wielki Giewont, jest zazwyczaj uznawany za najwyższy szczyt Tatr Zachodnich położony w całości na terenie Polski; choć wyższa jest Twarda Kopa w Czerwonych Wierchach, pomija się ją ze względu na niewielką wybitność. Masyw Giewontu położony jest między Doliną Bystrej, Doliną Kondratową, Doliną Małej Łąki i Doliną Strążyską. Góruje nad Zakopanem i jest z niego znakomicie widoczny. Od strony północnej Giewont jest stromy i trudno dostępny, zbocza południowe są łagodniejsze. Szczyt znajduje się w północnej grani Kopy Kondrackiej. Masyw Giewontu złożony jest z trzech części: Wielkiego Giewontu (1895 m), Małego Giewontu (1739 m) i Długiego Giewontu (1868 m). Pomiędzy Wielkim a Małym Giewontem znajduje się Giewoncka Przełęcz (1709 m), z której opada cieszący się złą sławą (ponieważ zginęło w nim wielu turystów, którzy zboczyli ze szlaku celem skrócenia drogi powrotnej) Żleb Kirkora. Do roku 2003 zginęło w ten sposób ponad 20 turystów. Wielki Giewont ma północną ścianę o wysokości względnej około 600 m. W kierunku południowym zbocza Wielkiego Giewontu opadają do Kondrackiej Przełęczy. Długi Giewont ma ok. 1,3 km długości.",
            mountainImageId = R.drawable.giewont,
            latitude = 49.1503,
            longitude = 19.5602,
            elevation = "909 m",
            route = "Kuźnice – Kalatówki – Hala Kondratowa – Kondracka Przełęcz – Wyżnia Kondracka Przełęcz – Giewont",
            type = "Zachodnie"
        ),
        Mountains(
            id = 6,
            name = "Rohacze",
            difficulty = 5,
            distance = "17,9 km",
            time = "10h 14 min",
            description = "Dwa wybitne, skaliste szczyty w grani głównej Tatr Zachodnich, położone ponad dolinami: Smutną, Żarską i Jamnicką. Swoim wyglądem bardziej przypominają szczyty Tatr Wysokich niż Tatr Zachodnich. Wyższym z Rohaczy jest Rohacz Płaczliwy, który ma wysokość 2126 m n.p.m. Niższy – Rohacz Ostry – ma 2086 m n.p.m. Rozdzielone są Rohacką Przełęczą (1962 m). W północnym kierunku do Doliny Smutnej opadają bardzo stromymi ścianami o względnej wysokości 200–250 m. Od Rohacza Płaczliwego odbiega w południowym kierunku boczny grzbiet, który poprzez Żarską Przełęcz łączy się z Barańcem.Według niektórych topografów nazwą Rohacze określane jest całe pasmo górskie od Rohacza Ostrego aż po Zuberski Wierch, obejmujące takie szczyty, jak: Zuberski Wierch, Brestowa Kopa, Brestowa, Salatyński Wierch, Mały Salatyn, Spalona Kopa, Pachoł, Banówka, Hruba Kopa, Trzy Kopy, Rohacz Płaczliwy, Rohacz Ostry.",
            mountainImageId = R.drawable.rohacze,
            latitude = 49.1150,
            longitude = 19.4453,
            elevation = "1458 m",
            route = "Tatliakova Chata - Rakoń– Wołowiec - Rohacze",
            type = "Zachodnie"
        ),
        Mountains(
            id = 7,
            name = "Wodospad Siklawica",
            difficulty = 5,
            distance = "4,8 km",
            time = "1h 42 min",
            description = "Wodospad w Tatrach Zachodnich, w górnej części Doliny Strążyskiej (według kryteriów ściśle geograficznych już na obszarze Małej Dolinki), pod północną ścianą Giewontu. Wodospad opada z dwóch prawie pionowo nachylonych ścian (pod kątem 80°). Jest to wodospad dwuczęściowy.Wysokość dolnej części wynosi 12 m, górnej również 12 m. W niewielkiej odległości nad górą częścią jest jeszcze trzecia część o wysokości 9 m. Pomiędzy górną i dolną jego częścią istnieje skalna półka, w której w skale wymyte zostało siłą uderzenia wody i niesionych przez nią odłamków skalnych wgłębienie wypełnione wodą, tzw. kocioł eworsyjny. Nazwa wodospadu pochodzi od Siklawy w Dolinie Pięciu Stawów Polskich. Dawniej nazywany był także Siczącą, Siczawą, Siklawą. Był odwiedzany od samych początków turystyki w Tatrach. Ludwik Zejszner w 1849 r. pisał o nim: „...godzien ze wszech miar widzenia”. Wodospad znajduje się w jednym z dwóch górnych odgałęzień Doliny Strążyskiej zwanym Małą Dolinką, którym – i dalej bardzo stromym żlebem Warzecha – niegdyś prowadziła najkrótsza ścieżka turystyczna z Zakopanego na Giewont.",
            mountainImageId = R.drawable.siklawica,
            latitude = 49.1503,
            longitude = 19.5602,
            elevation = "230 m",
            route = "Dolina Strążyska - Polana Strążyska - Siklawica",
            type = "Zachodnie"
        ),

    )

    val mountainsDoliny =
        Mountains(
            id = 1,
            name = "Dolina Strążyska",
            difficulty = 1,
            distance = "4,8 km",
            time = "1h 42 min",
            description = "Dolina w polskich Tatrach Zachodnich, położona pomiędzy Doliną ku Dziurze a Doliną za Bramką. Właściwa nazwa doliny pochodzi od słowa strąga, w gwarze podhalańskiej oznaczającego rodzaj zagrody przeznaczonej do dojenia owiec. Wylot doliny znajduje się na wysokości 900 m przy Drodze pod Reglami, na przedłużeniu zakopiańskiej ul. Strążyskiej, a sama dolina prowadzi aż do ścian masywu Giewontu ograniczającego ją od południowej strony. Zachodnie obramowanie doliny tworzą Grzybowiec i Łysanki z Samkową Czubą, wschodnie odchodzący od Juhaskiej Kopy w Długim Giewoncie skalny filar, dalej grzbiet od Wyżniej Suchej Przełęczy do Niżniej Suchej Przełęczy, Suchy Wierch, Sarnia Skała i jej grzbiet Grześkówki. Grzbiet Styrżnika dzieli górną część Doliny Strążyskiej na dwie mniejsze dolinki stanowiące jej górne piętro: wschodnią Dolinę Wielkiej Równi i zachodnią Małą Dolinkę. Główna część doliny posiada jeszcze kilka bocznych odgałęzień: Samkowy Żleb, Dolina Grzybowiecka, Koński Żleb i Sarni Żleb.",
            mountainImageId = R.drawable.dolinastrazyska,
            latitude = 49.1613,
            longitude = 19.5557,
            elevation = "194 m",
            route = "Polana Strążyska - Dolina Strążyska",
            type = "Doliny"
        )

    val mountainListDoliny = listOf(
        mountainsDoliny,
        Mountains(
            id = 2,
            name = "Dolina Małej Łąki",
            difficulty = 1,
            distance = "2,2 km",
            time = "1h",
            description = "Dolina walna w polskich Tatrach Zachodnich, położona pomiędzy Doliną Bystrej i Doliną Kościeliską. Ma długość 5,4 km i powierzchnię ok. 5,7 km². Jest najmniejszą z walnych dolin tatrzańskich. Wylot znajduje się na wysokości około 930 m po wschodniej stronie Gronika. Górą dolina podchodzi pod główną grań Czerwonych Wierchów na odcinku od Kopy Kondrackiej po Małołączniaka. Orograficznie prawe ograniczenie doliny tworzy północna grań Kopy Kondrackiej po Giewont, dalej Mały Giewont, Grzybowiec i północno-zachodni grzbiet Łysanek. Lewe zbocza doliny tworzy Czerwony Grzbiet Małołączniaka, Wielka Turnia, Skoruśniak i Hruby Regiel. Dolina Małej Łąki nie ma żadnych bocznych odgałęzień, a jedynie żleby. Największe ze żlebów przecinających jej zbocza to: Dolinka pod Grzybowiec, Głazisty Żleb, Zagon, Uwieziony Żleb, Gmiński Żleb.",
            mountainImageId = R.drawable.dolinamalejlaki,
            latitude = 49.1532,
            longitude = 19.5418,
            elevation = "238 m",
            route = "Gronik - Dolina Małej Łąki",
            type = "Doliny"
        ),
        Mountains(
            id = 3,
            name = "Dolina Białego",
            difficulty = 4,
            distance = "1.7 km",
            time = "44 min",
            description = "Dolina reglowa w Tatrach Zachodnich, położona pomiędzy grzbietami Krokwi i Sarniej Skały. Dolina ma długość 2,5 km i powierzchnię 300 ha. Ograniczona jest:\n" +
                    "* od zachodu grzbietem wyrastającym spod ściany Długiego Giewontu, w którym znajdują się Wyżnia Sucha Przełęcz, Sucha Czubka, Niżnia Sucha Przełęcz, Suchy Wierch, Czerwona Przełęcz i Sarnia Skała; następnie północno-wschodnim grzbietem Sarniej Skały z wzniesieniami Zawieszki, Łomika i Kopy nad Białym,\n" +
                    "* od południa i południowego wschodu częścią grani Długiego Giewontu, od Juhaskiej Kopy przez Wyżnie Wrótka i Turnię nad Białem po Wrótka, a następnie Kalacką Kopą, Białym Grzbietem, Wyżnią i Niżnią Przełęczą Białego,\n" +
                    "* od wschodu Małą Krokwią, Siwarowym Siodłem, Krokwią i jej północno-zachodnim ramieniem.\n.",
            mountainImageId = R.drawable.dolinabialego,
            latitude = 49.1613,
            longitude = 19.5720,
            elevation = "150 m",
            route = "- Dolina Białego",
            type = "Doliny"
        ),
        Mountains(
            id = 4,
            name = "Dolina Pięciu Stawów Polskich",
            difficulty = 5,
            distance = "16 km",
            time = "5h 30 min",
            description = "Dolina w polskich Tatrach Wysokich. Pierwotna, ludowego pochodzenia nazwa doliny to Pięciostawy. W początkach turystyki tatrzańskiej wprowadzono nazwę Dolina Pięciu Stawów. Okazała się myląca, gdyż w słowackich Tatrach jest druga dolina o tej samej nazwie. Dla odróżnienia tych dolin uzupełniono więc obydwie nazwy i obecnie jest Dolina Pięciu Stawów Polskich i Dolina Pięciu Stawów Spiskich. Nazwy są trochę przydługie, w potocznym języku polskich i słowackich bywalców Tatr używa się nazw „Pięć Stawów” i „Pięć Spiskich”. Nazwa obydwu dolin pochodzi od znajdujących się w nich jezior (w Tatrach zwanych stawami), ale w rzeczywistości zarówno po polskiej, jak i słowackiej stronie Tatr w dolinach tych jest nie pięć, ale sześć stawów. Najprawdopodobniej po polskiej stronie najmniejszy z nich (Wole Oko) uznano za niegodny nazwy stawu.",
            mountainImageId = R.drawable.dolinapieciustawow,
            latitude = 49.1234,
            longitude = 20.0212,
            elevation = "803 m",
            route = "Palenica Białczańska – Wodogrzmoty Mickiewicza – Dolina Roztoki – Siklawa – Schronisko PTTK w Dolinie Pięciu Stawów Polskich",
            type = "Doliny"
        ),
        Mountains(
            id = 5,
            name = "Dolina Chochołowska",
            difficulty = 5,
            distance = "14.9 km",
            time = "4h 20min",
            description = "Najdłuższa i największa dolina w polskich Tatrach, znajdująca się na zachodnim skraju polskich Tatr Zachodnich i stanowiąca orograficznie lewą odnogę doliny Czarnego Dunajca. Zajmuje obszar ponad 35 km² i ma długość ok. 10 km. Jest doliną walną. Administracyjnie leży na terenie wsi Witów.  W dolnej części, o długości ok. 4 km tworzy głęboki wąwóz, na którym podobnie jak w Dolinie Kościeliskiej występują przewężenia, zwane bramami. Są dwa takie przewężenia: Niżnia Brama Chochołowska i Wyżnia Brama Chochołowska. Górna część doliny rozdziela się na trzy główne ramiona: Dolinę Starorobociańską, Dolinę Chochołowską Wyżnią i Dolinę Jarząbczą. Oprócz tych głównych odgałęzień Dolina Chochołowska posiada jeszcze wiele mniejszych dolin: Mała Sucha Dolina, Wielka Sucha Dolina, Dolina Huciańska, Dudowa, Trzydniowiańska, Głębowiec, Długa, Kryta, Wielkie Koryciska, Małe Koryciska oraz wiele żlebów. Dolina Chochołowska zbudowana jest z dwóch głównych rodzajów skał. ",
            mountainImageId = R.drawable.dolinachocholowska,
            latitude = 49.1440,
            longitude = 19.4842,
            elevation = "1489m",
            route = "Siwa Polana - Polana Chochołowska - Schronisko PTTK na Polanie Chochołowskiej",
            type = "Doliny"
        ),
        Mountains(
            id = 6,
            name = "Dolina Kościeliska",
            difficulty = 1,
            distance = "5.6 km",
            time = "1h 34min",
            description = "Dolina walna, tj. sięgająca od podnóża Tatr do głównego grzbietu – grani głównej Tatr. Jest orograficznie prawą odnogą doliny Czarnego Dunajca, do której uchodzi w Kirach. Jest drugą co do wielkości doliną polskich Tatr (po Dolinie Chochołowskiej) i najbardziej atrakcyjną pod względem ilości wapiennych form skalnych, wąwozów, jaskiń, a także historii. Jest też jednym z najczęściej przez turystów odwiedzanych miejsc w Tatrach. Znajduje się w Tatrach Zachodnich. Ma ok. 9 km długości, obwód ok. 27 km, a powierzchnię ok. 35 km². Od zachodu jej obramowanie tworzy północna grań Siwego Zwornika po Przednią Kopkę, od południa grań główna na odcinku od Siwego Zwornika po Małołączniak, od wschodu północno-zachodnia grań Małołączniaka po Mały Regiel. Wylotem doliny biegnie wyraźna granica między Tatrami i Rowem Podtatrzańskim oraz Podhalem. Północną fizycznogeograficzną granicę Doliny Kościeliskiej tworzy Droga pod Reglami.",
            mountainImageId = R.drawable.dolinakoscieliska,
            latitude = 49.1514,
            longitude = 19.5200,
            elevation = "267 m",
            route = "Cudakowa Polana - Polana Pisana - Dolina Kościeliska - szlak do Mylnej Jaskini",
            type = "Doliny",

        ),
        Mountains(
            id = 7,
            name = "Jaskinia Raptawicka",
            difficulty = 1,
            distance = "0.3 km",
            time = "15 min",
            description = "Jaskinia w Dolinie Kościeliskiej w Tatrach. Wraz z Jaskinią Mylną i Jaskinią Obłazkową stanowi system Jaskiń Pawlikowskiego. Ścieżka prowadząca do niej jest w odległości 4,4 km od Kir, 100 m powyżej Skały Pisanej, w Raptawickiej Turni, po zachodniej stronie doliny. Otwór jaskini, położony ok. 180 m powyżej koryta Kościeliskiego Potoku (1146 m n.p.m.), widoczny jest z drogi prowadzącej dnem doliny. Jaskinię można zwiedzać samodzielnie, bez przewodnika. Wewnątrz panuje niska temperatura. Główny wejściowy otwór ma średnicę ok. 3 m. Prowadzi od niego zejście pionowym 4-metrowym progiem po stalowej drabinie do głównej komory. Jest to pojedyncza, duża sala o wysokości 10–15 m i rozmiarach 10 × 40 m. W jej stropie znajdują się otwory dwóch małych studzienek. Od sali prowadzi kilka bocznych korytarzy.",
            mountainImageId = R.drawable.jaskiniaraptawicka,
            latitude = 49.1423,
            longitude = 19.5144,
            elevation = "75 m",
            route = " Mylna Dolina - Jaskinia Raptawicka",
            type = "Doliny"
        ),
    )
}
