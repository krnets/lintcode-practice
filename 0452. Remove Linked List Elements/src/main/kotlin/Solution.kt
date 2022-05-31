/*
class Solution {
    fun removeElements(head: ListNode?, val_: Int): ListNode? {
        val sentinel = ListNode(0)
        var prev = sentinel
        var curr = head
        prev.next = curr

        while (curr != null) {
            if (curr.`val` == val_)
                prev.next = curr.next
            else prev = curr

            curr = curr.next
        }

        return sentinel.next
    }
}*/

class Solution {
    fun removeElements(head: ListNode?, val_: Int): ListNode? {
        val sentinel: ListNode? = ListNode(0)
        sentinel!!.next = head
        var curr = sentinel

        while (curr!!.next != null) {
            if (curr.next!!.`val` == val_)
                curr.next = curr.next!!.next
            else curr = curr.next
        }

        return sentinel.next
    }
}
