fun main() {
    println(twoSum2(intArrayOf(2, 7, 11, 15), 9).joinToString())
    println(twoSum2(intArrayOf(2, 3, 4), 6).joinToString())
    println(twoSum2(intArrayOf(-1, 0), -1).joinToString())
}

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1

    while (left < right) {
        val value = numbers[left] + numbers[right]

        when {
            value == target -> return intArrayOf(left + 1, right + 1)
            value < target -> left++
            else -> right--
        }
    }

    throw Exception("Not found!")
}
