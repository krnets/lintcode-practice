import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(listOf(5, 3, 3, 4, 3, 0), Solution().getDistanceMetrics(intArrayOf(1, 2, 1, 1, 2, 3)))
    }

    @Test
    fun BasicTest2() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0327. Distance Metrics\\src\\test\\resources\\"
        val inputFileName = "testdatav2_327_data_23.in"
        val outputFileName = "testdatav2_327_data_23.out"

        val input = File(systemPath + projectPath + inputFileName).readText()
            .drop(1).dropLast(2).split(",").map { it.toInt() }.toIntArray()

        val expected: List<Long> = File(systemPath + projectPath + outputFileName).readText()
            .drop(1).dropLast(2).split(",").map { it.toLong() }.toList()

        assertContentEquals(expected, Solution().getDistanceMetrics(input))
    }
}
