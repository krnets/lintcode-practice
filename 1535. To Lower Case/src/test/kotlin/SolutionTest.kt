import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("hello", Solution().toLowerCase("Hello"))
        assertEquals("here", Solution().toLowerCase("here"))
        assertEquals("lovely", Solution().toLowerCase("LOVELY"))
        assertEquals(
            "mymommaalwayssaid,lifewaslikeaboxofchocolates.youneverknowwhatyou'regonnaget.", Solution().toLowerCase(
                "Mymommaalwayssaid,Lifewaslikeaboxofchocolates.Youneverknowwhatyou'regonnaget."
            )
        )
    }
}
