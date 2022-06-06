import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(
            3,
            Solution().shortestDistance(
                arrayOf("practice", "makes", "perfect", "coding", "makes"),
                "coding",
                "practice"
            )
        )
    }

    @Test
    fun BasicTest2() {
        assertEquals(
            4,
            Solution().shortestDistance(
                arrayOf(
                    "this",
                    "is",
                    "a",
                    "long",
                    "sentence",
                    "is",
                    "fun",
                    "day",
                    "today",
                    "sunny",
                    "weather",
                    "is",
                    "a",
                    "day",
                    "tuesday",
                    "this",
                    "sentence",
                    "run",
                    "running",
                    "rainy"
                ),
                "this",
                "rainy"
            )
        )
    }

    @Test
    fun BasicTest3() {
        assertEquals(
            2,
            Solution().shortestDistance(
                arrayOf(
                    "this",
                    "is",
                    "a",
                    "long",
                    "sentence",
                    "is",
                    "fun",
                    "day",
                    "today",
                    "sunny",
                    "weather",
                    "is",
                    "a",
                    "day",
                    "tuesday",
                    "this",
                    "sentence",
                    "run",
                    "running",
                    "rainy"
                ),
                "sentence",
                "a"
            )
        )
    }
}
