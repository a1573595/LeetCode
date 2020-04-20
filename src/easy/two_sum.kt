package easy

import java.util.*

// https://leetcode.com/problems/two-sum/

fun main() {
    println(twoSum(intArrayOf(1, 2, 3), 5).joinToString())

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var index1: Int
    var index2: Int

    for (i in nums.indices) {
        index2 = nums.indexOf(target - nums[i])
        if (index2 != -1 && index2 != i) {
            index1 = i
            return intArrayOf(index1, index2)
        }
    }

    return intArrayOf()
}

fun twoSum2(nums: IntArray, target: Int): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        map[nums[i]] = i
    }
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement) && map[complement] != i) {
            return intArrayOf(i, map[complement]!!)
        }
    }
    throw IllegalArgumentException("No two sum solution")
}