package gay.flowerses.flock.v0

import org.openrndr.math.Vector2

// First run at a simple agent - get a location and speed, apply movement and draw self on canvas

class SimpleBird(var position: Vector2, var speed: Vector2, var accel: Vector2? = null) {
    // TODO: Optionally add a time step here?
    // TODO: Also, apply acceleration
    fun update(width: Int, height: Int) {
        position = position.plus(speed)
        if (position.x >= width || position.x <= 0) {
            speed = Vector2(-speed.x, speed.y)
        }
        if (position.y >= height || position.y <= 0) {
            speed = Vector2(speed.x, -speed.y)
        }
    }

    // Draw self on the area instead of the other way around?
    //fun draw() {}

}