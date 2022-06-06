class Solution {
    fun multiplyLists(l1: ListNode?, l2: ListNode?): Long {
        var num1 = 0L
        var num2 = 0L
        var ptr1 = l1
        var ptr2 = l2

        while (ptr1 != null) {
            num1 *= 10
            num1 += ptr1.`val`
            ptr1 = ptr1.next
        }
        while (ptr2 != null) {
            num2 *= 10
            num2 += ptr2.`val`
            ptr2 = ptr2.next
        }

        return num1 * num2
    }
}
