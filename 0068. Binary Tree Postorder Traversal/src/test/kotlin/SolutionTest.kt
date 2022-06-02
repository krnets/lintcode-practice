import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertContentEquals(listOf(2, 3, 1), Solution().postorderTraversal(root))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        assertContentEquals(listOf(3, 2, 1), Solution().postorderTraversal(root))
    }
}
