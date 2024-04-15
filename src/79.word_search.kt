fun main() {
    println(
        exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCCED"
        )
    )
    println(
        exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "SEE"
        )
    )
    println(
        exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCB"
        )
    )
}

data class Path(val r: Int, val c: Int)

fun exist(board: Array<CharArray>, word: String): Boolean {
    val rows = board.size
    val cols = board.first().size

    val pathSet = mutableSetOf<Path>()

    fun dfs(r: Int, c: Int, i: Int): Boolean {
        val currentPath = Path(r, c)

        return when {
            i >= word.length -> true
            r < 0 || c < 0 || r >= rows || c >= cols -> false
            board[r][c] != word[i] -> false
            pathSet.contains(currentPath) -> false
            else -> {
                pathSet.add(currentPath)

                val up = dfs(r - 1, c, i + 1)
                val down = dfs(r + 1, c, i + 1)
                val left = dfs(r, c - 1, i + 1)
                val right = dfs(r, c + 1, i + 1)

                pathSet.remove(currentPath)

                up || down || left || right
            }
        }
    }

    for (r in 0..<rows) {
        for (c in 0..<cols) {
            if (board[r][c] == word[0] && dfs(r, c, 0)) {
                return true
            }
        }
    }

    return false
}