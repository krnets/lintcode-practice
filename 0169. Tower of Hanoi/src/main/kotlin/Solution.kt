class Solution {
    private val steps = mutableListOf<String>()

    fun towerOfHanoi(n: Int): List<String> {

        moveDisks(n, 'A', 'B', 'C')

        return steps
    }

    private fun moveDisks(disk: Int, from: Char, buffer: Char, to: Char) {
        if (disk == 1)
            steps.add("from $from to $to")
        else {
            moveDisks(disk - 1, from, to, buffer)
            steps.add("from $from to $to")
            moveDisks(disk - 1, buffer, from, to)
        }
    }
}