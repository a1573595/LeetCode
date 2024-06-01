fun main() {
    val list1 = intArrayOf(1, 2, 3, 0, 0, 0)
    merge(list1, 3, intArrayOf(2, 5, 6), 3)
    println(list1.joinToString())
    println()

    val list2 = intArrayOf(1)
    merge(list2, 1, intArrayOf(), 0)
    println(list2.joinToString())
    println()

    val list3 = intArrayOf(0)
    merge(list3, 0, intArrayOf(1), 1)
    println(list3.joinToString())
    println()
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var index = m + n - 1
    var left = m - 1
    var right = n - 1

    while (index >= 0) {
        val value: Int
        if (right < 0 || left >= 0 && nums1[left] > nums2[right]) {
            value = nums1[left--]
        } else {
            value = nums2[right--]
        }

        nums1[index] = value
        index--
    }
}
