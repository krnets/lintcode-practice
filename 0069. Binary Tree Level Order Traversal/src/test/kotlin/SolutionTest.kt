import org.junit.Test
import kotlin.test.assertTrue

class SolutionTest {

    @Test
    fun BasicTest1() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        val result = Solution().levelOrder(root)
        val expected = listOf(listOf(1), listOf(2, 3))

        assertTrue {
            expected.zip(result).all { it.first.all { x -> x in it.second } }
        }
    }

    @Test
    fun BasicTest2() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right!!.left = TreeNode(3)
        val result = Solution().levelOrder(root)
        val expected = listOf(listOf(1), listOf(2), listOf(3))

        assertTrue {
            expected.zip(result).all { it.first.all { x -> x in it.second } }
        }
    }
}
