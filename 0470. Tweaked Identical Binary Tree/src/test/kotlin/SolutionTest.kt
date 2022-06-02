import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val treeA = "1,2,3,4"
        val treeB = "1,3,2,#,#,#,4"
        val rootA = constructBinaryTree(treeA)
        val rootB = constructBinaryTree(treeB)
        assertTrue(Solution().isTweakedIdentical(rootA, rootB))
    }

    @Test
    fun BasicTest2() {
        val treeA = "1,2,3,4"
        val treeB = "1,3,2,4"
        val rootA = constructBinaryTree(treeA)
        val rootB = constructBinaryTree(treeB)
        assertFalse(Solution().isTweakedIdentical(rootA, rootB))
    }
}
