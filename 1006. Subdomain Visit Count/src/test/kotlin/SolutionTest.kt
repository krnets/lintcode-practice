import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val cpdomains = arrayOf("9001 discuss.lintcode.com")
        val expected = listOf("9001 discuss.lintcode.com", "9001 lintcode.com", "9001 com")
        assertContentEquals(expected, Solution().subdomainVisits(cpdomains))
    }

    @Test
    fun BasicTest2() {
        val cpdomains = arrayOf("900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org")
        val expected = listOf(
            "900 google.mail.com",
            "901 mail.com",
            "951 com",
            "50 yahoo.com",
            "1 intel.mail.com",
            "5 wiki.org",
            "5 org",
        )
        assertContentEquals(expected, Solution().subdomainVisits(cpdomains))
    }
}
