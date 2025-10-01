package shop.entity

class BankAccount(private var balance: Double) {
    fun getBalance() : Double   {
        return balance
    }

    fun withdraw(amount: Double) : Boolean   {
        if(amount > 0 && balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

    fun deposit(amount: Double): Boolean    {
        if (amount > 0) {
            balance += amount
            return true
        }
        return false
    }
}