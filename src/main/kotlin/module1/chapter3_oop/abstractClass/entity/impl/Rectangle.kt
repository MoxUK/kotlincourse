package abstractClass.entity.impl
import abstractClass.entity.Figure

class Rectangle (
    override var name: String,
    val width: Float,
    val height: Float) : Figure() {

        override fun perimeter(): Float {
        return ((width + height) * 2)
    }

    override fun area(): Float {
        return width * height
    }

    fun info()  {
        println("...")
    }
}
