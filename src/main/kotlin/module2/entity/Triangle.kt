package module2.entity

import kotlin.math.sqrt

class Triangle(val a: Double,
    val b: Double,
    val c: Double): Figure() {
    override fun area(): Double {
                val s = perimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }

}