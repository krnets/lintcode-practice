import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(
            listOf("book"),
            Solution().findWords("bcogtadsjofisdhklasdj", listOf("book", "code", "tag"))
        )
    }

    @Test
    fun BasicTest2() {
        assertContentEquals(
            listOf("nowhere", "moniter"),
            Solution().findWords("nmownhiterer", listOf("nowhere", "monitor", "moniter"))
        )
    }
}
