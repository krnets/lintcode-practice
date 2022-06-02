import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val names = arrayOf("James", "james", "Bill Gates", "bill Gates", "Hello World", "HELLO WORLD", "Helloworld")
        val expected = listOf("james", "bill gates", "hello world", "helloworld")
        assertContentEquals(expected, Solution().nameDeduplication(names))
    }

    @Test
    fun BasicTest2() {
        val names = arrayOf("cmy", "Cmy")
        val expected = listOf("cmy")
        assertContentEquals(expected, Solution().nameDeduplication(names))
    }
}
