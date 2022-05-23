class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/*
class Solution {
    private val list = mutableListOf<Int>()

    fun postorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return list

        if (root.left != null) postorderTraversal(root.left)
        if (root.right != null) postorderTraversal(root.right)

        list.add(root.`val`)

        return list
    }
}*/

/*
class Solution {

    fun postorderTraversal(root: TreeNode?): List<Int> {

        val list = mutableListOf<Int>()

        if (root == null) return list

        val stack = Stack<TreeNode?>()
        var curr = root

        while (curr != null) {
            stack.add(curr)
            curr = if (curr.left != null) curr.left else curr.right
        }

        while (stack.isNotEmpty()) {

            curr = stack.pop()
            list.add(curr!!.`val`)

            if (stack.isNotEmpty() && stack.peek()!!.left == curr) {
                curr = stack.peek()!!.right

                while (curr != null) {
                    stack.add(curr)

                    curr = if (curr.left != null) curr.left else curr.right
                }
            }
        }

        return list
    }
}
*/

// Morris traversal post-order: O(n) time, O(1) space

class Solution {

    private val list = mutableListOf<Int>()

    fun postorderTraversal(root: TreeNode?): List<Int> {

        if (root == null) return list

        var p1: TreeNode? = root
        var p2: TreeNode?

        while (p1 != null) {
            p2 = p1.left

            if (p2 != null) {

                while (p2!!.right != null && p2.right != p1) {
                    p2 = p2.right
                }

                if (p2.right == null) {
                    p2.right = p1
                    p1 = p1.left
                    continue

                } else {
                    p2.right = null
                    addPath(p1.left)
                }
            }
            p1 = p1.right
        }
        addPath(root)

        return list
    }

    private fun addPath(root: TreeNode?) {
        var count = 0
        var node = root

        while (node != null) {
            count++
            list.add(node.`val`)
            node = node.right
        }

        var left = list.size - count
        var right = list.size - 1

        while (left < right) {

            list[left] = list[right]
                .also { list[right] = list[left] }

            left++
            right--
        }
    }
}
