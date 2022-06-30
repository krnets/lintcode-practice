import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals("ca", Solution().zumaGaming("abbaca", 2))
    }

    @Test
    fun BasicTest2() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0276. another zuma\\src\\test\\resources\\"
        val inputFilename = "testdatav2_276_data_103.in"
        val outputFilename = "testdatav2_276_data_103.out"
        val input = File(systemPath + projectPath + inputFilename).readText()
        val expected = File(systemPath + projectPath + outputFilename).readText()
        assertEquals(expected, Solution().zumaGaming(input, 2))
    }
}
