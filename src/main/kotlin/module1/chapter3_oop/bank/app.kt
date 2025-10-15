/** file touched for update flag */
package bank


fun main()  {
    val bankAccount1 = BankAccount()

    var bankAccount = BankAccount()
    var balance = bankAccount.getBalance()
        println("Balance before deposit: $balance")
    bankAccount.deposit(150.0)
    balance = bankAccount.getBalance()
    bankAccount.getBalance()
    println("Balance after deposit: $balance")

    val person1 = Person("John", "Doe")
    person1.showFullName()
    val child1 = Child("Jimmy Jr", "Doe")
    child1.showFullName()
    child1.showLastName()
}