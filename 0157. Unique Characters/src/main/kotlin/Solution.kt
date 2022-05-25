/*
class Solution {
    fun isUnique(str: String): Boolean {
        for (i in str.indices)
            if (str.substring(i + 1).contains(str[i]))
                return false

        return true
    }
}*/

/*
class Solution {
    fun isUnique(str: String): Boolean {
        val set = mutableSetOf<Char>()

        for (c in str)
            if (set.contains(c))
                return false
            else set.add(c)

        return true
    }
}
*/

/*
class Solution {
    fun isUnique(str: String): Boolean = str.asSequence().distinct().count() == str.length
}
*/

class Solution {
    fun isUnique(str: String): Boolean {
        val chars = IntArray(128)

        for (c in str)
            chars[c.code]++

        for (c in chars)
            if (c > 1)
                return false

        return true
    }
}
