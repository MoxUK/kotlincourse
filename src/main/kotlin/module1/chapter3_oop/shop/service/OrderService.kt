package shop.service

import shop.entity.Order

interface OrderService {
    fun processOrder(order: Order): Boolean

    fun cancelOrder(order: Order): Boolean
}