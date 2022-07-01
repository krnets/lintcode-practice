/*
class Solution {
    fun binaryTime(num: Int): List<String> {
        val list = mutableListOf<String>()

        for (h in 0 until 12)
            for (m in 0 until 60)
                if (h.countOneBits() + m.countOneBits() == num)
                    list.add(h.toString() + (if (m < 10) ":0" else ":") + m)

        return list
    }
}
*/

/*
class Solution {
    fun binaryTime(num: Int): List<String> {
        val list = mutableListOf<String>()

        for (h in 0 until 12)
            for (m in 0 until 60)
                if (h.countOneBits() + m.countOneBits() == num)
                    list.add("$h:" + "$m".padStart(2, '0'))

        return list
    }
}
*/

class Solution {
    fun binaryTime(num: Int): List<String> =
        (0 until 12).flatMap { h ->
            (0 until 60).filter { m ->
                h.countOneBits() + m.countOneBits() == num
            }.map { m -> "$h:" + "$m".padStart(2, '0') }
        }
}
