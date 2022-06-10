class Solution {
    private val words = mapOf(
        1_000_000_000 to "billion", 1_000_000 to "million", 1_000 to "thousand",
        100 to "hundred", 90 to "ninety", 80 to "eighty", 70 to "seventy", 60 to "sixty",
        50 to "fifty", 40 to "forty", 30 to "thirty", 20 to "twenty",
        19 to "nineteen", 18 to "eighteen", 17 to "seventeen", 16 to "sixteen",
        15 to "fifteen", 14 to "fourteen", 13 to "thirteen", 12 to "twelve", 11 to "eleven",
        10 to "ten", 9 to "nine", 8 to "eight", 7 to "seven", 6 to "six",
        5 to "five", 4 to "four", 3 to "three", 2 to "two", 1 to "one"
    )

    fun convertWords(number: Int): String {
        if (number == 0) return "zero"

        val list = mutableListOf<String>()
        var m = number

        for (word in words) {
            val x = m / word.key

            if (x > 0) {
                val y = words[x] ?: convertWords(x)
                val z = word.value

                if (word.key >= 100)
                    list.add("$y $z")
                else list.add(word.value)

                m -= (x * word.key)
            }
        }

        return list.joinToString(" ")
    }
}
