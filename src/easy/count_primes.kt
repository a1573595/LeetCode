package easy

// https://leetcode.com/problems/count-primes/submissions/

fun main() {
    println(countPrimes(0))
    println(countPrimes(2))
    println(countPrimes(10))
    println(countPrimes(100))
    println()
    println()
    println(countPrimes2(0))
    println(countPrimes2(2))
    println(countPrimes2(10))
    println(countPrimes(100))
    println(countPrimes2(499979))
    println()
    println()
    println(countPrimes2(0))
    println(countPrimes2(2))
    println(countPrimes2(10))
    println(countPrimes(100))
}

fun countPrimes(n: Int): Int {
    if (n < 3) return 0

    val primes: ArrayList<Int> = ArrayList()
    var isPrime = true

    for (i in 3 until n step 2) {
        for (prime in primes) {
            if (i % prime == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            primes.add(i)
        }

        isPrime = true
    }

    return primes.size + 1
}

fun countPrimes2(n: Int): Int {
    if (n < 3) return 0

    val nonPrimes = BooleanArray(n)
    var count = n / 2

    for (i in 3 until n step 2) {
        if (nonPrimes[i]) {
            continue
        }

        var j: Long = i.toLong() * i.toLong()
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