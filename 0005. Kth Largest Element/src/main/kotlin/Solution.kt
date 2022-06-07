import java.util.Comparator
import java.util.PriorityQueue

/*
class Solution {
    fun kthLargestElement(k: Int, nums: IntArray): Int {
        return nums.asSequence().sortedDescending().elementAt(k - 1)
    }
}*/

/*
class Solution {
    fun kthLargestElement(k: Int, nums: IntArray): Int {
        return nums.asSequence().sorted().elementAt(nums.size - k)
    }
}
*/

class Solution {
    fun kthLargestElement(k: Int, nums: IntArray): Int {
        val pq = PriorityQueue<Int>(nums.size, Comparator.reverseOrder())
        pq.addAll(nums.asSequence())

        return pq.peek()
    }
}
