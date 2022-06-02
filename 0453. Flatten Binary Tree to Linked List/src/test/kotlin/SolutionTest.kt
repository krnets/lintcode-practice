import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val inputTreeString = "1,2,5,3,4,#,6".split(",").map { if (it == "#") null else it.toInt() }
        val root = constructBinaryTree(inputTreeString)
        Solution().flatten(root)
        val actual = levelOrderBFStoString(root)

        val outputTreeString = "1,#,2,#,3,#,4,#,5,#,6".split(",").map { if (it == "#") null else it.toInt() }
        val secondRoot = constructBinaryTree(outputTreeString)
        val expected = levelOrderBFStoString(secondRoot)

        assertEquals(expected, actual)
    }
}
