import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().musicPairs(intArrayOf(1, 2, 59, 60)))
        assertEquals(
            41,
            Solution().musicPairs(
                intArrayOf(
                    55, 54, 18, 36, 25, 18, 36, 53, 13, 11, 50, 27, 5, 43, 26, 37, 34, 38, 60, 33, 33,
                    27, 9, 21, 8, 22, 42, 17, 42, 49, 23, 41, 45, 8, 24, 52, 3, 17, 16, 25, 33, 12, 43,
                    17, 58, 53, 31, 18, 20, 55, 27, 54, 38, 33, 28, 11, 38, 23, 49, 10
                )
            )
        )
    }
}
