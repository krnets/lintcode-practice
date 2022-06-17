class Solution {
    fun maximumMoment(time: String): String {
        val maxTimeString = "23:59"
        val sb = StringBuilder()

        for (i in time.indices)
            if (time[i] == '?')
                sb.append(maxTimeString[i])
            else
                sb.append(time[i])

        return sb.toString()
    }
}