/*
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val minLength = strs.minOf { it.length }
        var ans = 0

        for (i in 0 until minLength) {
            if (strs.all { str -> str[i] == strs.first()[i] })
                ans++
        }
        return strs.first().take(ans)
    }
}*/

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val sb = StringBuilder()
        strs.sort()

        val first = strs.first()
        val last = strs.last()

        for (i in first.indices) {
            if (first[i] != last[i])
                break
            sb.append(first[i])
        }

        return sb.toString()
    }
}
