/*
class Solution {
    fun maxOfThreeNumbers(num1: Int, num2: Int, num3: Int): Int {
        return maxOf(num1, num2, num3)
    }
}*/

class Solution {
    fun maxOfThreeNumbers(num1: Int, num2: Int, num3: Int): Int =
        if (num1 > num2 && num1 > num3)
            num1
        else if (num2 > num1 && num2 > num3)
            num2
        else if (num3 > num1 && num3 > num2)
            num3
        else num1
}