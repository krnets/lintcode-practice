class Solution {
    fun inputStream(inputA: String, inputB: String): String {
        val sbA = StringBuilder()
        val sbB = StringBuilder()

        for (c in inputA)
            if (c == '<') {
                if (sbA.isNotEmpty())
                    sbA.deleteAt(sbA.lastIndex)
            } else sbA.append(c)

        for (c in inputB)
            if (c == '<') {
                if (sbB.isNotEmpty())
                    sbB.deleteAt(sbB.lastIndex)
            } else sbB.append(c)

        return if (sbA.toString() == sbB.toString()) "YES" else "NO"
    }
}