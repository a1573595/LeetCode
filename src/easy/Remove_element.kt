package easy

// https://leetcode.com/problems/remove-element/

fun main(args: Array<String>) {
    println(removeElement(intArrayOf(3, 2, 2, 3), 3))   // [2, 2]   2
    println(removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))   // [0, 1, 4, 0, 3]   5
}

fun removeElement(nums: IntArray, redundantNum: Int): Int {
    var size = nums.size
    var index = 0

    while (index < size) {
        if(nums[index] == redundantNum) {
            nums[index] = nums[size-- - 1]
        } else {
            index++
        }
    }


    return size
}