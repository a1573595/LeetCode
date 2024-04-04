fun main() {
    println(dominantIndex(intArrayOf(3, 6, 1, 0)))
    println(dominantIndex(intArrayOf(1, 2, 3, 4)))
    println(dominantIndex(intArrayOf(0, 0, 3, 2)))
    println(dominantIndex(intArrayOf(3, 0, 0, 2)))
}

fun dominantIndex(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return -1
    } else if (nums.size == 1) {
        return 0;
    }

    var maxValueIndex = 0
    var secondValueIndex = -1

    for (i in 1..<nums.size) {
        if (nums[i] > nums[maxValueIndex]) {
            secondValueIndex = maxValueIndex
            maxValueIndex = i
        } else if (secondValueIndex == -1 || nums[i] > nums[secondValueIndex]) {
            secondValueIndex = i
        }
    }

    return if (secondValueIndex == -1 || nums[maxValueIndex] / 2 >= nums[secondValueIndex]) {
        maxValueIndex
    } else {
        -1
    }
}