package abstractClass.entity.impl

import abstractClass.entity.Human

class Person(name: String,
             override var age:Int) : Human(name){
    override fun hello()    {
        println("My name is $name")
    }
}