class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/*
class Solution {
    val list = mutableListOf<Int>()

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return list

        if (root.left != null) inorderTraversal(root.left)
        list.add(root.`val`)
        if (root.right != null) inorderTraversal(root.right)

        return list
    }
}*/

/*
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        if (root == null) return list

        var currNode = root
        val stack = Stack<TreeNode>()

        while (currNode != null) {
            stack.push(currNode)
            currNode = currNode.left
        }

        while (stack.isNotEmpty()) {

            currNode = stack.pop()
            list.add(currNode.`val`)

            if (currNode.right != null) {
                currNode = currNode.right

                while (currNode != null) {
                    stack.push(currNode)
                    currNode = currNode.left
                }
            }
        }

        return list
    }
}
*/

// Morris traversal algorithm: O(n) time, O(1) space

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        var curr: TreeNode? = root

        while (curr != null) {
            if (curr.left != null) {
                var predecessor = curr.left

                // Find the inorder predecessor of current
                while (predecessor?.right != null && predecessor.right != curr) {
                    predecessor = predecessor.right
                }

                // Make current as the right child of its inorder predecessor
                if (predecessor?.right == null) {
                    predecessor?.right = curr
                    curr = curr.left
                } else {

                    // Revert the changes, fix the right child of predecessor
                    predecessor.right = null
                    list.add(curr.`val`)
                    curr = curr.right
                }

            } else {
                list.add(curr.`val`)
                curr = curr.right
            }
        }

        return list
    }
}
