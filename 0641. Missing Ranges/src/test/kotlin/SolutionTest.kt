import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val nums = intArrayOf(0, 1, 3, 50, 75)
        val expected = listOf("2", "4->49", "51->74", "76->99")
//      in range[0,99],the missing range includes:range[2,2],range[4,49],range[51,74] and range[76,99]
        assertContentEquals(expected, Solution().findMissingRanges(nums, 0, 99))
    }

    @Test
    fun BasicTest2() {
        val nums = intArrayOf(0, 1, 2, 3, 7)
        val expected = listOf("4->6")
//      in range[0,7],the missing range include range[4,6]
        assertContentEquals(expected, Solution().findMissingRanges(nums, 0, 7))
    }

    @Test
    fun BasicTest3() {
        val nums = intArrayOf()
        val expected = listOf("1")
        assertContentEquals(expected, Solution().findMissingRanges(nums, 1, 1))
    }

    @Test
    fun BasicTest4() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val expected = listOf("9")
        assertContentEquals(expected, Solution().findMissingRanges(nums, 1, 9))
    }

    @Test
    fun BasicTest5() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val expected = listOf("0")
        assertContentEquals(expected, Solution().findMissingRanges(nums, 0, 8))
    }

    @Test
    fun BasicTest6() {
        val nums = intArrayOf(2147483647)
        val expected = listOf("0->2147483646")
        println(expected)
        assertContentEquals(expected, Solution().findMissingRanges(nums, 0, 2147483647))
    }

    @Test
    fun BasicTest7() {
        val nums = intArrayOf()
        val expected = listOf("-2147483648->2147483647")
        assertContentEquals(expected, Solution().findMissingRanges(nums, -2147483648, 2147483647))
    }

    @Test
    fun BasicTest8() {
        val nums = intArrayOf(-2147483648)
        val expected = listOf("-2147483647->100")
        println(expected)
        assertContentEquals(expected, Solution().findMissingRanges(nums, -2147483648, 100))
    }

    @Test
    fun BasicTest9() {
        val nums = intArrayOf(-2147483648)
        val expected = listOf<String>()
        assertContentEquals(expected, Solution().findMissingRanges(nums, -2147483648, -2147483648))
    }

    @Test
    fun BasicTest10() {
        val nums = intArrayOf(-2147483648, 2147483647)
        val expected = listOf("-2147483647->2147483646")
        assertContentEquals(expected, Solution().findMissingRanges(nums, -2147483648, 2147483647))
    }

    @Test
    fun BasicTest11() {
        val nums = intArrayOf(-2147483648, -2147483648, 0, 2147483647, 2147483647)
        val expected = listOf("-2147483647->-1", "1->2147483646")
        assertContentEquals(expected, Solution().findMissingRanges(nums, -2147483648, 2147483647))
    }

    @Test
    fun BasicTest12() {
        val nums = intArrayOf(-1000000000, -9999, 0, 1, 2, 10, 100, 1000, 999999999, 1000000000)
        val expected = listOf("-999999999->-10000", "-9998->-1", "3->9", "11->99", "101->999", "1001->999999998")
        assertContentEquals(expected, Solution().findMissingRanges(nums, -1000000000, 1000000000))
    }

    @Test
    fun BasicTest13() {
        val systemPath = "${System.getenv("USERPROFILE")}\\"
        val projectPath = "source\\lintcode-practice\\0641. Missing Ranges\\src\\test\\resources\\"
        val inputFilename = "testdatav2_641_data_14.in"
        val outputFilename = "testdatav2_641_data_14.out"
        val nums = File(systemPath + projectPath + inputFilename)
            .readText().drop(1).dropLast(2).split(",").map { it.toInt() }.toIntArray()

        val expected = File(systemPath + projectPath + outputFilename)
            .readText().drop(1).dropLast(1).split(",")
            .map { it.drop(1).dropLast(1) }

        val actual = Solution().findMissingRanges(nums, -2147465393, 2147481714)
        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertEquals(expected[i], actual[i])
    }
}
