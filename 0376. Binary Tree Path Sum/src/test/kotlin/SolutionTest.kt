import org.junit.Test
import kotlin.test.assertTrue

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "1,2,4,2,3"
        val root = constructBinaryTree(tree)
        val expected = listOf(intArrayOf(1, 2, 2), intArrayOf(1, 4))
        val actual = Solution().binaryTreePathSum(root, 5)
        val res = expected.zip(actual).all { it.first.contentEquals(it.second) }
        assertTrue(res)
    }

    @Test
    fun BasicTest2() {
        val tree = "1,2,4,2,3"
        val root = constructBinaryTree(tree)
        val expected = listOf<IntArray>()
        val actual = Solution().binaryTreePathSum(root, 3)
        val res = expected.zip(actual).all { it.first.contentEquals(it.second) }
        assertTrue(res)
    }
}
