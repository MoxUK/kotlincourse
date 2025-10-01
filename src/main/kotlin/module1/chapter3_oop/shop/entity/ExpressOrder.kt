package shop.entity

import shop.entity.status.OrderStatus

open class ExpressOrder(
    orderId: Long,
    user: User,
    product: List<Product>,
    deliveryAddress: Address,
    private var expressFee: Double,
    status: OrderStatus = OrderStatus.PENDING
) : Order(orderId, user, product, deliveryAddress, status) {

    override fun totalAmount(): Double{
        return super.totalAmount() + expressFee
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Express Fee: $expressFee ")
        println("Total amount with ExpressFee: ${totalAmount()}")
    }


}

