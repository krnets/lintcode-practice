class Solution {
    fun largestTriangleArea(points: Array<IntArray>): Double {
        var ans = 0.0

        for (i in 0 until points.size - 2)
            for (j in i + 1 until points.size - 1)
                for (k in j + 1 until points.size)
                    ans = maxOf(ans, calcArea(points[i], points[j], points[k]))

        return ans
    }

    private fun calcArea(pointA: IntArray, pointB: IntArray, pointC: IntArray): Double {
        val (ax, ay) = pointA
        val (bx, by) = pointB
        val (cx, cy) = pointC

        return 0.5 * Math.abs(ax * by + bx * cy + cx * ay - ay * bx - by * cx - cy * ax)
    }
}