package medium

import java.util.*

/**
 * 01-matrix
 * https://leetcode.com/problems/01-matrix/
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 * The distance between two adjacent cells is 1.
 */

fun main() {
    updateMatrix(
        arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0)
        )
    ).forEach { println(it.toList()) }

    println()
    println()

    updateMatrix(
        arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1)
        )
    ).forEach { println(it.toList()) }

    println()
    println()

    updateMatrix(
        arrayOf(
            intArrayOf(0, 1)
        )
    ).forEach { println(it.toList()) }

    println()
    println()

    updateMatrix(
        arrayOf(
            intArrayOf(0),
            intArrayOf(1)
        )
    ).forEach { println(it.toList()) }
}

/**
 * 找出最大步數
 * 創建出另一個相同大小的二維陣列
 * 將原先為0的數值保留
 * 其餘變更為-1(尚未找到)
 * 依序比對點的四周是否有非-1數值
 * 代表找到對應步數
 */
fun updateMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val maxValue = if (matrix[0].size > matrix.size) matrix[0].size else matrix.size

    val newMatrix = matrix.clone()
    newMatrix.forEach { it.forEachIndexed { index, value -> it[index] = if (value == 0) 0 else -1 } }

    for (i in 1 until maxValue) {   // 距離0的步數
        for (y in matrix.indices) { //矩陣Y軸
            for (x in matrix[y].indices) {  //矩陣X軸
                if (matrix[y][x] != -1) {
                    continue
                }

                when {
                    y - 1 >= 0 && matrix[y - 1][x] < i && matrix[y - 1][x] != -1 -> {    // Top
                        matrix[y][x] = i
                    }
                    x - 1 >= 0 && matrix[y][x - 1] < i && matrix[y][x - 1] != -1 -> {       // Left
                        matrix[y][x] = i
                    }
                    x + 1 < matrix[0].size && matrix[y][x + 1] < i && matrix[y][x + 1] != -1 -> {   // Right
                        matrix[y][x] = i
                    }
                    y + 1 < matrix.size && matrix[y + 1][x] < i && matrix[y + 1][x] != -1 -> {  //  Bottom
                        matrix[y][x] = i
                    }
                }
            }
        }
    }

    return matrix
}

fun updateMatrix2(matrix: Array<IntArray>): Array<IntArray> {
    if (matrix.isEmpty() || matrix[0].isEmpty()) {
        return matrix
    }
    val m = matrix.size
    val n: Int = matrix[0].size
    val que = LinkedList<IntArray>()
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (matrix[i][j] == 0) {
                que.add(intArrayOf(i, j))
            } else {
                matrix[i][j] = Int.MAX_VALUE
            }
        }
    }
    val dirs =
        arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))
    while (!que.isEmpty()) {
        val cur = que.poll()
        for (dir in dirs) {
            val dx = cur[0] + dir[0]
            val dy = cur[1] + dir[1]
            if (dx < 0 || dx >= m || dy < 0 || dy >= n || matrix[cur[0]][cur[1]] + 1 >= matrix[dx][dy]
            ) {
                continue
            }
            matrix[dx][dy] = matrix[cur[0]][cur[1]] + 1
            que.add(intArrayOf(dx, dy))
        }
    }
    return matrix
}