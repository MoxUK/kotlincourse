package shop.entity

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val address: Address,
    private val account: BankAccount
) {
    fun showBalance()   {
        println("$name's balance: ${account.getBalance()}")
    }

    fun getAccount(): BankAccount {
        return account;
    }
}