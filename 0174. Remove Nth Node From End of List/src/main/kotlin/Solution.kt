class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val sentinel = ListNode(0)
        sentinel.next = head
        var prev: ListNode? = sentinel
        var curr = head
        var length = 0

        while (curr != null) {
            length++
            curr = curr.next
        }

        curr = head

        while (length - n > 0) {
            prev = curr
            curr = curr!!.next
            length--
        }
        prev!!.next = curr!!.next

        return sentinel.next
    }
}
