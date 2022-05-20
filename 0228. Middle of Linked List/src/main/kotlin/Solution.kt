class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return null

        var fast = head.next
        var slow = head

        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
        }

        return slow
    }
}