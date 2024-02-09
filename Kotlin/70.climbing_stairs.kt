fun main() {
    println(climbStairs(2))
    println(climbStairs(3))
    println(climbStairs(4))
    println(climbStairs(5))
}

fun climbStairs(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else if (n == 2) {
        return 2
    }

    var theOneBeforeLast = 1
    var pervious = 2

    var step = 3
    for (i in 3 until (n)) {
        theOneBeforeLast = pervious
        pervious = step

        step = theOneBeforeLast + pervious
    }

    return step
}
