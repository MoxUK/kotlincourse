package module2.entity

class Square(val side: Double): Figure() {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double    {
       return 4 * side
    }

}