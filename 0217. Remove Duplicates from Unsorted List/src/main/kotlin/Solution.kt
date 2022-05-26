class Solution {
    fun removeDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        val seen = mutableSetOf<Int>()
        seen.add(head.`val`)

        var prevNode = head
        var currNode = head.next

        while (currNode != null) {
            if (seen.contains(currNode.`val`)) {
                currNode = currNode.next
            } else {
                seen.add(currNode.`val`)
                prevNode!!.next = currNode
                prevNode = currNode
            }
        }
        prevNode!!.next = null

        return head
    }
}