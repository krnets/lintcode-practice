import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().numJewelsInStones("aA", "aAAbbbb"))
        assertEquals(0, Solution().numJewelsInStones("z", "ZZ"))
    }
}
