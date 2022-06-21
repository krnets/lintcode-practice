class Solution {
    fun convert(index: Long): String {
        val maxColumn = 702
        val letters = 26
        val row = (index - 1) / maxColumn

        val col =
            if (index % maxColumn == 0L) maxColumn
            else (index % maxColumn).toInt()

        val sb = StringBuilder()
        sb.append(row + 1)

        if (col == maxColumn)
            sb.append('Z')
        else if ((col - 1) / letters > 0)
            sb.append('A' + (col / letters - 1))

        if (col % letters == 0)
            sb.append('Z')
        else sb.append('A' + (col % letters - 1))

        return sb.toString()
    }
}