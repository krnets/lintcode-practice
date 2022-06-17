import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertTrue(Solution().checkPossibility(intArrayOf(4, 2, 3)))
    }

    @Test
    fun BasicTest2() {
        assertFalse(Solution().checkPossibility(intArrayOf(4, 2, 1)))
    }

    @Test
    fun BasicTest3() {
        assertTrue(Solution().checkPossibility(intArrayOf(1)))
    }

    @Test
    fun BasicTest4() {
        assertFalse(Solution().checkPossibility(intArrayOf(3, 4, 2, 3)))
    }

    @Test
    fun BasicTest5() {
        assertTrue(Solution().checkPossibility(intArrayOf(1, 5, 4, 6, 7, 8, 9)))
    }

    @Test
    fun BasicTest6() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\1099. Non-decreasing Array\\src\\test\\kotlin\\"
        val fileName = "testdatav2_1099_data_17.in"
        val inputArray = File(systemPath + projectPath + fileName)
            .readLines()
            .first()
            .drop(1)
            .dropLast(1)
            .split(",")
            .map { it.toInt() }
            .toIntArray()

        assertTrue(Solution().checkPossibility(inputArray))
    }

    @Test
    fun BasicTest7() {
        assertTrue(Solution().checkPossibility(intArrayOf(1, 2, 3, 4, 2, 6)))
    }
}
