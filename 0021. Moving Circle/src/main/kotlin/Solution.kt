import kotlin.math.*

class Solution {
    private var result = -1

    fun ifIntersect(position: DoubleArray): Int {
        val (ax, ay, ar, bx, by, br, px, py) = position

        if (abs(ar - br) <= sqrt((ax - bx).pow(2.0) + (ay - by).pow(2.0)) &&
            sqrt((ax - bx).pow(2.0) + (ay - by).pow(2.0)) <= ar + br
        ) {
            result = 1
            return result
        }
        if (abs(ar - br) <= sqrt((px - bx).pow(2.0) + (py - by).pow(2.0)) &&
            sqrt((px - bx).pow(2.0) + (py - by).pow(2.0)) <= ar + br
        ) {
            result = 1
            return result
        }
        isCrossing(ax, ay, ar, bx, by, br, px, py)

        return result
    }

    private fun isCrossing(
        ax: Double, ay: Double, ar: Double,
        bx: Double, by: Double, br: Double,
        px: Double, py: Double
    ) {
        val midx = (ax + px) / 2
        val midy = (ay + py) / 2

        if (abs(ar - br) <= sqrt((midx - bx).pow(2.0) + (midy - by).pow(2.0)) &&
            sqrt((midx - bx).pow(2.0) + (midy - by).pow(2.0)) <= ar + br
        ) {
            result = 1
            return
        }

        if (sqrt((midx - ax).pow(2.0) + (midy - ay).pow(2.0)) <= 0.001) {
            result = -1
            return
        }

        if (result == -1) isCrossing(ax, ay, ar, bx, by, br, midx, midy)

        if (result == -1) isCrossing(midx, midy, ar, bx, by, br, px, py)
    }

    private operator fun DoubleArray.component6(): Double = this[5]
    private operator fun DoubleArray.component7(): Double = this[6]
    private operator fun DoubleArray.component8(): Double = this[7]
}