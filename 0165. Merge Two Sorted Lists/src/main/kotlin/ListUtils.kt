class ListNode(x: Int) {
    var `val`: Int = x
    var next: ListNode? = null
}

fun listToString(head: ListNode?): String {
    var currNode = head
    val sb = StringBuilder()

    while (currNode != null) {
        sb.append(currNode.`val`).append("->")
        currNode = currNode.next
    }
    return sb.append("null").toString()
}

fun String.toListNode(): ListNode? {
    val ints = this.split("->").dropLast(1).map { it.toInt() }

    if (ints.isEmpty()) return null

    val head = ListNode(ints.first())
    var rest: ListNode? = head

    for (x in ints.drop(1)) {
        rest?.next = ListNode(x)
        rest = rest?.next
    }

    return head
}
