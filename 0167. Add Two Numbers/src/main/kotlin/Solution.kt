/*
class Solution {
    fun addLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        val sentinel: ListNode? = ListNode(0)
        var l3ptr = sentinel
        var l2ptr = l2
        var l1ptr = l1

        while (l1ptr != null && l2ptr != null) {
            var x = l1ptr.`val` + l2ptr.`val` + carry

            if (x >= 10) {
                carry = 1
                x %= 10
            } else
                carry = 0

            l3ptr!!.next = ListNode(x)
            l3ptr = l3ptr.next
            l2ptr = l2ptr.next
            l1ptr = l1ptr.next
        }

        while (l1ptr != null) {
            var x = l1ptr.`val` + carry

            if (x >= 10) {
                carry = 1
                x %= 10
            } else
                carry = 0

            l3ptr!!.next = ListNode(x)
            l3ptr = l3ptr.next
            l1ptr = l1ptr.next
        }

        while (l2ptr != null) {
            var x = l2ptr.`val` + carry

            if (x >= 10) {
                carry = 1
                x %= 10
            } else
                carry = 0

            l3ptr!!.next = ListNode(x)
            l3ptr = l3ptr.next
            l2ptr = l2ptr.next
        }

        if (carry == 1)
            l3ptr!!.next = ListNode(carry)

        return sentinel!!.next
    }
}*/

class Solution {
    fun addLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        val sentinel: ListNode? = ListNode(0)
        var l3ptr = sentinel
        var l2ptr = l2
        var l1ptr = l1

        while (l1ptr != null || l2ptr != null) {

            val n1 = l1ptr?.`val` ?: 0
            val n2 = l2ptr?.`val` ?: 0
            val sum = n1 + n2 + carry
            carry = sum / 10

            l3ptr!!.next = ListNode(sum % 10)
            l3ptr = l3ptr.next

            if (l1ptr != null) l1ptr = l1ptr.next
            if (l2ptr != null) l2ptr = l2ptr.next
        }

        if (carry == 1)
            l3ptr!!.next = ListNode(carry)

        return sentinel!!.next
    }
}
