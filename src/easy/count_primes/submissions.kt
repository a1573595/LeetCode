package easy.count_primes

import kotlin.system.measureTimeMillis

/**
 * submissions
 * https://leetcode.com/problems/count-primes/submissions/
 * 找質數
 */

fun main() {
//    println(countPrimes(0))
//    println(countPrimes(2))
//    println(countPrimes(10))
//    println(countPrimes(100))
//    println()
//    println()
//    println(countPrimes2(0))
//    println(countPrimes2(2))
//    println(countPrimes2(10))
//    println(countPrimes2(100))
//    println()
//    println()
//    println(countPrimes3(0))
//    println(countPrimes3(2))
//    println(countPrimes3(10))
//    println(countPrimes3(100))
//    println()
//    println()

    val costTimeMillis = measureTimeMillis {
        println(countPrimes(499979))
    }

    val costTimeMillis2 = measureTimeMillis {
        println(countPrimes2(499979))
    }

    val costTimeMillis3 = measureTimeMillis {
        println(countPrimes3(499979))
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
}

/**
 * 保存每個找到的質數
 * 若奇數不是已知質數的倍數則為質數
 */
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

/**
 * 扣除所有偶數
 * 並比對剩餘的奇數是否為質數
 * 若為質數則其倍數必不為質數
 */
fun countPrimes2(n: Int): Int {
    if (n < 3) return 0

    val nonPrimes = BooleanArray(n)
    var count = n / 2

    for (i in 3 until n step 2) {
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

/**
 * 扣除所有偶數
 * 並比對剩餘的奇數是否為質數
 * 若為質數則其倍數必不為質數
 * 從平方根開始可以節省更多已被找到的部分
 */
fun countPrimes3(n: Int): Int {
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