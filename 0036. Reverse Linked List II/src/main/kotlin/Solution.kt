class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

class Solution {
    fun reverseBetween(head: ListNode?, m: Int, n: Int): ListNode? {
        if (head?.next == null || m == n) return head

        val sentinel = ListNode(0)
        sentinel.next = head
        var prev: ListNode? = sentinel

        repeat(m - 1) {
            prev = prev!!.next
        }

        val sectionPrev = prev!!.next
        var sectionCurr = prev!!.next!!.next

        repeat(n - m) {

            sectionPrev!!.next = sectionCurr!!.next
            sectionCurr!!.next = prev!!.next
            prev!!.next = sectionCurr
            sectionCurr = sectionPrev.next
        }

        return sentinel.next
    }
}