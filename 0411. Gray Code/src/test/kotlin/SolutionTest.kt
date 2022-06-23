import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(listOf(0), Solution().grayCode(0))
        assertContentEquals(listOf(0, 1), Solution().grayCode(1))
        assertContentEquals(listOf(0, 1, 3, 2), Solution().grayCode(2))
        assertContentEquals(listOf(0, 1, 3, 2, 6, 7, 5, 4), Solution().grayCode(3))

        println(Solution().grayCode(1).map { it.toString(2).padStart(4, '0') })
        println(Solution().grayCode(2).map { it.toString(2).padStart(4, '0') })
        println(Solution().grayCode(3).map { it.toString(2).padStart(4, '0') })
        println(Solution().grayCode(4).map { it.toString(2).padStart(4, '0') })
        println(Solution().grayCode(5).map { it.toString(2).padStart(4, '0') })

        println(Solution().grayCode(1))
        println(Solution().grayCode(2))
        println(Solution().grayCode(3))
        println(Solution().grayCode(4))
        println(Solution().grayCode(5))
    }
}
