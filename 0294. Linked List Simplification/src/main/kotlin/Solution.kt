class Solution {
    fun simplify(head: ListNode?): ListNode? {
        var prevNode = head
        var currNode = head!!.next
        var counter = -1

        while (currNode != null) {
            counter++
            prevNode = currNode
            currNode = currNode.next
        }
        val arr = "$counter".toCharArray()
        var midNode: ListNode? = null

        for (c in arr.reversed()) {
            midNode = ListNode(c.toInt())
            midNode.next = prevNode
            prevNode = midNode
        }
        head.next = midNode

        return head
    }
}