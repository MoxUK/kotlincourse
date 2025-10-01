package shop.service

import shop.entity.BankAccount

interface AccountService {
    fun withdraw(account: BankAccount, amount: Double): Boolean
    fun deposit(account: BankAccount, amount: Double): Boolean
}