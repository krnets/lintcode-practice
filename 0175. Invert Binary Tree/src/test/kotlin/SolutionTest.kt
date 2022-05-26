import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val input = "1,3,#".split(",").map { if (it == "#") null else it.toInt() }
        val root = constructBinaryTree(input)
        Solution().invertBinaryTree(root)
        val after = levelOrderBFStoString(root)
        val expected = "1,3"
        assertEquals(expected, after)
    }

    @Test
    fun BasicTest2() {
        val input = "1,2,3,#,#,4".split(",").map { if (it == "#") null else it.toInt() }
        val root = constructBinaryTree(input)
        Solution().invertBinaryTree(root)
        val after = levelOrderBFStoString(root)
        val expected = "1,3,2,4"
        assertEquals(expected, after)
    }

    @Test
    fun BasicTest3() {
        val input = listOf<Int?>()
        val root = constructBinaryTree(input)
        Solution().invertBinaryTree(root)
        val after = levelOrderBFStoString(root)
        val expected = ""
        assertEquals(expected, after)
    }

    @Test
    fun BasicTest4() {
        val input = "2,1,3".split(",").map { if (it == "#") null else it.toInt() }
        val root = constructBinaryTree(input)
        Solution().invertBinaryTree(root)
        val after = levelOrderBFStoString(root)
        val expected = "2,3,1"
        assertEquals(expected, after)
    }

    @Test
    fun BasicTest5() {
        val input = "4,2,7,1,3,6,9".split(",").map { if (it == "#") null else it.toInt() }
        val root = constructBinaryTree(input)
        Solution().invertBinaryTree(root)
        val after = levelOrderBFStoString(root)
        val expected = "4,7,2,9,6,3,1"
        assertEquals(expected, after)
    }
}
