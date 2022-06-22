import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", Solution().toGoatLatin("I speak Goat Latin"))
        assertEquals("Gmaa UxjRmaaa", Solution().toGoatLatin("G UxjR"))
    }
}
