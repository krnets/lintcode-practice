import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(listOf(2, 5), Solution().primeFactorization(10))
        assertContentEquals(listOf(2, 2, 3, 5, 11), Solution().primeFactorization(660))
        assertContentEquals(listOf(5), Solution().primeFactorization(5))
        assertContentEquals(listOf(1000000007), Solution().primeFactorization(1000000007))
    }
}
