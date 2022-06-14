class Solution {
    fun threeSum(numbers: IntArray): List<IntArray> {
        numbers.sort()
        val n = numbers.size
        val result = mutableListOf<IntArray>()

        for ((i, x) in numbers.withIndex()) {
            if (i > 0 && x == numbers[i - 1]) continue

            var left = i + 1
            var right = n - 1

            while (left < right) {
                val sum = x + numbers[left] + numbers[right]

                if (sum < 0) {
                    left++
                } else if (sum > 0)
                    right--
                else {
                    result.add(intArrayOf(x, numbers[left], numbers[right]))
                    left++

                    while (numbers[left] == numbers[left - 1] && left < right)
                        left++
                }
            }
        }

        return result
    }
}
