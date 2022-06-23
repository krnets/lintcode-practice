/*
import kotlin.math.abs

class Solution {
    fun getDistanceMetrics(a: IntArray): List<Long> {
        val result = a.indices.map { it.toLong() }.toMutableList()
        val map = mutableMapOf<Int, MutableList<Long>>()

        for (i in a.indices) {
            val x = a[i]

            if (!map.containsKey(x))
                map[x] = mutableListOf(i.toLong())
            else
                map[x]!!.add(i.toLong())
        }

        map.values.forEach { idx ->

            result[idx.first().toInt()] = idx.sumOf { abs(it - idx.first()) }

            idx.indices.drop(1).forEach { j ->
                val delta = idx[j] - idx[j - 1]

                result[idx[j].toInt()] = result[idx[j - 1].toInt()] -
                        delta * (idx.size - j - 1) +
                        delta * (j - 1)
            }
        }

        return result
    }
}*/



class Solution {
    fun getDistanceMetrics(a: IntArray): List<Long> {
        val result = a.indices.map { it.toLong() }.toMutableList()
        val map = mutableMapOf<Int, MutableList<Int>>()

        for (i in a.indices) {
            val x = a[i]

            if (map.containsKey(x))
                map[x]!!.add(i)
            else map[x] = mutableListOf(i)
        }

        val preSums = mutableMapOf<Int, LongArray>()

        for (entry in map) {
            val list = entry.value

            if (list.size == 1) {
                result[list.first()] = 0L
                continue
            }

            val preSum = preSums.getOrDefault(entry.key, LongArray(list.size + 1))

            for (i in list.indices) {
                preSum[i + 1] = preSum[i] + list[i]
            }

            preSums.putIfAbsent(entry.key, preSum)

            for (i in list.indices) {
                val pos = list[i]

                result[pos] = pos * i - preSum[i] +
                        preSum[list.size] - preSum[i] -
                        pos * (list.size - i)
            }
        }

        return result
    }
}
