class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1

        val sentinel = ListNode(0)

        var l3ptr: ListNode? = sentinel
        var l2ptr = l2
        var l1ptr = l1

        while (l1ptr != null && l2ptr != null) {
            if (l1ptr.`val` < l2ptr.`val`) {
                l3ptr!!.next = ListNode(l1ptr.`val`)
                l1ptr = l1ptr.next
            } else {
                l3ptr!!.next = ListNode(l2ptr.`val`)
                l2ptr = l2ptr.next

            }
            l3ptr = l3ptr.next
        }

        while (l1ptr != null) {
            l3ptr!!.next = ListNode(l1ptr.`val`)
            l1ptr = l1ptr.next
            l3ptr = l3ptr.next
        }

        while (l2ptr != null) {
            l3ptr!!.next = ListNode(l2ptr.`val`)
            l2ptr = l2ptr.next
            l3ptr = l3ptr.next
        }

        return sentinel.next
    }
}