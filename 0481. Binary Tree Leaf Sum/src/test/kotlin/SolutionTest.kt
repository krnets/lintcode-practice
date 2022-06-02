import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "1,2,3,4"
        val root = constructBinaryTree(tree)
        assertEquals(7, Solution().leafSum(root))
    }

    @Test
    fun BasicTest2() {
        val tree = "1,#,3"
        val root = constructBinaryTree(tree)
        assertEquals(3, Solution().leafSum(root))
    }
}
