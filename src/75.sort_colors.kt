fun main() {
    val list = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(list)
    println(list.joinToString())

    val list2 = intArrayOf(2, 0, 1)
    sortColors(list2)
    println(list2.joinToString())

    val list3 = intArrayOf(1, 0)
    sortColors(list3)
    println(list3.joinToString())
}

fun sortColors(nums: IntArray): Unit {
//    nums.sort()

    var length = nums.size -1

    while (length > 0) {
        for (i in 0 ..<length) {
            val left = nums[i]
            val right = nums[i+1]

            if(left > right) {
                nums[i] = right
                nums[i+1] = left
            }
        }

        length--
    }
}
