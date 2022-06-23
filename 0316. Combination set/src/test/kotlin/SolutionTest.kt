import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val digits = listOf(0, 1, 2, 3)
//        val expected = listOf(0, 1, 10, 11, 12, 13, 2, 20, 21, 22, 23, 3)
        val expected = listOf(0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 22, 23)
        assertContentEquals(expected, Solution().combinationSet(digits, 30))
    }

    @Test
    fun BasicTest2() {
        val digits = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0316. Combination set\\src\\test\\resources\\"
        val fileName = "testdatav2_316_data_5.out"
        val expected = File(systemPath + projectPath + fileName).readText()
            .drop(1).dropLast(2).split(",").map { it.toInt() }
        assertContentEquals(expected, Solution().combinationSet(digits, 1000000))
    }
}
