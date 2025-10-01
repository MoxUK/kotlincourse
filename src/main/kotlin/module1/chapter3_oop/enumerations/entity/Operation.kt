package enumerations.entity

enum class Operation {
    ADD, SUBTRACT, MULTIPLY;

    fun operate(n1: Int, n2: Int, op: Operation): Int {
        return when (op) {
            Operation.ADD -> n1 + n2
            Operation.SUBTRACT -> n1 - n2
            Operation.MULTIPLY -> n1 * n2
        }
    }
}
