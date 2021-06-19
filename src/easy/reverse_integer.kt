package easy

import java.lang.StringBuilder
import kotlin.system.measureTimeMillis

/**
 * reverse-integer
 * https://leetcode.com/problems/reverse-integer/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(reverse(123))
        println(reverse(-123))
        println(reverse(120))
        println(reverse(1534236469))
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(reverse2(123))
        println(reverse2(-123))
        println(reverse2(120))
        println(reverse2(1534236469))
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 反轉數值
 * 防止溢位反轉時要使用Long
 * 並比較反轉結果是否超出Integer範圍
 */
fun reverse(x: Int): Int {
    var y: Int = if (x < 0) -x else x
    var z: Long = 0

    while (y > 0) {
        z = z * 10 + y % 10
        y /= 10
    }

    return if (z > Int.MAX_VALUE || z < Int.MIN_VALUE) 0 else if (x < 0) -z.toInt() else z.toInt()
}

/**
 * 轉為字串並反轉
 * 比較反轉結果是否超出Integer範圍
 */
fun reverse2(x: Int): Int {
    val numStr = if (x >= 0) x.toString() else (x * -1).toString()
    val strBuilder = StringBuilder()

    numStr.forEach {
        strBuilder.insert(0, it)
    }

    val newNum = strBuilder.toString().toLong()

    return if (newNum > Int.MAX_VALUE || newNum < Int.MIN_VALUE) 0 else if (x < 0) -newNum.toInt() else newNum.toInt()
}