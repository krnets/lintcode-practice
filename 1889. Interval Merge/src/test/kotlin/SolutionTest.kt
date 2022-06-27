import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun `true`() {
        assertTrue(Solution().mergeJudge("[a,b]", "[b,c]"))
        assertTrue(Solution().mergeJudge("[a,b]", "(b,c]"))
        assertTrue(Solution().mergeJudge("(b,c)", "[a,b]"))
        assertTrue(Solution().mergeJudge("(b,ccccccccccccc)", "(aaaaaaaaaaa,bbbbbbbbbbbbbbbb)"))
    }

    @Test
    fun `false`() {
        assertFalse(Solution().mergeJudge("[a,b)", "(b,c]"))
    }
}
