import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun `2 plates`() {
        val expected = listOf("from A to B", "from A to C", "from B to C")
        assertContentEquals(expected, Solution().towerOfHanoi(2))
    }

    @Test
    fun `3 plates`() {
        val expected = listOf(
            "from A to C", "from A to B", "from C to B", "from A to C", "from B to A", "from B to C", "from A to C"

        )
        assertContentEquals(expected, Solution().towerOfHanoi(3))
    }

    @Test
    fun `4 plates`() {
        val expected = listOf(
            "from A to B",
            "from A to C",
            "from B to C",
            "from A to B",
            "from C to A",
            "from C to B",
            "from A to B",
            "from A to C",
            "from B to C",
            "from B to A",
            "from C to A",
            "from B to C",
            "from A to B",
            "from A to C",
            "from B to C"
        )
        assertContentEquals(expected, Solution().towerOfHanoi(4))
    }
}
