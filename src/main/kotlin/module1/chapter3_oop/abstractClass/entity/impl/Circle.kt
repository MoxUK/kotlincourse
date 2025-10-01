package abstractClass.entity.impl
import abstractClass.entity.Figure

class Circle (
    override val name: String,
    val diameter: Float,
    ) : Figure(){
    val PI = 3.141592653589793F
    val radius: Float = diameter / 2

    override fun perimeter(): Float {
        return (2 * PI * radius)
    }

    override fun area(): Float {
        return (PI * radius * radius)
    }
}