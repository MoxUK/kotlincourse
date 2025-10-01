package interfaces

import interfaces.service.MovableService
import interfaces.service.impl.AircraftMovableServiceImpl
import interfaces.service.impl.CarMovableServiceImpl

fun main()  {
    val carService = CarMovableServiceImpl("BMW")
    val aircraftService = AircraftMovableServiceImpl("Boeing")

    carService.move()
    aircraftService.move()

    travel(carService)

    carService.stop()
    aircraftService.stop()
}

fun travel(service: MovableService)    {
    service.move()
}

interface Worker    {
    fun work()
    fun information()
}

interface Student   {
    fun study()
    fun information()
}

abstract class WorkingStudent(val name: String) : Student, Worker {
    override fun study() {
        println("$name is studying")
    }

    override fun work() {
        println("$name is working")
    }

}