fun main() {
    println(longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)))
    println(longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
    println(longestConsecutive(intArrayOf(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6)))
}

// Time Limit Exceeded
// fun longestConsecutive(nums: IntArray): Int {
//     val set = nums.toSortedSet()

//     var maxValue = 0
//     var count = 0

//     set.forEachIndexed { i, v ->
//         if (i == 0) {
//             count++
//         } else if ((v - 1) == set.elementAt(i - 1)) {
//             count++
//         } else {
//             count = 1
//         }

//         if (count > maxValue) {
//             maxValue = count
//         }
//     }

//     return maxValue
// }

fun longestConsecutive(nums: IntArray): Int {
    val set = nums.toHashSet()

    var maxValue = 0
    for (num in nums) {
        if (!set.contains(num)) {
            continue
        }

        var left = num
        var right = num

        while (set.contains(--left)) {
            set.remove(left)
        }
        while (set.contains(++right)) {
            set.remove(right)
        }

        var count = right - left - 1
        if (count > maxValue) {
            maxValue = count
        }
    }

    return maxValue
}
