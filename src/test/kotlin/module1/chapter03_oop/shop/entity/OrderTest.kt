package module1.chapter3_oop.shop.entity
import org.junit.jupiter.api.Test
import org.junit.platform.engine.TestExecutionResult
import shop.entity.Address
import shop.entity.BankAccount
import shop.entity.Order
import shop.entity.Product
import shop.entity.User
import shop.entity.status.OrderStatus
import kotlin.test.*

//import kotlin.test.assertEquals
//import kotlin.test.assertFalse
//import kotlin.test.assertTrue

class OrderTest {
    // Helper to create a sample user for Orders
    private fun makeUser(): User {
        val address = Address("123", "City", "12345", "Country")
        val account = BankAccount(100.0)
        return User(1, "UserName", "Test@test.com", "+1234567890", address, account)
    }

    //Helper to provice a common list of products
    private fun products(): List<Product>   {
        return listOf(
            Product(1, "Product 1", 10.0),
            Product(2, "Product 2", 2.0)
        )
    }

    /** Test that a regular order totals up to the correct amount */
    @Test
    fun testOrderTotalAmount()  {
        val user = makeUser()
        val products = products()
        val order = Order(1, user, products, user.address)
        println("Check the total amount is correct")
        assertEquals(12.0, order.totalAmount())
        println("Check orderstatus is correct")
        assertEquals(OrderStatus.PENDING, order.getStatus())
    }

}