package com.istekno.imotv_movietvshow.utils

import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.data.TVShowEntity

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(MovieEntity(
            "mv1",
            "A Star Is Born",
            "2018",
            "USA",
            7.5,
            "English",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "2h 16m",
            listOf("Drama", "Romance", "Music"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg"
        ))

        movie.add(MovieEntity(
            "mv2",
            "Alita: Battle Angel",
            "2019",
            "USA",
            7.2,
            "English",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            "2h 2m",
            listOf("Action", "Sci-Fi", "Adventure"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qpEKv8WxTiiPq9t9JWvwatbEQle.jpg"
        ))

        movie.add(MovieEntity(
            "mv3",
            "Aquaman",
            "2018",
            "USA",
            6.9,
            "English",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "2h 23m",
            listOf("Action", "Fantasy", "Adventure"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
        ))

        movie.add(MovieEntity(
            "mv4",
            "Bohemian Rhapsody",
            "2018",
            "USA",
            8.0,
            "English",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "2h 15m",
            listOf("Music", "Drama", "History"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
        ))

        movie.add(MovieEntity(
            "mv5",
            "Creed II",
            "2018",
            "USA",
            6.9,
            "English",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "2h 10m",
            listOf("Drama"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg"
        ))

        movie.add(MovieEntity(
            "mv6",
            "Fantastic Beasts: The Crimes of Grindelwald",
            "2018",
            "USA",
            6.9,
            "English",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "2h 14m",
            listOf("Adventure", "Fantasy", "Drama"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u5QrKhSCGoFsB8aAvZZJ1b53k16.jpg"
        ))

        movie.add(MovieEntity(
            "mv7",
            "Glass",
            "2019",
            "USA",
            6.6,
            "English",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "2h 9m",
            listOf("Thriller", "Sci-Fi", "Drama"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg"
        ))

        movie.add(MovieEntity(
            "mv8",
            "How to Train Your Dragon: The Hidden World",
            "2019",
            "USA",
            7.8,
            "English",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "1h 44m",
            listOf("Animation", "Family", "Adventure"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg"
        ))

        movie.add(MovieEntity(
            "mv9",
            "Master Z: Ip Man Legacy",
            "2018",
            "Taiwan",
            5.7,
            "Cantonese",
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            "1h 47m",
            listOf("Action"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7Hy0qn054TBkapuCutQKeebaGJE.jpg"
        ))

        movie.add(MovieEntity(
            "mv10",
            "Ralph Breaks the Internet",
            "2018",
            "USA",
            7.2,
            "English",
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "1h 52m",
            listOf("Family", "Animation", "Comedy", "Adventure"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/h5XilerWmJbM5kiBtWML8vvHbkH.jpg"
        ))

        return movie
    }

    fun generateDummyTVShow(): List<TVShowEntity> {

        val show = ArrayList<TVShowEntity>()

        show.add(TVShowEntity(
            "tvs1",
            "Arrow",
            "2012",
            6.6,
            "English",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "42m",
            listOf("Crime", "Drama", "Mystery", "Action", "Adventure"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
        ))

        show.add(TVShowEntity(
            "tvs2",
            "Doom Patrol",
            "2019",
            7.6,
            "English",
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            "49m",
            listOf("Sci-Fi", "Fantasy", "Action", "Adventure", "Comedy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg"
        ))

        show.add(TVShowEntity(
            "tvs3",
            "Family Guy",
            "1999",
            6.9,
            "English",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "22m",
            listOf("Animation", "Comedy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2APPMURkiSgg0uOttDn4nqDjxjd.jpg"
        ))

        show.add(TVShowEntity(
            "tvs4",
            "Flash",
            "2014",
            7.6,
            "English",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "44m",
            listOf("Drama", "Sci-Fi", "Fantasy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg"
        ))

        show.add(TVShowEntity(
            "tvs5",
            "Grey's Anatomy",
            "2005",
            8.2,
            "English",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            "43m",
            listOf("Drama"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mgOZSS2FFIGtfVeac1buBw3Cx5w.jpg"
        ))

        show.add(TVShowEntity(
            "tvs6",
            "Iron Fist",
            "2017",
            6.6,
            "English",
            "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
            "55m",
            listOf("Action", "Adventure", "Drama", "Sci-Fi", "Fantasy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4l6KD9HhtD6nCDEfg10Lp6C6zah.jpg"
        ))

        show.add(TVShowEntity(
            "tvs7",
            "Naruto Shippūden",
            "2007",
            8.6,
            "Japanese",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "25m",
            listOf("Animation", "Action", "Adventure", "Sci-Fi", "Fantasy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"
        ))

        show.add(TVShowEntity(
            "tvs8",
            "Riverdale",
            "2017",
            8.6,
            "English",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "45m",
            listOf("Mystery", "Drama", "Crime"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6zBWSuYW3Ps1nTfeMS8siS4KUaA.jpg"
        ))

        show.add(TVShowEntity(
            "tvs9",
            "The Simpsons",
            "1989",
            7.8,
            "English",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "22m",
            listOf("Family", "Animation", "Comedy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg"
        ))

        show.add(TVShowEntity(
            "tvs10",
            "The Walking Dead",
            "2010",
            8.0,
            "English",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "42m",
            listOf("Action", "Adventure", "Drama", "Sci-Fi", "Fantasy"),
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bVlivHmUDPqipJXzu70idVG3qCu.jpg"
        ))

        return show
    }
}