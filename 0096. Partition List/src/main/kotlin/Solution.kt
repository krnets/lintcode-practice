class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/*
class Solution {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val sentinel = ListNode(-1)
        sentinel.next = head

        var prev = sentinel
        var curr = sentinel

        while (curr.next != null) {

            if (x <= curr.next!!.`val`) {
                curr = curr.next!!
                continue
            }

            if (curr == prev) {
                curr = curr.next!!
                prev = prev.next!!

            } else {
                val temp = curr.next
                curr.next = temp!!.next
                temp.next = prev.next
                prev.next = temp
                prev = prev.next!!
            }
        }
        return sentinel.next
    }
}
*/

class Solution {
    fun partition(head: ListNode?, x: Int): ListNode? {

        var left = ListNode(0)
        val leftHead = left

        var right = ListNode(0)
        val rightHead = right

        var curr = head

        while (curr != null) {

            if (curr.`val` < x) {
                left.next = curr
                left = left.next!!

            } else {
                right.next = curr
                right = right.next!!
            }

            curr = curr.next
        }

        left.next = rightHead.next
        right.next = null

        return leftHead.next
    }
}
