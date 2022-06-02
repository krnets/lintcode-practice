import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertTrue(Solution().isBalanced(root))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        root.right!!.right = TreeNode(4)
        assertFalse(Solution().isBalanced(root))
    }
}
