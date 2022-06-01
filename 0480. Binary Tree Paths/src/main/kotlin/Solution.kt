import java.util.*

/*
class Solution {
    private val paths = mutableListOf<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return paths

        val nodeQueue = LinkedList<TreeNode>()
        val pathQueue = LinkedList<String>()

        nodeQueue.offer(root)
        pathQueue.offer(root.`val`.toString())

        while (nodeQueue.isNotEmpty()) {

            val node = nodeQueue.poll()
            val path = pathQueue.poll()

            if (node.left == null && node.right == null)
                paths.add(path)
            else {

                if (node.left != null) {
                    nodeQueue.offer(node.left)
                    pathQueue.offer("$path->${node.left!!.`val`}")
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right)
                    pathQueue.offer("$path->${node.right!!.`val`}")
                }
            }
        }

        return paths
    }
}
*/

class Solution {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        val paths = mutableListOf<String>()

        if (root == null) return paths

        if (root.left == null && root.right == null) {
            return mutableListOf(root.`val`.toString())
        }
        val leftPath = binaryTreePaths(root.left)
        val rightPath = binaryTreePaths(root.right)

        for (s in rightPath) paths.add("${root.`val`}->$s")

        for (s in leftPath) paths.add("${root.`val`}->$s")

        return paths
    }
}
