package entity

class NewPerson (val firstName: String, val lastName: String, var age: Int){
    val fullInfo: String
        get() {
            return "$firstName $lastName, age: $age"
        }

    private var _age: Int
            set(value)  {
                if (value in 0 .. 100 ) {
                    _age = value
                }
            }
        get() = _age
}