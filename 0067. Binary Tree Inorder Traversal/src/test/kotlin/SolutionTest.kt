import org.junit.Test
import kotlin.test.assertContentEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertContentEquals(listOf(2, 1, 3), Solution().inorderTraversal(root))
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        assertContentEquals(listOf(1, 3, 2), Solution().inorderTraversal(root))
    }
}
