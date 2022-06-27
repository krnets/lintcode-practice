import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals("4/5", Solution().geneSimilarity("2T3G", "3T2G"))
    }

    @Test
    fun BasicTest2() {
        assertEquals("4/10", Solution().geneSimilarity("3T2G4A1C", "6T1A2C1G"))
    }

    @Test
    fun BasicTest3() {
        assertEquals(
            "110/200", Solution().geneSimilarity(
                "60T30A40T20A40G10C", "30T60A20G30T30G30C"
            )
        )
    }

    @Test
    fun BasicTest4() {
        assertEquals(
            "1265134/10000000", Solution().geneSimilarity(
                "1436969G472315A5942039G1736902T411775A",
                "5525108T344151G2903047T205105G1022589C"
            )
        )
    }
}
