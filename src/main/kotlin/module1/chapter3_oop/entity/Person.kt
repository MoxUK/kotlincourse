package entity

class Person(val _name: String, val _age: Int) {
    var name: String
    var age: Int = 18

    init {
        name = _name
        if ((_age > 0) && (_age < 100)) {
            age = _age
        }
    }
}