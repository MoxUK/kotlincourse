package enumerations
import enumerations.entity.Operation
import enumerations.util.OperationUtil

//import enumerations.entity.operate

fun main()  {
    //val OperationUtil = OperationUtil
    val op: Operation = Operation.ADD
    println(op.operate(1, 4, Operation.ADD))
    println(op.operate(1, 4, Operation.SUBTRACT))
    println(op.operate(1, 4, Operation.MULTIPLY))
}