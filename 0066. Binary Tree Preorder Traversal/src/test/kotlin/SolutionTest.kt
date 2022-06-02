import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertContentEquals(listOf(1, 2, 3), Solution().preorderTraversal(root))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.right = TreeNode(3)
        assertContentEquals(listOf(1, 2, 3), Solution().preorderTraversal(root))
    }
}
