fun main() {
    println(summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
    println(summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)))
    println(summaryRanges(intArrayOf()))
}

fun summaryRanges(nums: IntArray): List<String> {
    if (nums.isEmpty()) {
        return emptyList()
    }

    val list = mutableListOf<String>()

    var left = nums.first()
    var right = left

    for (i in 1..<nums.size) {
        if (nums[i] - 1 != right) {
            if (left != right) {
                list.add("$left->$right")
            } else {
                list.add("$left")
            }

            left = nums[i]
        }

        right = nums[i]
    }

    if (left != right) {
        list.add("$left->$right")
    } else {
        list.add("$left")
    }

    return list
}
