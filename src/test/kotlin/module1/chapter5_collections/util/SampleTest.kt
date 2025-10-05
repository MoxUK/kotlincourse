package module1.chapter5_collections.utils


import module1.chapter5_collections.util.Sample
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleTest {
    private val mockSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 42
        val result = mockSample.sum(40, 2)
        assertEquals(expected, result)
    }
}
