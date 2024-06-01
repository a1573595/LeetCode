fun main() {
    println(climbStairs(2))
    println(climbStairs(3))
    println(climbStairs(4))
    println(climbStairs(5))
}

fun climbStairs(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        2 -> 2
        else -> {
            var theOneBeforeLast: Int
            var pervious = 2

            var step = 3
            for (i in 3..<(n)) {
                theOneBeforeLast = pervious
                pervious = step

                step = theOneBeforeLast + pervious
            }

            return step
        }
    }
}
