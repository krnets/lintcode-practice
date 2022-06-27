class Interval {
    lateinit var leftExclusive: String
    lateinit var rightInclusive: String

    constructor()

    constructor(left: String, right: String) {
        this.leftExclusive = left
        this.rightInclusive = right
    }

    fun parse(s: String): Interval {
        val (left, right) = s.split(",")

        val isLeftExclusive = left.first() == '('
        val isRightInclusive = right.last() == ']'

        var leftExclusive = left.drop(1)
        var rightInclusive = right.dropLast(1)

        if (isLeftExclusive) leftExclusive += 'a'
        if (isRightInclusive) rightInclusive += 'a'

        return Interval(leftExclusive, rightInclusive)
    }
}

class Solution {
    fun mergeJudge(interval_A: String, interval_B: String): Boolean {

        val ia = Interval().parse(interval_A)
        val ib = Interval().parse(interval_B)

        return (ia.rightInclusive >= ib.leftExclusive) && (ia.leftExclusive <= ib.rightInclusive)
    }
}