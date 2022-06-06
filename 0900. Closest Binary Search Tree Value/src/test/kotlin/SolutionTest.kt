import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "5,4,9,2,#,8,10"
        val root = constructBinaryTree(tree)
        assertEquals(5, Solution().closestValue(root, 6.124780))
    }

    @Test
    fun BasicTest2() {
        val tree = "3,2,4,1"
        val root = constructBinaryTree(tree)
        assertEquals(4, Solution().closestValue(root, 4.142857))
    }
}
