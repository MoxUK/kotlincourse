package abstractClass

import abstractClass.entity.Human
import abstractClass.entity.impl.Person

import abstractClass.entity.Figure
import abstractClass.entity.impl.Circle
import abstractClass.entity.impl.Rectangle

fun main() {
    val kate: Person = Person("Kate", 19)
    val alice: Human = Person("Alice", 21)
    alice.hello()
    kate.hello()

    val rectangle: Figure = Rectangle("rectangle 1",2F, 3F)
    //rectangle.info() - the function 'info' is not visible when declaring rectangle using Figure = Rectangle
    val rectangle2: Rectangle = Rectangle("rectangle 2", 2F, 3F)
    rectangle2.info()

    val service = FigureService()
    val circle: Figure = Circle("circle", 3F)
    val rectangle3: Figure = Rectangle("rectangle 3", 2F, 3F)

    service.info(rectangle3)
    service.info(circle)

    println("Area of ${circle.name} is ${circle.area()}")
    println("Circumference of ${circle.name} is ${circle.perimeter()}")
}


    class FigureService {
        fun info(figure: Figure)    {
            println(figure.name)
        }
    }


