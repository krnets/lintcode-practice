import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root: TreeNode? = null
        assertEquals(0, Solution().maxDepth(root))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.right!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)
        assertEquals(3, Solution().maxDepth(root))
    }

    @Test
    fun BasicTest3() {
        val root: TreeNode = TreeNode(2)
        assertEquals(1, Solution().maxDepth(root))
    }

    @Test
    fun BasicTest4() {
        val root: TreeNode = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        assertEquals(3, Solution().maxDepth(root))
    }

    @Test
    fun BasicTest5() {
        val root: TreeNode = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.left!!.right = TreeNode(5)
        root.right!!.left = TreeNode(6)
        root.right!!.right = TreeNode(7)
        assertEquals(3, Solution().maxDepth(root))
    }
}
