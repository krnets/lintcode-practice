/*
class Solution {
    fun hashCode(key: String, hASH_SIZE: Int): Int {
        var ans = 0L

        for (c in key)
            ans = (ans * (33 % hASH_SIZE) + c.code) % hASH_SIZE

        return ans.toInt()
    }
}*/

class Solution {
    fun hashCode(key: String, hASH_SIZE: Int): Int {
        var ans = 0L

        for (c in key)
            ans = (ans * 33 + c.code) % hASH_SIZE

        return ans.toInt()
    }
}
