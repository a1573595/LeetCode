fun main() {
    println(twoSum2(intArrayOf(2, 7, 11, 15), 9).joinToString())
    println(twoSum2(intArrayOf(2, 3, 4), 6).joinToString())
    println(twoSum2(intArrayOf(-1, 0), -1).joinToString())
}

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in numbers.indices) {
        map[numbers[i]] = i
    }

    for (i in numbers.indices) {
        val i2 = map[target - numbers[i]]

        if (i2 != null && i != i2) {
            return intArrayOf(i + 1, i2 + 1)
        }
    }

    throw Exception("Not found!")
}
