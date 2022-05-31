import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {

    @Test
    fun BasicTest1() {
        val treeA = "1,2,2,4"
        val treeB = "1,2,2,4"
        val rootA = constructBinaryTree(treeA)
        val rootB = constructBinaryTree(treeB)
        assertTrue(Solution().isIdentical(rootA, rootB))
    }

    @Test
    fun BasicTest2() {
        val treeA = "1,2,3,4"
        val treeB = "1,2,3,#,4"
        val rootA = constructBinaryTree(treeA)
        val rootB = constructBinaryTree(treeB)
        assertFalse(Solution().isIdentical(rootA, rootB))
    }
}
