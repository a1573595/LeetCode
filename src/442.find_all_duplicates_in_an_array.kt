fun main() {
    println(findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
    println(findDuplicates(intArrayOf(1, 1, 2)))
    println(findDuplicates(intArrayOf(1)))
}

fun findDuplicates(nums: IntArray): List<Int> {
    val set = mutableSetOf<Int>()

    return nums.filter { !set.add(it) }
}