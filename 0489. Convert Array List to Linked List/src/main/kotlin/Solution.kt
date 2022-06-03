class Solution {
    fun toLinkedList(nums: List<Int>): ListNode? {
        val sentinel = ListNode(0)
        var currNode: ListNode? = sentinel

        for (x in nums) {
            currNode!!.next = ListNode(x)
            currNode = currNode.next
        }

        return sentinel.next
    }
}