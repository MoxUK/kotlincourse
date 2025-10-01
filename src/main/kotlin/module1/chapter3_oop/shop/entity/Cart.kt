package shop.entity

class Cart {
    private val items: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        items.add(product)
    }

    fun removeProduct(product: Product) {
        items.remove(product)
    }

    fun getProducts(): List<Product> {
        return items
    }

    /** return items.sumOf { it.price } */
    fun totalAmount(): Double {
        var sum = 0.0
        for (it in items) {
            sum += it.price
        }
        return sum
    }

    fun clear() {
        items.clear()
    }
}