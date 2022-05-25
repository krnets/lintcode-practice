/*
class Solution {
    fun insertionSortList(head: ListNode?): ListNode? {
        val sentinel: ListNode? = ListNode(0)
        sentinel!!.next = head
        var insertion = head
        var curr = head!!.next

        while (curr != null) {

            if (insertion!!.`val` <= insertion.next!!.`val`) {
                insertion = insertion.next
            } else {
                var sortedNode = sentinel

                while (sortedNode!!.next!!.`val` <= curr.`val`) {
                    sortedNode = sortedNode.next
                }
                insertion.next = curr.next
                curr.next = sortedNode.next
                sortedNode.next = curr
            }
            curr = insertion!!.next
        }
        return sentinel.next
    }
}*/

class Solution {
    fun insertionSortList(head: ListNode?): ListNode? {
        if (head == null) return null

        val sentinel: ListNode? = ListNode(0)
        var curr = head

        while (curr != null) {

            var sortedPart = sentinel

            while (sortedPart!!.next != null && sortedPart.next!!.`val` < curr.`val`) {
                sortedPart = sortedPart.next
            }

            val rest = curr.next
            curr.next = sortedPart.next
            sortedPart.next = curr
            curr = rest
        }
        return sentinel?.next
    }
}
