fun main() {
    println(
        isToeplitzMatrix2(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 1, 2, 3),
                intArrayOf(9, 5, 1, 2),
            )
        )
    )
    print(
        isToeplitzMatrix2(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 2),
            )
        )
    )
}

fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
    for (i in 1..<matrix.size) {
        if (matrix[i].drop(1) != matrix[i - 1].take(matrix[i - 1].size - 1)) {
            return false
        }
        println()
    }

    return true
}

fun isToeplitzMatrix2(matrix: Array<IntArray>): Boolean {
    if (matrix.size <= 1 || matrix.first().size <= 1) {
        return true
    }

    for (y in 1..<matrix.size) {
        for (x in 1..<matrix[y].size) {
            if (matrix[y - 1][x - 1] != matrix[y][x]) {
                return false
            }
        }
    }

    return true
}