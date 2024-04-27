fun main() {
    val list1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )
    rotate(list1)
    list1.forEach {
        println(it.joinToString(","))
    }
    println()
    println()

    val list2 = arrayOf(
        intArrayOf(5, 1, 9, 11),
        intArrayOf(2, 4, 8, 10),
        intArrayOf(13, 3, 6, 7),
        intArrayOf(15, 14, 12, 16),
    )
    rotate(list2)
    list2.forEach {
        println(it.joinToString(","))
    }
    println()
    println()

    val list3 = arrayOf(
        intArrayOf(1),
    )
    rotate(list3)
    list3.forEach {
        println(it.joinToString(","))
    }
    println()
    println()

    val list4 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
    )
    rotate(list4)
    list4.forEach {
        println(it.joinToString(","))
    }
    println()
    println()
}

fun rotate(matrix: Array<IntArray>) {
    val size = matrix.size
    val subSize = size / 2

    for (i in 0..<size) {
        for (j in i..<size) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    for (i in 0..<size) {
        for (j in 0..<subSize) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][size - j - 1]
            matrix[i][size - j - 1] = temp
        }
    }
}