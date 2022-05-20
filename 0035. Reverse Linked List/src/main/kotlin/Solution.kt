class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

/*
class Solution {
    fun reverse(head: ListNode?): ListNode? {

        var prevNode: ListNode? = null
        var currNode = head
        var nextNode: ListNode?

        while (currNode != null) {

            nextNode = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
        }

        return prevNode
    }
}*/

class Solution {
    fun reverse(head: ListNode?): ListNode? {

        if (head?.next == null) return head

        val ans = reverse(head.next)
        head.next!!.next = head
        head.next = null

        return ans
    }
}
