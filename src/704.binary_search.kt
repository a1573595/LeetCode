fun main() {
    println(search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    println(search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    println(search(intArrayOf(-1, 0, 2, 3, 5, 9, 12), 12))
}

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val middle: Int = left + (right - left) / 2
        val value = nums[middle]

        when {
            value == target -> return middle
            value > target -> right = middle - 1
            else -> left = middle + 1
        }
    }

    return -1
}