package module1.chapter5_collections.util
//import module1.chapter5_collections.util.Calculator
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals


class CalculatorTest {
    private val mockCalculator = Calculator()
    @Test
    fun testAddition()   {
        val result = mockCalculator.add(10, 10)
        val expected = 20

        assertEquals(expected, result, "result $result is not $expected")
    }

    @Test
    fun testDivideByZeroThrows()    {
        val exception = assertThrows(ArithmeticException::class.java)  {
            mockCalculator.divide(1,0)}
            val expectedMessage = "/ by zero"
            assertEquals(expectedMessage, exception.message)
    }
}