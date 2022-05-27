import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val queryParms = listOf(listOf("typeId", "2"))
        assertEquals(
            "https://www.lintcode.com/problem?typeId=2",
            Solution().urlencode("https://www.lintcode.com/problem", queryParms)
        )
    }

    @Test
    fun BasicTest2() {
        val queryParms = listOf(
            listOf("sl", "en"),
            listOf("tl", "zh-CN"),
            listOf("text", "Hello"),
            listOf("op", "translate")
        )
        assertEquals(
            "https://translate.google.cn/?op=translate&sl=en&text=Hello&tl=zh-CN",
            Solution().urlencode("https://translate.google.cn/", queryParms)
        )
    }

    @Test
    fun BasicTest3() {
        val queryParms = listOf(listOf<String>())
        assertEquals(
            "https://www.jiuzhang.com/",
            Solution().urlencode("https://www.jiuzhang.com/", queryParms)
        )
    }
}
