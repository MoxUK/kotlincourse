package devices.entities

open class Device(val name: String) {
    open fun turnOn()   {
        println("$name is now on.")

    }
}