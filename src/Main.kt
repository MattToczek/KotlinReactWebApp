import react.dom.*
import kotlin.browser.document


fun main() {

    // defines a class that can be used in the render
    data class Buttons(val href: String, val textCont: String, val id: String, val method: String)

//    data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)
//
//    val unwatchedVideos = listOf(
//            Video(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
//            Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
//            Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
//    )
//
//    val watchedVideos = listOf(
//            Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
//    )

//    defines a list of class instances to be looped through in render
    val buttons = listOf (
            Buttons("#", "Start!", "startBtn", "POST"),
            Buttons("/highscores", "Leaderboard", "scoresBtn", "GET")
    )

//    render similar to react but using html objects as objects
    render(document.getElementById("root")) {
        h1 {
            +"Welcome to Kotan!"
        }
        h3 {
            +"a kotlin based Catan simulator"
        }

//        loops through list (buttons) and uses btns as arbritrary element name in loop
        for(btns in buttons) {
            a{
//              cannot currently add more than one attribute - not sure why
                attrs {
                    href = "${btns.href}"
                }
                +"${btns.textCont}"
            }
        }


//        for (video in unwatchedVideos) {
//            p {
//                +"${video.speaker}: ${video.title}"
//            }
//        }
    }
}