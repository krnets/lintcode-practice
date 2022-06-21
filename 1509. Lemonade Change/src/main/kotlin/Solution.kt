/*
class Solution {
    fun lemonadeChange(bills: List<Int>): Boolean {

        val billsOnHand = mutableMapOf(5 to 0, 10 to 0, 20 to 0)

        for (b in bills) {
            var changeRequired = b - 5

            if (changeRequired == 0) {
                billsOnHand[b] = 1 + billsOnHand.getOrDefault(b, 0)
                continue
            }

            if (changeRequired >= 10 && billsOnHand[10]!! > 0) {
                changeRequired -= 10
                billsOnHand[10] = billsOnHand[10]!! - 1
            }

            if (changeRequired >= 5) {

                val x = changeRequired / 5

                if (billsOnHand[5]!! < x) return false

                billsOnHand[5] = billsOnHand[5]!! - x
            }

            billsOnHand[b] = 1 + billsOnHand.getOrDefault(b, 0)
        }

        return true
    }
}
*/

class Solution {
    fun lemonadeChange(bills: List<Int>): Boolean {
        var fives = 0
        var tens = 0

        for (b in bills) {
            if (b == 5) {
                fives++
            } else if (b == 10) {
                fives--
                tens++
            } else {
                if (tens > 0) {
                    tens--
                    fives--
                } else {
                    fives -= 3
                }
            }
            if (fives < 0) return false
        }

        return true
    }
}
