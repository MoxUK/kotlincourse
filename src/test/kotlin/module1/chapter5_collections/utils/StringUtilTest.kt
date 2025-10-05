//package module1.chapter5_collections.utils
package module2.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class StringUtilTest {

    /* getText()*/
    @Test
    fun testGetTextLength()  {
        val text = "Kotlin"
        val expected = 6
        assertEquals(6, text.length)
    }

    fun testGetTextNotNull() {
        val str: String = "Hello"
        assertNotNull(str)
    }
}