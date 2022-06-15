import java.util.*

class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null

}

/*
class Solution {
    fun reverseStore(head: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var curr = head

        while (curr != null) {
            result.add(curr.`val`)
            curr = curr.next
        }

        return result.reversed()
    }
}*/

class Solution {
    fun reverseStore(head: ListNode?): List<Int> {
        val result = LinkedList<Int>()
        var curr = head

        while (curr != null) {
            result.addFirst(curr.`val`)
            curr = curr.next
        }

        return result
    }
}
