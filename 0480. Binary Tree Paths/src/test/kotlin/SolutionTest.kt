import org.junit.Test
import kotlin.test.assertContentEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "1,2,3,#,5"
        val root = constructBinaryTree(tree)
        val expected = listOf("1->3", "1->2->5")
        assertContentEquals(expected, Solution().binaryTreePaths(root))
    }

    @Test
    fun BasicTest2() {
        val tree = "1,2"
        val root = constructBinaryTree(tree)
        val expected = listOf("1->2")
        assertContentEquals(expected, Solution().binaryTreePaths(root))
    }
}
