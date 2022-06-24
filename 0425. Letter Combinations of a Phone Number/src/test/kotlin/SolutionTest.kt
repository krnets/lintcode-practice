import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            Solution().letterCombinations("23")
        )
    }

    @Test
    fun BasicTest2() {
        assertContentEquals(listOf("j", "k", "l"), Solution().letterCombinations("5"))
    }

    @Test
    fun BasicTest3() {
        assertContentEquals(listOf(), Solution().letterCombinations(""))
    }
}
