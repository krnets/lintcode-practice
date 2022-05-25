/*
class Solution {
    fun anagram(s: String, t: String): Boolean {
        return s.asIterable().sorted() == t.asIterable().sorted()
    }
}*/

class Solution {
    fun anagram(s: String, t: String): Boolean {
        var cor = 0
        var hash = 0

        for (c in s.chars()) {
            cor = cor.xor(c)
            hash += (c * c) % 128
        }

        for (c in t.chars()) {
            cor = cor.xor(c)
            hash -= (c * c) % 128
        }

        return cor == 0 && hash == 0
    }
}