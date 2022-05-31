/*
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        val sentinel = ListNode(0)
        var curr = sentinel
        sentinel.next = head

        while (curr.next != null && curr.next!!.next != null) {

            val node1 = curr.next
            val node2 = curr.next!!.next

            curr.next = node2
            node1!!.next = node2!!.next
            node2.next = node1

            curr = node1
        }

        return sentinel.next
    }
}
*/

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        val sentinel = ListNode(0)
        var curr = sentinel
        sentinel.next = head

        while (curr.next?.next != null) {

            val node1 = curr.next
            val node2 = curr.next!!.next

            curr.next = node2
            node1!!.next = node2!!.next
            node2.next = node1

            curr = node1
        }

        return sentinel.next
    }
}
