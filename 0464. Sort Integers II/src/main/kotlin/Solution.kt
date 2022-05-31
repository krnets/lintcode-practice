class Solution {
    fun sortIntegers2(a: IntArray): Unit {
        quickSort(a, 0, a.size - 1)
    }

    private fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val partitionIndex = partition(arr, low, high)

            quickSort(arr, low, partitionIndex - 1)
            quickSort(arr, partitionIndex + 1, high)
        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {

        val pivot = arr[high]
        var i = low - 1

        for (j in low..high) {

            if (arr[j] < pivot) {
                i++
                swap(arr, i, j)
            }
        }
        swap(arr, i + 1, high)

        return i + 1
    }

    private fun swap(arr: IntArray, i: Int, j: Int) {
        arr[i] = arr[j].also {
            arr[j] = arr[i]
        }
    }
}