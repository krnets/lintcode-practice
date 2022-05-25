class Solution {
    fun nthToLast(head: ListNode?, n: Int): ListNode? {
        var currNode = head
        var pos = 0

        while (currNode != null) {
            pos++
            currNode = currNode.next
        }
        currNode = head

        while (pos - n > 0) {
            pos--
            currNode = currNode!!.next
        }

        return currNode
    }
}