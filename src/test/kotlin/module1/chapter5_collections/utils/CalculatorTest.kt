package module1.chapter5_collections.utils
import module1.chapter5_collections.util.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CalculatorTest {
    private val mockCalculator = Calculator()
    @Test
    fun testAddition()   {
        val result = mockCalculator.add(10, 10)
        val expected = 20

        assertEquals(expected, result, "result $result is not $expected")
    }
}