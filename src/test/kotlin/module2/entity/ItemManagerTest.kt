package module2.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
//import org.junit.jupiter.api.AfterEach
//import org.junit.jupiter.api.BeforeEach

class ItemManagerTest {
    private lateinit var manager: ItemManager

    @BeforeEach
    fun setUp() {
        manager = ItemManager()
        println("Setup: New manager created")
    }

    @AfterEach
    fun tearDown()  {
        manager.clear()
        println("Tear down: Manager cleared")
    }

    @Test
    fun testAddItem()   {
        manager.add("Apple")
        assertEquals(1, manager.count())
    }

    @Test
    fun testAddMultipleItems()   {
        manager.add("Apple")
        manager.add("Banana")
        assertEquals(2, manager.count())
    }
}