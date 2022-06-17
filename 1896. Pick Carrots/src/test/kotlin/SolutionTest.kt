import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val carrot = arrayOf(
            intArrayOf(5, 7, 6, 3),
            intArrayOf(2, 4, 8, 12),
            intArrayOf(3, 5, 10, 7),
            intArrayOf(4, 16, 4, 17)
        )
        assertEquals(83, Solution().pickCarrots(carrot))
    }

    @Test
    fun BasicTest2() {
        val carrot = arrayOf(
            intArrayOf(5, 3, 7, 1, 7),
            intArrayOf(4, 6, 5, 2, 8),
            intArrayOf(2, 1, 1, 4, 6),
        )
        assertEquals(30, Solution().pickCarrots(carrot))
    }

    @Test
    fun BasicTest3() {
        val carrot = arrayOf(
            intArrayOf(2, 0, 2),
            intArrayOf(0, 2, 0),
            intArrayOf(2, 0, 2),
        )
        assertEquals(2, Solution().pickCarrots(carrot))
    }

    @Test
    fun BasicTest4() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\1896. Pick Carrots\\src\\test\\kotlin\\"
        val fileName = "testdatav2_1896_data_19.in"
        val carrot = File(systemPath + projectPath + fileName)
            .readText()
            .drop(1)
            .dropLast(2)
            .split("],")
            .map { line ->
                line.drop(1)
                    .split(",")
                    .map { it.toInt() }
                    .toIntArray()
            }.toTypedArray()

        assertEquals(1223307, Solution().pickCarrots(carrot))
    }
}
