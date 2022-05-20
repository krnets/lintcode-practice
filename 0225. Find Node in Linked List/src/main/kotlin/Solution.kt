class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

class Solution {
    fun findNode(head: ListNode?, val_: Int): ListNode? {
        var node = head

        while (node != null) {

            if (node.`val` == val_)
                return node

            node = node.next
        }
        return null
    }
}