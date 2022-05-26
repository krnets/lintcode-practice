class Solution {
    fun insertNode(head: ListNode?, val_: Int): ListNode? {
        if (head == null) return ListNode(val_)

        if (val_ < head.`val`) {
            val newHead = ListNode(val_)
            newHead.next = head
            return newHead
        }
        var prevNode = head
        var currNode = head.next
        val newNode = ListNode(val_)

        while (currNode != null) {

            if (prevNode!!.`val` < val_ && val_ <= currNode.`val`) {
                newNode.next = currNode
                prevNode.next = newNode
                break
            }
            prevNode = currNode
            currNode = currNode.next
        }
        if (currNode == null)
            prevNode!!.next = newNode

        return head
    }
}