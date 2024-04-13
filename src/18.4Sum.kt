fun main() {
    println(fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0).joinToString())
    println(fourSum(intArrayOf(2, 2, 2, 2, 2), 8).joinToString())
    println(fourSum(intArrayOf(0, 0, 0, 0), 0).joinToString())
    println(
            fourSum(intArrayOf(1000000000, 1000000000, 1000000000, 1000000000), -294967296)
                    .joinToString()
    )
}

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    nums.sort()

    val set = mutableSetOf<List<Int>>()

    for (i in 0..nums.size - 3) {
        for (j in i + 1..nums.size - 2) {
            val value = target.toLong() - nums[i] - nums[j]
            var left = j + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[left].toLong() + nums[right]

                if (value == sum) {
                    set.add(listOf(nums[i], nums[j], nums[left], nums[right]))
                    left++
                    right--
                } else if (value > sum) {
                    left++
                } else {
                    right--
                }
            }
        }
    }

    return set.toList()
}
