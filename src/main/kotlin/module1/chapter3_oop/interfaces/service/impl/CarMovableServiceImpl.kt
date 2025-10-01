package interfaces.service.impl

import interfaces.service.MovableService

class CarMovableServiceImpl(override val model: String) : MovableService{
    override var speed: Int = 60


    override fun move() {
        println("Driving the car $model at speed: $speed")
    }
}