class Calculator {
    fun calculate(a: Int, op: Char, b: Int): Int =
        when (op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> a / b
            '%' -> a % b
            '^' -> Math.pow(a.toDouble(), b.toDouble()).toInt()
            else -> 0
        }
}