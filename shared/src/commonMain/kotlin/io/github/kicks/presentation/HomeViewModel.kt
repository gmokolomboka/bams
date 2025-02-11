package io.github.kicks.presentation

import io.github.kicks.data.Audio
import org.chaintech.app.utility.getLocalFilePathFor

class HomeViewModel {

    fun getAudios(): List<Audio>{
        return listOf(
            Audio(
                streamUrl = getLocalFilePathFor("Luis Miguel Del Amargue - La Magia De Tus Ojos (bachata).mp3"),
                imageUrl = "1.jpeg",
                artists = "Luis Miguel Del Amargue",
                title = "Local - La Magia De Tus Ojos",
                duration = "6:12",
            ),

            Audio(
                streamUrl = getLocalFilePathFor("Frank_Reyes_Dame_Algo_De_Ti-Cuando_Se_Quiere_Se_Puede.mp3"),
                imageUrl = "1.jpeg",
                artists = "Frank Reyes",
                title = "Local - Dame Algo De Ti - Cuando Se Quiere Se Puede",
                duration = "3:28",
            ),
            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/nuevaeltorito.mp3",
                imageUrl = "1.jpeg",
                artists = "Hector Acosta",
                title = "nueva el torito",
                duration = "4:03",
            ),
            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/Bachata%20-%20Luis%20Vargas%20-%20Inocente.mp3",
                imageUrl = "1.jpeg",
                artists = "Luis Vargas",
                title = "Inocente",
                duration = "5:01",
            ),

            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/ANTHONY%20SANTOS%20-%20Donde%20Estara%20-%20BACHATA%20-%2000.mp3",
                imageUrl = "1.jpeg",
                artists = "Antony Santos",
                title = "Donde Estera",
                duration = "4:56",
            ),

            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/Luis%20Miguel%20del%20Amargue%20-%20Se%20Acabo%20Lo%20Bonito(04).mp3",
                imageUrl = "1.jpeg",
                artists = "Luis Miguel del Amargue",
                title = "Se Acabo Lo Bonito",
                duration = "4:07",
            ),
            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/02%20-%20Solo%20Quiereme.mp3",
                imageUrl = "1.jpeg",
                artists = "Raulin Rodriguez",
                title = "Piel Sin Alma",
                duration = "5:42",
            ),
            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/04%20-%20Amor%20De%20Una%20Noche.mp3",
                imageUrl = "1.jpeg",
                artists = "Luis Miguel Del Amargue",
                title = "Amor De Una Noche",
                duration = "4:58",
            ),
            Audio(
                streamUrl = "https://pub-9c8e58aa978e4e24b9c47bd08834208c.r2.dev/01%20-%20Ding%20Dong.mp3",
                imageUrl = "1.jpeg",
                artists = "Luis Miguel Del Amargue",
                title = "Ding Dong",
                duration = "4:39",
            ),

            )
    }
}
