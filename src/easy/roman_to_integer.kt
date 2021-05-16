package easy

import kotlin.system.measureTimeMillis

/**
 * roman-to-integer
 * https://leetcode.com/problems/roman-to-integer/
 *     Symbol       Value
 *     I             1
 *     V             5
 *     X             10
 *     L             50
 *     C             100
 *     D             500
 *     M             1000
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.    IV  IX
 * X can be placed before L (50) and C (100) to make 40 and 90.    XL  XC
 * C can be placed before D (500) and M (1000) to make 400 and 900.    CD  CM
 * ex. III = 3、IV = 4、IX = 9、LVIII = 58、MCMXCIV = 1994
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(romanToInt("III"))  // 3
        println(romanToInt("IV"))   // 4
        println(romanToInt("IX"))   // 9
        println(romanToInt("LVIII")) // 58
        println(romanToInt("MCMXCIV"))  // 1994
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(romanToInt2("III"))  // 3
        println(romanToInt2("IV"))   // 4
        println(romanToInt2("IX"))   // 9
        println(romanToInt2("LVIII")) // 58
        println(romanToInt2("MCMXCIV"))  // 1994
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 建立對照表
 * 先計算IV、CM等特殊字串
 * 再將其他結果相加
 */
fun romanToInt(str: String): Int {
    var answer = 0
    var index = str.length - 1

    while (index >= 0) {
        outer@ while (index >= 1) {
            when (str[index - 1].toString() + str[index].toString()) {
                "IV" -> {
                    answer += 4
                    index -= 2
                }
                "IX" -> {
                    answer += 9
                    index -= 2
                }
                "XL" -> {
                    answer += 40
                    index -= 2
                }
                "XC" -> {
                    answer += 90
                    index -= 2
                }
                "CD" -> {
                    answer += 400
                    index -= 2
                }
                "CM" -> {
                    answer += 900
                    index -= 2
                }
                else -> break@outer
            }
        }

        if (index >= 0) {
            when (str[index]) {
                'I' -> {
                    answer += 1
                    index--
                }
                'V' -> {
                    answer += 5
                    index--
                }
                'X' -> {
                    answer += 10
                    index--
                }
                'L' -> {
                    answer += 50
                    index--
                }
                'C' -> {
                    answer += 100
                    index--
                }
                'D' -> {
                    answer += 500
                    index--
                }
                'M' -> {
                    answer += 1000
                    index--
                }
            }
        }
    }


    return answer
}

fun value(r: Char): Int {
    if (r == 'I') return 1
    if (r == 'V') return 5
    if (r == 'X') return 10
    if (r == 'L') return 50
    if (r == 'C') return 100
    if (r == 'D') return 500
    return if (r == 'M') 1000 else -1
}

/**
 * 比較上個數值是否較小
 * 若較小則表示要扣除並倒扣
 * 若比較大則正常相加
 */
fun romanToInt2(str: String): Int {
    var sum = 0

    for (i in str.indices) {
        sum = if (i >= 1 && value(str[i]) > value(str[i - 1])) {
            sum + value(str[i]) - (value(str[i - 1]) * 2)
        } else {
            sum + value(str[i])
        }
    }

    return sum
}