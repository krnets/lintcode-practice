import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("1", Solution().countAndSay(1))
        assertEquals("11", Solution().countAndSay(2))
        assertEquals("21", Solution().countAndSay(3))
        assertEquals("1211", Solution().countAndSay(4))
        assertEquals("111221", Solution().countAndSay(5))
        assertEquals("312211", Solution().countAndSay(6))
        assertEquals("13112221", Solution().countAndSay(7))
        assertEquals("1113213211", Solution().countAndSay(8))
        assertEquals("31131211131221", Solution().countAndSay(9))
        assertEquals("13211311123113112211", Solution().countAndSay(10))
        assertEquals("11131221133112132113212221", Solution().countAndSay(11))
        assertEquals("3113112221232112111312211312113211", Solution().countAndSay(12))
        assertEquals("1321132132111213122112311311222113111221131221", Solution().countAndSay(13))
        assertEquals("11131221131211131231121113112221121321132132211331222113112211", Solution().countAndSay(14))
        assertEquals(
            "311311222113111231131112132112311321322112111312211312111322212311322113212221",
            Solution().countAndSay(15)
        )
        assertEquals(
            "132113213221133112132113311211131221121321131211132221123113112221131112311332111213211322211312113211",
            Solution().countAndSay(16)
        )
        assertEquals(
            "11131221131211132221232112111312212321123113112221121113122113111231133221121321132132211331121321231231121113122113322113111221131221",
            Solution().countAndSay(17)
        )
        assertEquals(
            "31131122211311123113321112131221123113112211121312211213211321322112311311222113311213212322211211131221131211132221232112111312111213111213211231131122212322211331222113112211",
            Solution().countAndSay(18)
        )
        assertEquals(
            "1321132132211331121321231231121113112221121321132122311211131122211211131221131211132221121321132132212321121113121112133221123113112221131112311332111213122112311311123112111331121113122112132113213211121332212311322113212221",
            Solution().countAndSay(19)
        )
    }
}
