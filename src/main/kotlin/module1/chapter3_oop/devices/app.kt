package devices

import devices.entities.Device
import devices.entities.SmartLamp

/**
 * Task 1: Smart Devices
 * Imagine you are designing software for smart home devices.
 *
 * There is a basic class Device with properties like name and a function turnOn() that prints a simple message.
 * You need to make a class SmartLamp that comes from Device and adds a property for brightness.
 * Override the turnOn() function in SmartLamp so it prints a message including the lamp’s name and brightness.
 * Extra:
 * Add a getter for the brightness property so that if the brightness is less than 10, it always returns 10.
 *
 */

fun main()  {
    val device = Device("Non smart lamp")
    val lampOne = SmartLamp("Living Room", 12)
    lampOne.turnOn()
}
