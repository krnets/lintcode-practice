import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(2, Solution().search(intArrayOf(4, 5, 1, 2, 3), 1))
    }

    @Test
    fun BasicTest2() {
    }

    @Test
    fun BasicTest3() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0062. Search in Rotated Sorted Array\\src\\test\\resources\\"
        val fileName = "testdatav2_62_data_11.in"
        val inputArray = File(systemPath + projectPath + fileName).readText().split(",").map { it.toInt() }.toIntArray()
        assertEquals(2548, Solution().search(inputArray, 8))
    }
}
