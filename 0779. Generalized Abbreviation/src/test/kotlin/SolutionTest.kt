import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
//        val expected = listOf(
//            "word", "1ord", "w1rd", "wo1d", "wor1",
//            "2rd", "w2d", "wo2",
//            "1o1d", "1or1", "w1r1",
//            "1o2", "2r1",
//            "3d", "w3",
//            "4"
//        )
        val expected = listOf(
            "word", "wor1", "wo1d", "wo2", "w1rd", "w1r1", "w2d", "w3",
            "1ord", "1or1", "1o1d", "1o2", "2rd", "2r1", "3d", "4"
        )
//        val expected = listOf(
//            "4", "3d", "2r1", "2rd", "1o2", "1o1d", "1or1", "1ord",
//            "w3", "w2d", "w1r1", "w1rd", "wo2", "wo1d", "wor1", "word"
//        )
        assertContentEquals(expected, Solution().generateAbbreviations("word"))
    }

    @Test
    fun BasicTest2() {
//        val expected = listOf(
//            "1o1a1", "1o1ay", "1o2y", "1o3", "1od1y", "1od2", "1oda1", "1oday",
//            "2d1y", "2d2", "2da1", "2day",
//            "3a1", "3ay",
//            "4y",
//            "5",
//            "t1d1y", "t1d2", "t1da1", "t1day", "t2a1",
//            "t2ay", "t3y", "t4",
//            "to1a1", "to1ay", "to2y", "to3",
//            "tod1y", "tod2", "toda1", "today"
//        )
        val expected = listOf(
            "today", "toda1", "tod1y", "tod2", "to1ay", "to1a1", "to2y", "to3",
            "t1day", "t1da1", "t1d1y", "t1d2", "t2ay", "t2a1", "t3y", "t4",
            "1oday", "1oda1", "1od1y", "1od2", "1o1ay", "1o1a1", "1o2y", "1o3",
            "2day", "2da1", "2d1y", "2d2", "3ay", "3a1", "4y", "5"
        )
//        val expected = listOf(
//            "5", "4y", "3a1", "3ay", "2d2", "2d1y", "2da1", "2day",
//            "1o3", "1o2y", "1o1a1", "1o1ay", "1od2", "1od1y", "1oda1", "1oday",
//            "t4", "t3y", "t2a1", "t2ay", "t1d2", "t1d1y", "t1da1", "t1day",
//            "to3", "to2y", "to1a1", "to1ay", "tod2", "tod1y", "toda1", "today"
//        )
        assertContentEquals(expected, Solution().generateAbbreviations("today"))
    }
}
