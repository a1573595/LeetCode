fun main() {
    println(merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3))
    println(merge(intArrayOf(1), 1, intArrayOf(), 0))
    println(merge(intArrayOf(0), 0, intArrayOf(1), 1))
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val list = mutableListOf<Int>()

    for (i in 0..<m) {
        list.add(nums1[i])
    }

    for (i in 0..<n) {
        if (list.size >= nums1.size) {
            break
        }

        list.add(nums2[i])
    }

    list.sort()
    list.forEachIndexed { index, value ->
        nums1[index] = value
    }
}
