//package module1.chapter5_collections.utils
package module2.util


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class StringUtilTest {

    /* getText()*/
    @Test
    fun testGetTextLength()  {
        val text = "Kotlin"
        val expected = 6
        assertEquals(6, text.length)
    }

    @Test
    fun testGetTextNotNull() {
        val str: String = "Hello"
        assertNotNull(str)

        //Example of test failing:
        //val str2: String? = null
        //assertNotNull(str2)
    }

    @Test
    fun testGetTextThrowsNumberFormatException()    {
        val text = "abcdef"
        assertThrows<NumberFormatException> {
            text.toInt()

            //Example of test failing:
            //text.toString()

        }
    }
}