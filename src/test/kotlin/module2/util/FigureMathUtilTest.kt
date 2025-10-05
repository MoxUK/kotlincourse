package module2.util.FigureMathUtil

import module2.entity.Square
import module2.entity.Triangle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class FigureMathUtilTest {
    private val util = FigureMathUtil()

    /** Test area and perimeter of square with side of 5 */
    @Test
    fun testSquareAreaPerimeter()   {
        val side = 5.0
        val square = Square(side)

        val resultArea = util.getArea(square)
        val resultPerimeter = util.getPerimeter(square)

        val expectedArea = 25.0
        val expectedPerimeter = 20.0
        assertEquals(expectedPerimeter, resultPerimeter)
        assertEquals(expectedArea, resultArea)

    }

    @Test
    fun testTriangleAreaPerimeter() {
        val triangle = Triangle(3.0, 4.0, 5.0)
        assertEquals(6.0, util.getArea(triangle))
        assertEquals(12.0, util.getPerimeter(triangle))

    }
}