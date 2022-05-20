/*
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in numbers.indices.take(numbers.size - 1)) {
            for (j in numbers.indices.drop(1)) {
                if (numbers[i] + numbers[j] == target)
                    return intArrayOf(i, j)
            }
        }
        return IntArray(0)
    }
}*/


class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf(numbers.first() to 0)

        for (i in numbers.indices.drop(1)) {
            val x = numbers[i]
            val complement = target - x

            if (map.containsKey(complement))
                return intArrayOf(map.get(complement)!!, i)
            else map.put(x, i)
        }

        return IntArray(0)
    }
}

