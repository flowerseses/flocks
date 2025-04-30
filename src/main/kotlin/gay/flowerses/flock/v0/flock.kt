package gay.flowerses.flock.v0

/**
 * Just pulling out the openrndr template to start from
 */

import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.draw.tint
import org.openrndr.math.Vector2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

import gay.flowerses.flock.utils.backgroundColors
import gay.flowerses.flock.v0.SimpleBird
import org.openrndr.extra.color.presets.DARK_GRAY

fun main() = application {
    configure {
        width = 800
        height = 800
    }

    program {
        var birb = SimpleBird(Vector2(width/2.0, height/2.0), Vector2(Random.nextDouble(), Random.nextDouble()))
        extend {
            val col = backgroundColors["paper1"]
            drawer.clear(col as ColorRGBa)

            drawer.fill = ColorRGBa.DARK_GRAY
            birb.update(width, height)
            drawer.circle(birb.position.x, birb.position.y, 4.0)
        }
    }
}