import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(1, 2, 4), Solution().plusOne(intArrayOf(1, 2, 3)))
        assertContentEquals(intArrayOf(1, 0, 0, 0), Solution().plusOne(intArrayOf(9, 9, 9)))

        assertContentEquals(
            intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1),
            Solution().plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
        )
    }
}
