import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(0, Solution().minDepth(null))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        assertEquals(3, Solution().minDepth(root))
    }

    @Test
    fun BasicTest3() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.right!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)
        assertEquals(2, Solution().minDepth(root))
    }
}
