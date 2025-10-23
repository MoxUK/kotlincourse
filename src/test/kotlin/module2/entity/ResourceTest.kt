package module2.entity

import kotlin.test.BeforeTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
import kotlin.test.assertTrue

class ResourceTest {
    companion object {

        @BeforeAll
        @JvmStatic
        fun globalSetup()   {
            println("Global setup: Before all tests")
        }

        @AfterAll
        @JvmStatic
        fun globalTeardown()    {
            println("Global Tear Down: after all tests")
        }

    }

    @Test
    fun testSomething() {
        println("Test 1")
        assertTrue { true }
    }

    @Test
    fun testSomething2() {
        //logic
        println("Test 2")
        assertTrue { true }
    }
}