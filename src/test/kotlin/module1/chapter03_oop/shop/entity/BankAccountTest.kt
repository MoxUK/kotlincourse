package module1.chapter3_oop.shop.entity
import org.junit.jupiter.api.Test
import shop.entity.BankAccount
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BankAccountTest {
    /** Test that deposit adds money to account */
    @Test
    fun testDepositAddsMoney()  {
        val account = BankAccount(100.0)
        // Depiost a valid positive amount
        val success = account.deposit(50.0)
        assertTrue(success,"Deposit should succeed for positive amount")
        assertEquals(150.0, account.getBalance())
    }

    /** Test that deposit fails for negative amount */
    @Test
    fun testDepositFailsIfNegative()    {
        val account = BankAccount(100.0)
        val success = account.deposit(-5.0)
        assertFalse(success, "Deposit should fail for negative amount")
        assertEquals(100.0, account.getBalance())
    }

    /** Test that withdraw correctly removes money if enough funds are available */
    @Test
    fun testWithdrawalRemovesMoney()    {
        val account = BankAccount(100.0)
        // Withdraw an amount less than balance
        println("Withdraw an amount less than balance")
        val success = account.withdraw(60.0)
        assertTrue(success,"Withdraw should succeed if enough money")
        assertEquals(40.0, account.getBalance())
    }

    /** Test that withdraws more than available amount */
    @Test
    fun testWithdrawMoreFundsThanAvailable()    {
        val account = BankAccount(50.0)
        // Withdraw an amount higher than balance
        println("Withdraw an amount higher than balance")
        val success = account.withdraw(60.0)
        assertFalse(success, "Withdraw should fail if not enough funds")
        assertEquals(50.0, account.getBalance())
    }
}