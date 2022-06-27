import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(2, Solution().minItem(listOf(1, 1, 1, 2, 2, 3), 2))
        assertEquals(0, Solution().minItem(listOf(1), 1))
    }

    @Test
    fun BasicTest2() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\1914. Smart Sale\\src\\test\\resources\\"
        val fileName = "testdatav2_1914_data_6.in"
        val inputList = File(systemPath + projectPath + fileName).readText()
            .drop(1)
            .dropLast(1)
            .split(",")
            .map { it.toInt() }
        assertEquals(0, Solution().minItem(inputList, 100000))
    }
}
