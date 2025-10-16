package module1.chapter03_oop.shop.service.impl
import org.junit.jupiter.api.Test
import kotlin.test.*
import org.junit.platform.engine.TestExecutionResult
import shop.service.*
import shop.service.impl.*
import shop.entity.*
import shop.entity.status.*

class OnlineOrderServiceTest {

    private val accountService = AccountServiceImpl()
    private val orderService = OnlineOrderService(accountService)

    //private val accountService =

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

    /** Test that processing an order works if the user has enough money */
    @Test
    fun testOrderProcessingSucceedsIfEnoughMoney()  {
        val user = makeUser()
        val products = products()
        val order = Order(1, user, products, user.address)
        val success = orderService.processOrder(order)


        assertTrue(success, "Should succeed if enough money")
        assertEquals(OrderStatus.PAID, order.getStatus())
        assertEquals(88.0, user.getAccount().getBalance())
    }
}
