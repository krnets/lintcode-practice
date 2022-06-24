class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        if (s.length < 4) return ArrayList()

        val list = mutableListOf<String>()

        for (a in 1..3) for (b in 1..3) for (c in 1..3) {
            val d = s.length - a - b - c

            if (d in 1..3) {

                val A = s.take(a)
                val B = s.drop(a).take(b)
                val C = s.drop(a + b).take(c)
                val D = s.drop(a + b + c)

                val ia = A.toInt()
                val ib = B.toInt()
                val ic = C.toInt()
                val id = D.toInt()

                if (ia > 255 || ib > 255 || ic > 255 || id > 255) continue
                if (ia == 0 && A.length > 1 || ib == 0 && B.length > 1 || ic == 0 && C.length > 1 || id == 0 && D.length > 1) continue
                if (A.first() == '0' && ia != 0 || B.first() == '0' && ib != 0 || C.first() == '0' && ic != 0 || D.first() == '0' && id != 0) continue

                list.add("$A.$B.$C.$D")
            }
        }
        return list
    }
}
