fun main() {
    rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
    rotate(intArrayOf(-1, -100, 3, 99), 2)
    rotate(intArrayOf(1, 2), 3)
}

fun rotate(nums: IntArray, k: Int): Unit {
    val list = mutableListOf<Int>()
    val offset = nums.size - k % nums.size

    for (i in nums.indices) {
        list.add(nums[(i + offset) % (nums.size)])
    }

    var index = 0
    list.forEach { e ->
        nums[index++] = e
    }
}