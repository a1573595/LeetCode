package medium

import easy.maxSubArray

/**
 * https://leetcode.com/problems/01-matrix/
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 * The distance between two adjacent cells is 1.
 */

fun main() {
    updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)))
    updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)))
}

fun updateMatrix(matrix: Array<IntArray>): Array<IntArray> {
    matrix.size
    matrix[0].size

    val newMatrix = matrix.clone()
//    newMatrix.forEachIndexed { index, ints -> newMatrix[index] = IntArray(matrix[0].size) { 0 } }

    return arrayOf()
}
