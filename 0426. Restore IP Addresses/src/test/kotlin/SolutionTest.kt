import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(listOf("255.255.11.135", "255.255.111.35"), Solution().restoreIpAddresses("25525511135"))
        assertContentEquals(listOf("11.165.123.11", "111.65.123.11"), Solution().restoreIpAddresses("1116512311"))
        assertContentEquals(listOf(), Solution().restoreIpAddresses(""))
        assertContentEquals(listOf(), Solution().restoreIpAddresses("0"))
        assertContentEquals(listOf("0.0.0.0"), Solution().restoreIpAddresses("0000"))
        assertContentEquals(listOf("1.1.1.1"), Solution().restoreIpAddresses("1111"))
        assertContentEquals(listOf(), Solution().restoreIpAddresses("00003"))
        assertContentEquals(listOf("0.10.0.10", "0.100.1.0"), Solution().restoreIpAddresses("010010"))
    }
}
