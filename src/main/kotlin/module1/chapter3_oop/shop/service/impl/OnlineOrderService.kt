package shop.service.impl

import shop.entity.Order
import shop.service.OrderService
import shop.service.AccountService
import shop.entity.status.OrderStatus


class OnlineOrderService(
    private val accountService: AccountService
) : OrderService {
    override fun processOrder(order: Order): Boolean {
        val account = order.getUser().getAccount()
        val amount = order.totalAmount()
        val success = accountService.withdraw(account, amount)

       // val success = accountService.withdraw(account, amount)
        if (success)    {
            println("Order #${order.getId()} processed successfully for ${order.getUser().name}. Amount: $amount")
        } else {
            println("Order #${order.getId()} failed for ${order.getUser().name}. Not enough money available")
        }
        return success
    }

    override fun cancelOrder(order: Order): Boolean {
        if (order.getStatus() == OrderStatus.PAID) {
            val account = order.getUser().getAccount()
            val refundAmount = order.totalAmount()
            if (accountService.deposit(account, refundAmount)) {
                order.setStatus(OrderStatus.CANCELLED)
                println("Order #${order.getId()} cancelled and refunded. Status: ${order.getStatus()}")
                return true
            }
        } else {
            order.setStatus(OrderStatus.CANCELLED)
            println("Order #${order.getId()} cancelled before payment. Status: ${order.getStatus()}")
            return true
        }
        return false
    }
}