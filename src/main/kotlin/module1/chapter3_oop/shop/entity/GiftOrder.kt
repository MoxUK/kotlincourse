package shop.entity

import shop.entity.status.OrderStatus

class GiftOrder (
    orderID: Long,
    user: User,
    products: List<Product>,
    deliveryAddress: Address,
    expressFee: Double,
    private val giftMessage: String,
    status: OrderStatus = OrderStatus.PENDING
) : ExpressOrder(orderID, user, products, deliveryAddress, expressFee, status)  {

    override fun displayInfo()  {
        super.displayInfo()
        println("Gift Message: $giftMessage")
    }
}




