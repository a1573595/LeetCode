fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(maxArea(intArrayOf(1, 1)))
}

fun maxArea(height: IntArray): Int {
    var max = 0
    var left = 0
    var right = height.size - 1

    while (left != right) {
        val min = Math.min(height[left], height[right])
        val value = min * (right - left)
        max = Math.max(max, value)

        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return max
}
