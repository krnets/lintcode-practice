import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(intArrayOf(1, 2), Solution().twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertContentEquals(intArrayOf(1, 2), Solution().twoSum(intArrayOf(2, 3), 5))
        assertContentEquals(intArrayOf(2, 3), Solution().twoSum(intArrayOf(-1, 0, 1), 1))
    }

    @Test
    fun BasicTest2() {
        assertContentEquals(
            intArrayOf(11, 18),
            Solution().twoSum(
                intArrayOf(
                    -67,
                    -54,
                    -23,
                    1,
                    1,
                    2,
                    2,
                    3,
                    5,
                    6,
                    7,
                    23,
                    23,
                    33,
                    33,
                    33,
                    100,
                    400,
                    2423,
                    8787
                ), 407
            )
        )
    }
}
