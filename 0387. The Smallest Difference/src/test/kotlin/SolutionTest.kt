import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arrA = intArrayOf(3, 6, 7, 4)
        val arrB = intArrayOf(2, 8, 9, 3)
        assertEquals(0, Solution().smallestDifference(arrA, arrB))
    }

    @Test
    fun BasicTest2() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0387. The Smallest Difference\\"
        val fileName = "testdatav2_387_data_15.in"
        val (arrA, arrB) = File(systemPath + projectPath + fileName).readLines()
            .map { line ->
                line.drop(1)
                    .dropLast(1)
                    .split(",")
                    .map { it.toInt() }
                    .toIntArray()
            }

        assertEquals(158896, Solution().smallestDifference(arrA, arrB))
    }
}
