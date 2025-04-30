package gay.flowerses.flock.v0

/**
 * Just pulling out the openrndr template to start from
 */

import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector2
import org.openrndr.extra.videoprofiles.*
import org.openrndr.ffmpeg.ScreenRecorder
import kotlin.random.Random

import gay.flowerses.flock.utils.backgroundColors
import org.openrndr.extra.color.presets.DARK_GRAY

fun main() = application {
    configure {
        width = 800
        height = 800
    }

    program {
        var birb = SimpleBird(Vector2(width/2.0, height/2.0), Vector2(Random.nextDouble(-3.0, 3.0), Random.nextDouble(-3.0, 3.0)))
        //extend(ScreenRecorder()) {
        //    h265 { constantRateFactor = 23 }
        //}
        extend(ScreenRecorder()) {
            gif()
        }
        extend {
            val col = backgroundColors["paper1"]
            drawer.clear(col as ColorRGBa)

            drawer.fill = ColorRGBa.DARK_GRAY
            birb.update(width, height)
            drawer.circle(birb.position.x, birb.position.y, 4.0)
        }
    }
}