import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "1,2,2,3,4,4,3"
        val root = constructBinaryTree(tree)
        assertTrue(Solution().isSymmetric(root))
    }

    @Test
    fun BasicTest2() {
        val tree = "1,2,2,#,3,#,3"
        val root = constructBinaryTree(tree)
        assertFalse(Solution().isSymmetric(root))
    }

    @Test
    fun BasicTest3() {
        val tree = "1,2,3"
        val root = constructBinaryTree(tree)
        assertFalse(Solution().isSymmetric(root))
    }
}
