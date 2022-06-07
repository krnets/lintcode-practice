import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "5"
        val root = constructBinaryTree(tree)
        assertContentEquals(listOf(), Solution().searchRange(root, 6, 10))
    }

    @Test
    fun BasicTest2() {
        val tree = "20,8,22,4,12"
        val root = constructBinaryTree(tree)
        assertContentEquals(listOf(12, 20, 22), Solution().searchRange(root, 10, 22))
    }
}
