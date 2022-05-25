/*
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var curr = head

        while (curr != null)
            if (curr.`val` == curr.next?.`val`)
                curr.next = curr.next!!.next
            else curr = curr.next

        return head
    }
}*/

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        var slow = head
        var fast = head.next

        while (fast != null) {
            if (slow!!.`val` == fast.`val`) {
                slow.next = fast.next
                fast = fast.next
            } else {
                slow = fast
                fast = fast.next
            }
        }
        return head
    }
}
