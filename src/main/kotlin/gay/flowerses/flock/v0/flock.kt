package gay.flowerses.flock.v0

/**
 * Just pulling out the openrndr template to start from
 */

import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.draw.tint
import kotlin.math.cos
import kotlin.math.sin

fun main() = application {
    configure {
        width = 768
        height = 576
    }

    program {
        extend {
            drawer.drawStyle.colorMatrix = tint(ColorRGBa.WHITE.shade(0.2))

            drawer.fill = ColorRGBa.PINK
            drawer.circle(cos(seconds) * width / 2.0 + width / 2.0, sin(0.5 * seconds) * height / 2.0 + height / 2.0, 140.0)
        }
    }
}