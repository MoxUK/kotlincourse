package interfaces.service.impl

import interfaces.service.MovableService

class AircraftMovableServiceImpl(override val model: String) : MovableService{
    override var speed: Int = 500
    override fun move() {
        println("Flying the aircraft $model at speed: $speed")
    }

    override fun stop() {
        println("Landing...")
    }
}