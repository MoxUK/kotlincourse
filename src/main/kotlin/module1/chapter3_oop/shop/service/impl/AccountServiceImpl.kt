package shop.service.impl

import shop.entity.BankAccount
import shop.service.AccountService

class AccountServiceImpl : AccountService {
    override fun withdraw(account: BankAccount, amount: Double) : Boolean   {
        return account.withdraw(amount)
    }

    override fun deposit(account: BankAccount, amount: Double) : Boolean    {
        return account.deposit(amount)
    }
}