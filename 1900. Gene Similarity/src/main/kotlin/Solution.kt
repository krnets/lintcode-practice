class Solution {

    internal inner class GeneInfo(var character: Char, var repeat: Int)

    internal inner class GeneReader(private var gene: String) {

        private var index = 0

        operator fun hasNext(): Boolean {
            return index < gene.length
        }

        operator fun next(): GeneInfo? {

            if (!hasNext()) {
                return null
            }
            var repeat = 0

            while (index < gene.length && gene[index].isDigit()) {
                repeat = repeat * 10 + (gene[index++] - '0')
            }
            val ch = gene[index++]

            return GeneInfo(ch, repeat)
        }
    }

    /**
     * @param gene1: a string
     * @param gene2: a string
     * @return: return the similarity of two gene fragments
     */
    fun geneSimilarity(gene1: String, gene2: String): String {

        val reader1 = GeneReader(gene1)
        val reader2 = GeneReader(gene2)

        var length = 0
        var sameCount = 0

        var ch1 = 'x'
        var ch2 = 'y'

        var repeat1 = 0
        var repeat2 = 0

        while (repeat1 > 0 || repeat2 > 0 || reader1.hasNext() || reader2.hasNext()) {

            if (repeat1 == 0) {

                val piece1 = reader1.next()
                length += piece1!!.repeat
                ch1 = piece1.character
                repeat1 = piece1.repeat

                continue
            }
            if (repeat2 == 0) {

                val piece2 = reader2.next()
                ch2 = piece2!!.character
                repeat2 = piece2.repeat

                continue
            }

            // repeat1 && repeat2 > 0
            val shorterLen = minOf(repeat1, repeat2)

            if (ch1 == ch2) {
                sameCount += shorterLen
            }
            repeat1 -= shorterLen
            repeat2 -= shorterLen
        }
        return "$sameCount/$length"
    }
}