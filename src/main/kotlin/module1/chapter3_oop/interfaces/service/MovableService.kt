package interfaces.service

interface MovableService {
    val speed: Int
    val model: String

    fun move()
    fun stop()  {
        println("Stopping...")
    }
}