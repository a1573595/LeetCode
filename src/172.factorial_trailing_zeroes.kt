fun main() {
    println(trailingZeroes(3))
    println(trailingZeroes(5))
    println(trailingZeroes(0))
    println(trailingZeroes(10))
    println(trailingZeroes(11))
    println(trailingZeroes(12))
    println(trailingZeroes(13))
    println(trailingZeroes(14))
    println(trailingZeroes(15))
}

/// todo
fun trailingZeroes(n: Int): Int {
    var result: Int = 0
    var currentFactor: Int = 5

    while (currentFactor <= n) {
        result += n / currentFactor
        currentFactor *= 5
    }

    return result
}
