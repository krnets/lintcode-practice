class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

class Solution {
    fun toArrayList(head: ListNode?): List<Int> {
        val list = mutableListOf<Int>()
        var current = head

        while (current != null) {
            list.add(current.`val`)
            current = current.next
        }

        return list
    }
}