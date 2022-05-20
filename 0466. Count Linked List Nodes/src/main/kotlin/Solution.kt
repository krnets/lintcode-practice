class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

class Solution {
    fun countNodes(head: ListNode?): Int {
        var count = 0
        var node = head

        while (node != null) {
            count++
            node = node.next
        }
        return count
    }
}