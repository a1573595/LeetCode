fun main() {
    println(
        spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
            )
        ).joinToString()
    )
    println(
        spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12),
            )
        ).joinToString()
    )
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val list = MutableList(matrix.size * matrix.first().size) { _ -> 0 }

    var index = 0
    var top = 0
    var bottom = matrix.size - 1
    var left = 0
    var right = matrix.first().size - 1

    while (true) {
        for (i in left..right) {
            list[index++] = matrix[top][i]
        }
        top++
        if (top > bottom || left > right) break

        for (i in top..bottom) {
            list[index++] = matrix[i][right]
        }
        right--
        if (top > bottom || left > right) break


        for (i in right downTo left) {
            list[index++] = matrix[bottom][i]
        }
        bottom--
        if (top > bottom || left > right) break


        for (i in bottom downTo top) {
            list[index++] = matrix[i][left]
        }
        left++
        if (top > bottom || left > right) break
    }

    return list
}
