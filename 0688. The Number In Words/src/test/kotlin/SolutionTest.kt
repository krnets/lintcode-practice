import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("ten thousand two hundred forty five", Solution().convertWords(10245))
        assertEquals("one hundred twenty five", Solution().convertWords(125))
        assertEquals("zero", Solution().convertWords(0))
        assertEquals(
            "nine hundred eighty five million two hundred thirty seven thousand five hundred fifty",
            Solution().convertWords(985237550)
        )
    }
}
