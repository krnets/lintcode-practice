class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/*
class Solution {
    private val list = mutableListOf<Int>()

    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return list

        list.add(root.`val`)

        if (root.left != null) preorderTraversal(root.left)
        if (root.right != null) preorderTraversal(root.right)

        return list
    }
}*/

/*
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        if (root == null)
            return list

        val stack = Stack<TreeNode?>()
        stack.push(root)

        while (stack.isNotEmpty()) {
            val node = stack.pop()

            list.add(node!!.`val`)

            if (node.right != null) stack.push(node.right)
            if (node.left != null) stack.push(node.left)
        }

        return list
    }
}
*/

// Morris traversal: O(n) time, O(1) space

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        if (root == null)
            return list

        var p: TreeNode? = root
        var q: TreeNode? = null

        while (p != null) {
            q = p.left

            if (q != null) {

                while (q?.right != null && q.right != p) {
                    q = q.right
                }

                if (q?.right == null) {
                    list.add(p.`val`)
                    q?.right = p
                    p = p.left
                    continue

                } else {
                    q.right = null
                }

            } else {
                list.add(p.`val`)
            }

            p = p.right
        }

        return list
    }
}

