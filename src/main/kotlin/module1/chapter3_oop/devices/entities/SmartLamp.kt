package devices.entities

class SmartLamp(
    name: String,
    brightnessInput: Int
) : Device(name) {
    var brightness: Int = brightnessInput
        get() {
            // Getter: never less than 10
            if (field < 10) return 10
            return field
        }

    override fun turnOn() {
        println("$name is now on with brightness $brightness.")
    }
}

