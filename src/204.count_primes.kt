fun main() {
    println(countPrimes(10))
    println(countPrimes(0))
    println(countPrimes(1))
    println(countPrimes(2))
    println(countPrimes(3))
    println(countPrimes(10000))
}

fun countPrimes(n: Int): Int {
    if (n < 3) return 0

    val nonPrimes = BooleanArray(n)
    var count = n / 2

    for (i in 3..<n step 2) {
        if (nonPrimes[i]) {
            continue
        }

        var j: Long = i.toLong() * 3
        while (j < n) {
            if (!nonPrimes[j.toInt()]) {
                nonPrimes[j.toInt()] = true
                count--
            }
            j += i * 2
        }
    }

    return count
}
