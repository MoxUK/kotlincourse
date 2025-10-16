package module1.chapter3_oop.shop.entity
import org.junit.jupiter.api.Test
import org.junit.platform.engine.TestExecutionResult
import shop.entity.*
//import shop.entity.Address
//import shop.entity.BankAccount
//import shop.entity.ExpressOrder
//import shop.entity.GiftOrder
//import shop.entity.Order
//import shop.entity.Product
//import shop.entity.User
import shop.entity.status.OrderStatus
import kotlin.test.*

class OrderTest {
    // Helper to create a sample user for Orders
    private fun makeUser(): User {
        val address = Address("123", "City", "12345", "Country")
        val account = BankAccount(100.0)
        return User(1, "UserName", "Test@test.com", "+1234567890", address, account)
    }

    //Helper to provide a common list of products
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

    /** Test that an express order total includes the extra fee */
    @Test
    fun testExpressOrderTotalIncludesExtraFee()   {
        val user = makeUser()
        val products = products()
        val expressFee: Double = 5.99
        val expressOrder = ExpressOrder(1, user, products, user.address, expressFee)
        println("Check the total Express amount incl. fee is correct")
        assertEquals(17.99, expressOrder.totalAmount(), 0.01)
        println("Check Express order status is correct")
        assertEquals(OrderStatus.PENDING, expressOrder.getStatus())
    }

    /** Test that displayInfo for gift order includes the gift message */
    @Test
    fun testGiftOrderDisplayInludesMessage()    {
        val user = makeUser()
        val products = products()
        val expressFee: Double = 5.99
        val giftMessage = "Happy Birthday"
        val giftOrder = GiftOrder(1, user, products, user.address, expressFee, giftMessage)
        println("Check the gift message is included in the order")

        //TODO check captureOutput()
        giftOrder.displayInfo()

    }

}