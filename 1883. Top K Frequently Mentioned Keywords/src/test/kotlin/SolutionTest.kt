import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val keywords = arrayOf("anacell", "cetracular", "betacellular")
        val reviews = arrayOf(
            "Anacell provides the best services in the city",
            "betacellular has awesome services",
            "Best services provided by anacell, everyone should use anacell"
        )
        val expected = listOf("anacell", "betacellular")
        assertContentEquals(expected, Solution().topkKeywords(2, keywords, reviews))
    }

    @Test
    fun BasicTest2() {
        val keywords = arrayOf("anacell", "betacellular", "cetracular", "deltacellular", "eurocell")
        val reviews = arrayOf(
            "I love anacell Best services; Best services provided by anacell",
            "betacellular has great services",
            "deltacellular provides much better services than betacellular",
            "cetracular is worse than anacell",
            "Betacellular is better than deltacellular."
        )
        val expected = listOf("betacellular", "anacell")
        assertContentEquals(expected, Solution().topkKeywords(2, keywords, reviews))
    }

    @Test
    fun BasicTest3() {
        val keywords = arrayOf("kolzk", "pianu", "neexv", "erhv", "kpsd", "ssx", "omzgpy", "jsghcq")
        val reviews = arrayOf(
            "Neexv pianu OrwY TruzPR apI cDBsY XAiX Omzgpy ZKgBym",
            "JjX Erhv erhv Ssx jsghcq UOHIO xmMb pianu UaMxc ClF ylPt dqsi ssx Jsghcq VdkH nxoNhm cmhXb nGcE yGtQ",
            "ngm kpsd UOp kolzk WNl hDZ erhv FlREp czTqeU qgNN",
            "Kpsd DwB hDp EHSJ KGTm kolzk aaQdK bCp FqqHb pianu TML MZG GqUhhA Erhv LSXUc kUIg jsghcq xyk aCXP Neexv",
            "mQrWL gscjV Erhv IDaG zDTs kolzk sBnZB erhv ssx omzgpy neexv RVroli wMiKr JQmovm erhv Ssx Kpsd"
        )
        val expected = listOf("erhv", "kolzk", "kpsd", "neexv")
        assertContentEquals(expected, Solution().topkKeywords(4, keywords, reviews))
    }

    @Test
    fun BasicTest4() {
        val keywords = arrayOf(
            "qebqhd", "mferd", "glhc", "axos", "hxxsx", "xvtj", "dajth", "slokx"
        )
        val reviews = arrayOf(
            "YlCtq uFC Dajth hxxsx WUgjg dajth qlOi VqVQQN Slokx Axos COLKc ESXLTt",
            "SJhv KonM PDkiEc ZKoQIt slokx AlmbD xvtj HhOGAc cYXC JCFYo Glhc",
            "qebqhd viy xvtj NTnL FMT axos UZx dajth HKa Qebqhd",
            "JsrgPD qGGD byBTA jJMV axos vtL MNE axos qWkYI jsj qebqhd Slokx axos ucD",
            "vhQjyf qfoAM bZY FxgnF axos Bojq Axos lbmH HsxboA NBpig MOlKR zml dajth KFYw Xvtj Dajth xvtj rTZVYU JMgBfc",
            "RtojO Xvtj BQbtL LDYaM Glhc",
            "glhc Zltfa hxxsx xrDTd Htg TrJ Glhc Xvtj hxxsx UUImeD Hxxsx pRLw",
            "BSKIM slokx ety Qebqhd LkgiA UEo oxwBc NpjO ELruV fETjzs KIeSH dMRZq slokx bjwL",
            "mferd aAbncH bic tqEk Mferd",
            "vlku Glhc slokx dDO Xvtj QlCEOd"
        )
        val expected = listOf("xvtj","slokx","axos","glhc","dajth","qebqhd","hxxsx","mferd")
        assertContentEquals(expected, Solution().topkKeywords(12, keywords, reviews))
    }
}
