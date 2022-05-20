class Solution {
    fun fizzBuzz(n: Int): List<String> = (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "fizz buzz"
            it % 3 == 0 -> "fizz"
            it % 5 == 0 -> "buzz"
            else -> "$it"
        }
    }
}

/*
class Solution {
    fun fizzBuzz(n: Int): List<String> = (1..n).map {
        when {
            it.mod(15) == 0 -> "fizz buzz"
            it.mod(3) == 0 -> "fizz"
            it.mod(5) == 0 -> "buzz"
            else -> "$it"
        }
    }
}
*/
