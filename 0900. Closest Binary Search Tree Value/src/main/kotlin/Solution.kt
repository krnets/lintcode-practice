import kotlin.math.abs

class Solution {
    fun closestValue(root: TreeNode?, target: Double): Int {
        var upper = root
        var lower = root
        var current = root

        while (current != null) {

            if (target < current.`val`) {
                upper = current
                current = current.left
            } else if (target > current.`val`) {
                lower = current
                current = current.right
            } else
                return current.`val`
        }

        return if (abs(lower!!.`val` - target) < abs(upper!!.`val` - target)) lower.`val` else upper.`val`
    }
}

