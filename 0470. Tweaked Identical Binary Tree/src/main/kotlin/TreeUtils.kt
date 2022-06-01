import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun maxHeight(p: TreeNode?): Int {
    if (p == null) return 0

    val leftHeight = maxHeight(p.left);
    val rightHeight = maxHeight(p.right);

    return if (leftHeight > rightHeight) leftHeight + 1 else rightHeight + 1
}

fun levelOrderBFStoString(root: TreeNode?, showEmpty: Boolean = false): String {
    if (root == null) return ""

    val treeHeight = maxHeight(root);
    val sb = StringBuilder()
    val queue = LinkedList<Pair<TreeNode?, Int>>()
    queue.offer(Pair(root, 1))

    while (queue.isNotEmpty()) {

        val (tempNode, level) = queue.poll()
        sb.append(tempNode!!.`val`).append(",")

        if (tempNode.left != null)
            queue.offer(Pair(tempNode.left, level + 1));
        else if (showEmpty && level < treeHeight)
            sb.append("#,")

        if (tempNode.right != null)
            queue.offer(Pair(tempNode.right, level + 1));
        else if (showEmpty && level < treeHeight)
            sb.append("#,")
    }

    return sb.take(sb.length - 1).toString()
}

fun constructBinaryTree(str: String): TreeNode? {
    val list: List<Int?> = str
        .split(",")
        .map {
            if (it == "#") null
            else it.toInt()
        }

    return constructBinaryTree(list)
}

fun constructBinaryTree(list: List<Int?>): TreeNode? {
    if (list.isEmpty()) return null

    val root = TreeNode(list.first()!!)
    val queue = LinkedList<TreeNode?>()
    queue.offer(root)
    var i = 1

    while (i < list.size) {
        val currNode = queue.poll()

        if (list[i] != null) {
            currNode!!.left = TreeNode(list[i]!!)
            queue.offer(currNode.left)
        }
        i++

        if (i < list.size && list[i] != null) {
            currNode!!.right = TreeNode(list[i]!!)
            queue.offer(currNode.right)
        }
        i++
    }
    return root
}
