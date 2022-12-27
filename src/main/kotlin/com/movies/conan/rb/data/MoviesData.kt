package com.movies.conan.rb.data

import com.movies.conan.rb.models.CastModel
import com.movies.conan.rb.models.MovieModel

object MoviesData {
    private fun getImageLink(name:String) = "https://firebasestorage.googleapis.com/v0/b/movies-ui-template.appspot.com/o/Thumbnails%2F$name.png?alt=media&token=926b7bc1-9257-40f7-80ab-12780570bde5"
    private fun getDescription( number: Int,dics: HashMap<String, String> = discs): String? {
        return dics.get("movie_${number}_disc")
    }
    private fun getStreamingLink(name: String):String{
        return "/detective conan movies/$name.mp4"
    }
    private val discs = hashMapOf<String,String>().apply {
        put("movie_1_disc","While sorting mail at Dr. Agasa\'s house, Conan finds an invitation addressed to Jimmy from Leo Joel, a famous architect. Jimmy calls Rachel using his voice-changing bowtie and asks her to go in his place. Rachel agrees, on the condition that Jimmy goes to a movie with her on Saturday.\n" +
                "On Saturday morning, Conan receives a call from a strange man, who challenges Jimmy to a game. Conan accepts the challenge, and the mystery caller gives him clues leading to bombs hidden all over Tokyo. Conan finds and destroys every one. Because of the locations of the bombs - near structures designed by Joel - Conan deduces that the bomber is Joel, who planned to destroy his \"\\inferior\\\" works and create a perfect new building. Upon his arrest, Joel reveals the location for his final bombs: Beika City Building, the location of Jimmy and Rachel\\'s date.\n" +
                "The bombs explode and seal the entrances and exits, trapping Rachel and others inside. Conan makes his way through the collapsing building, but a warped door blocks him off from Rachel. Using his tie and cell phone, he calls Rachel and asks her to look for the bomb. Rachel finds it in a large shopping bag. To disarm the bomb, Jimmy tells Rachel which wires to cut. However, Joel made two extra wires, one red, one blue. One of them is booby-trapped, but Jimmy has no idea which. Jimmy tells Rachel to cut either one. As the rescue team arrives and carries him away, Jimmy realizes that Joel knew that Rachel's favorite color was red and booby-trapped the red one. In the last few minutes, Rachel makes a desperate decision and cuts the blue wire because the red wire represents the red string of fate between Jimmy and herself.")
        put("movie_2_disc","movie_2_disc")
        put("movie_3_disc","Kaitou Kid announces to the police that he intends to steal the Russian Imperial Easter Egg, which is currently being held in Osaka. As Conan pursues his rival, he discovers that there\\'s more to this case then simply stopping a robbery.")
        put("movie_4_disc","A series of murders have occurred with police officers as victims. One of the officers is shot right in front of Ran\\'s eyes, and the shock of the incident causes Ran to lose her memory of everyone and everything around her. Now Conan must help Ran regain her lost memories, while also protecting her from the muderer, who is targeting Ran for witnessing the crime.")
        put("movie_5_disc","As a pair of towers in Tokyo are being prepared for their grand opening, there is a series of murders of people connected to the towers. Conan suspects that the mysterious Syndicate may also be involved.")
        put("movie_6_disc","Conan was invited to a party with many other guests. They were there to test a new virtual game system, when a murder mystery occured. Now Conan must go into the game system to figure out who the murderer is with the help of the famous book character Sherlock Holmes. The lives of 49 kids testing the game are in his hands.")
        put("movie_7_disc","Mouri Kogoro is called to a special case in the ancient capital of Kyoto. There, Conan meets Heiji and they team up once again to solve the case, recover the stolen Healing Buddha statue, and even discover the identity of Heiji\\'s first love.")
        put("movie_8_disc","Kaito Kid strikes again in this new annual installment of the Detective Conan movies. An actress asked for Mouri Kogoro to protect a precious jewel of hers which Kid has vowed to steal. On the day of the theft, Kaito Kid dressed up as Shinichi and matched wits with Conan, and fled in the end. To thank them, the actress invited Kogoro and family and friends to Sapporo, but a bigger scheme, and a great emergency is just about to unravel high above the clouds in the plane that they\\'re taking…")
        put("movie_9_disc","On a luxurious cruise trip paid for by Sonoko, Conan and his gang enjoy the high life on the open seas. However, a shrewd plot for revenge was brewing right under Conan\\'s nose. And this time Mori takes the spotlight, proving his own intuitions right, and beats Conan at his own deduction")
        put("movie_10_disc","Some unknown man who knows Conan is in fact Kudo Shinichi lures Conan and the others (Mori, Ran, Tanteidan…) to Yokohama. This man takes Ran and the Tanteidan as hostages. He gives Conan a 12 hour time limit in which to solve a case. If it is not solved within that time, bombs attached to the hostages will explode.... To thwart this villain Conan has help from Heiji, Kaitou Kid, Hakuba")
        put("movie_11_disc","The Isle of Koumi, a beautiful island in the Pacific Ocean. On the island, people pass an old legend down from generation to generation that there was the Seabed Palace, an ancient ruin at the bottom of the sea, where the treasure of 2 female pirates, Anne Bonnie &amp; Mary Reed (who really existed 300 years ago), was left. When Conan and his friends visit Koumi Island while on vacation, they meet some treasure hunters. There was something suspicious about them.</string>\n")
        put("movie_12_disc","No description")
        put("movie_13_disc","The plot is shinichi gets involved in a case that involves an accident from the previous year; however, the case is tied to the black organization who gave shinichi a drug that shrunk him.")
        put("movie_14_disc","The latest Suzuki corp. challenge to Kaitou Kid turns deadly as the dirigible meant to be the stage to trap Kid becomes a floating fortress as mercenaries from a terrorist group hijacks the ship with everyone still on board. Even worse is that this group has possession of a recently stolen bioweapon and appears to be planning to use it against the population of an entire city by releasing it in the sky as the dirigible passes by. Conan, Kaitou Kid, and Hattori must uncover enough of their nefarious plot before time runs out and find out if there is something far more sinister to their plot than just what they allowed the world to know about.")
        put("movie_15_disc","An explosion in a subway tunnel brought Conan and co. to investigate Kitanosawa where they met a group of friends who used to live in the village nearby before it was relocated. A boy who has been in coma, a car accident and the explosion itself swirl around the mystery in Kitanosawa.")
        put("movie_16_disc","After an interaction with J-League professional players, Conan and co watches the big match between Tokyo Spirits and Gamba Osaka, only to find out that a bomb has been planted in the stadium. It is now up to Conan once again to foil the culprit\\'s plans and reveal his/her true identity.")
        put("movie_17_disc","After winning a prize to a military ship cruise, Conan and the others are left with the task of finding the culprit among them as the security of the whole country rests on their shoulders.")
        put("movie_18_disc","A vicious sniper has appeared in Tokyo, rendering the people too scared to go outside, once again it\\'s up to Conan to figure out the meaning behind the killings and capture the mysterious sniper before more lives are lost.")
        put("movie_19_disc","Conan tries to track down Kaito Kid, who supposedly steals a replica of one of Van Gogh\\'s Sunflowers paintings during an auction.")
        put("movie_20_disc","On a dark night, the Japanese police is raided by a spy and different countries\\' intelligence agencies\\' secret files are going to be taken, but public safety officers led by Tooru Amuro arrive just in time. The spy steals a car and escapes but is thwarted by FBI agent Shuichi Akai\\'s rifle bullet and falls off the roadway. The next day, Conan and his friends go to an aquarium in Tokyo and find an attractive woman alone and injured. Her left and right eyes are different colors and she suffers from amnesia. Conan and his friends promise to help her regain her memory, so they stay with her. Throughout all this, Vermouth is watching behind the scenes. Afterwards, she pulls out a silencer and speaks into an attached intercom, \"It's as planned, Gin.")
        put("movie_21_disc","A bombing case at Nichiuri TV in autumn. The Satsuki Cup, which crowns the winner of Japan\\'s Hyakunin Isshu, is currently being filmed inside the facility. The incident results in a big commotion and, while the building is burning to ashes, the only people left inside are Heiji and Kazuha. They get rescued just in time by Conan, who rushes to the scene. Both the identity and purposes of the bomber are unknown.\n" +
                "While confusion takes over due to the explosion, Conan meets a mysterious beautiful girl who claims she is \"\\Heiji's fiancée\\\". Her name is Momiji Ooka and she is the Kyoto High School champion of the Karuta game. As fate would have it, Kazuha is going to face Momiji in the Hyakunin Isshu, so she begins to train with the help of Heiji's mother, Shizuka, who is a skilled Karuta player.\n" +
                "At the same time, in a Japanese house in Arashiyama, Kyoto's outskirts, the reigning Satsuki Cup champion is murdered. Pictures of the crime scene reveal Momji's presence. Additionally, several Karuta cards were spread around the victim.\n" +
                "Conan and Heiji, along with the Osaka and Kyoto police departments, begin their investigation on the Satsuki Cup and the related murder case. As the inquiry goes on, they come across a secret connected with the Hyakunin Isshu.\n")
        put("movie_22_disc","A young crime solver embarks on a secret mission to clear a detective\\'s name when someone frames him for an explosion that kills several officers.")
        put("movie_23_disc","The world\\'s greatest blue sapphire, the \"\\blue lapis fist\\\", said to have sunk in a pirate ship in the late 19th century, on the coasts of Singapore. A local millionaire plots to retrieve it, and when it\\'s exhibited in an exhibition at the Singapore Marina Bay Sands hotel, a murder takes place. A bloody Kaitou Kid announcement card is found in the crime scene.\n" +
                "In the meantime, Kogoro, Ran, and Sonoko have come to Singapore to see a karate tournament held there. Conan, who doesn\\'t have a passport and can\'t travel overseas, was supposed to stay at home. But Kid, who wants to make use of him, uses a magical trick to forcibly drag him to Singapore. Conan must obey Kid if he wants to get back to Japan, gets his glasses, wristwatch and clothes, amongst others, all stolen from him and he has to disguise himself.\n" +
                "Ran, who doesn't realize who he is, asks him his name and he improvises the name Arthur Hirai. Disguised as Shinichi, Kid eventually gets a hold of information about the fist being stored in a manor's underground vault. Just when he was thinking that he'd made it inside very easily, he finds a dangerous trap awaiting him. Facing him is the strongest karateka with a streak of 400 consecutive victories: Makoto Kyogoku.\n" +
                "Leon Lowe, a criminal behavior psychologist, aims for the legendary secret treasure buried in the seabed for a purpose, and hinders both Conan and Kid. They must confront Leon and his excellent secretary, the beautiful Rachel Cheung.\n")
    }
    val AllMovies = listOf<MovieModel>(
        MovieModel("The Time Bombed Skyscraper", description = getDescription(number = 1), thumbnail =  getImageLink("one"),  "7,4/10", streaminglink = getStreamingLink("movie 1")),
        MovieModel("The Fourteenth Target", getDescription(2), getImageLink("two"),  "7,4/10", streaminglink = getStreamingLink("movie 2")),
        MovieModel("The Last Wizard of the Century", getDescription(3), getImageLink("three"), "7,5/10", streaminglink = getStreamingLink("movie 3")),
        MovieModel("Captured in Her Eyes", getDescription(4), getImageLink("four"), "7,6/10", streaminglink = getStreamingLink("movie 4")),
        MovieModel("Countdown to Heaven", getDescription(5),getImageLink("fife"), "7,6/10", streaminglink = getStreamingLink("movie 5")),
        MovieModel("The Phantom of Baker Street", getDescription(6), getImageLink("six"), "7,8/10", streaminglink = getStreamingLink("movie 6")),
        MovieModel("Crossroad in the Ancient Capital", getDescription(7), getImageLink("seven"),"7,2/10", streaminglink = getStreamingLink("movie 7")),
        MovieModel("Magician of the Silver Sky", getDescription(8), getImageLink("eight"), "7,1/10", streaminglink = getStreamingLink("movie 8")),
        MovieModel("Strategy Above the Depths", getDescription(9), getImageLink("nine"), "7,1/10", streaminglink = getStreamingLink("movie 9")),
        MovieModel("The Private Eyes' Requiem", getDescription(10),getImageLink("ten"), "7,1/10", streaminglink = getStreamingLink("movie10")),
        MovieModel("Jolly Roger in the Deep Azure", getDescription(11), getImageLink("eleven"), "6,3/10", streaminglink = getStreamingLink("movie11")),
        MovieModel("Full Score of Fear", getDescription(12), getImageLink("twelf"), "6,8/10", streaminglink = getStreamingLink("movie12")),
        MovieModel("The Raven Chaser", getDescription(13), getImageLink("therteen"), "7,1/10", streaminglink = getStreamingLink("movie13")),
        MovieModel("The Lost Ship in the Sky", getDescription(14),getImageLink("foorteen"),  "7,0/10", streaminglink = getStreamingLink("movie14")),
        MovieModel("Quarter of Silence", getDescription(15), getImageLink("fifteen"), "6,7/10", streaminglink = getStreamingLink("movie15")),
        MovieModel("The Eleventh Striker", getDescription(16), getImageLink("sixteen"), "6,5/10", streaminglink = getStreamingLink("movie16")),
        MovieModel("Private Eye in the Distant Sea", getDescription(17),getImageLink("seventeen"), "7.8/10", streaminglink = getStreamingLink("movie17")),
        MovieModel("The Sniper from Another Dimension", getDescription(18),getImageLink("eighteen"), "6,8/10", streaminglink = getStreamingLink("movie18")),
        MovieModel("Sunflowers of Inferno", getDescription(19), getImageLink("nineteen"), "6,3/10", streaminglink = getStreamingLink("movie19")),
        MovieModel("The Darkest Nightmare", getDescription(20),getImageLink("twenty"), "7,0/10", streaminglink = getStreamingLink("movie20")),
        MovieModel("Crimson Love Letter", getDescription(21),getImageLink("twentyone"), "6,5/10", streaminglink = getStreamingLink("movie21")),
        MovieModel("Zero the Enforcer", getDescription(22), getImageLink("twentytwo"), "6,2/10", streaminglink = getStreamingLink("movie22")),
        MovieModel("The Fist of Blue Sapphire", getDescription(23), getImageLink("one"), "6,2/10", streaminglink = getStreamingLink("movie23")),
    )
    val Casting = listOf<CastModel>(
        CastModel(
            getImageLink("minami_takayamat_conan_edogawa_"),
            "Minami Takayama ","(Conan Edogawa)"
        ),
        CastModel(
            getImageLink("wakana_yamazaki_rachel_moore_"),
            "Wakana Yamazaki ","(Rachel Moore)"
        ),
        CastModel(
            getImageLink("kappei_yamaguchi_conan_edogawa_"),
            "Kappei Yamaguchi","(conan Edogawa)"
        ),
        CastModel(
            getImageLink("chafurin_inspector_jozeph_meguiri_"),
            "Chafurin","(inspector jozeph meguiri)"
        ),
        CastModel(
            getImageLink("kenichi_ogata_hiroshi_agasa_"),
            "Kenichi Ogata","(hiroshi agasa)"
        ),
        CastModel(
            getImageLink("wataru_takagi_george_kojima_"),
            "Wataru Takagi","(george kojima)"
        ),
        CastModel(
            getImageLink("toru_furuya_amuro_tooru_"),
            "Tōru_furuya","(amuro_tooru)"
        ),
        CastModel(
            getImageLink("naoko_matsui_serena_sebastian_"),
            "naoko matsui","(serena sebastian)"
        )

    )
}