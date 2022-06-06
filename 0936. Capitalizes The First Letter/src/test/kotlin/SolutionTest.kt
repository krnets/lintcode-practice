import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("I Want To Get An Accepted", Solution().capitalizesFirst("i want to get an accepted"))

        assertEquals(
            "I Jidls    Mdijf  I  Lsidj  I P L   ",
            Solution().capitalizesFirst("i jidls    mdijf  i  lsidj  i p l   ")
        )
    }
}
