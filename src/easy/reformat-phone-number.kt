package easy

import kotlin.system.measureTimeMillis

/**
 * reformat-phone-number
 * https://leetcode.com/problems/reformat-phone-number/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(reformatNumber("1-23-45 6")) // 123-456
        println(reformatNumber("123 4-567")) // 123-45-67
        println(reformatNumber("123 4-5678")) // 123-456-78
        println(reformatNumber("0 - 22 1985--324")) // 022-198-53-24
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(reformatNumber2("1-23-45 6")) // 123-456
        println(reformatNumber2("123 4-567")) // 123-45-67
        println(reformatNumber2("123 4-5678")) // 123-456-78
        println(reformatNumber2("0 - 22 1985--324")) // 022-198-53-24
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 移除非數字字串
 * 若字串長度除3餘數為1表示後長度不足，先保留最後兩位數
 * 剩餘字串每三個一組組合
 */
fun reformatNumber(number: String): String {
    var phoneStr = ""

    var lastStr = ""
    var tempStr = ""

    number.forEach {
        if (it != ' ' && it != '-') {
            phoneStr += it
        }
    }

    if (phoneStr.length > 1 && phoneStr.length % 3 == 1) {
        lastStr = phoneStr.takeLast(2)
        phoneStr = phoneStr.dropLast(2)
    }

    phoneStr.forEachIndexed { index, c ->
        if ((index + 1) % 3 == 0 && (index + 1) != phoneStr.length) {
            tempStr += "$c-"
        } else {
            tempStr += c
        }
    }

    if (lastStr.isNotEmpty()) {
        tempStr = "$tempStr-$lastStr"
    }

    return tempStr
}

fun reformatNumber2(number: String): String {
    var phoneStr = ""

    var lastStr = ""
    var tempStr = ""

    number.forEach {
        if (it != ' ' && it != '-') {
            phoneStr += it
        }
    }

    if (phoneStr.length > 1 && phoneStr.length % 3 == 1) {
        lastStr = phoneStr.substring(phoneStr.length - 2, phoneStr.length)
        phoneStr = phoneStr.substring(0, phoneStr.length - 2)
    }

    phoneStr.forEachIndexed { index, c ->
        if ((index + 1) % 3 == 0 && (index + 1) != phoneStr.length) {
            tempStr += "$c-"
        } else {
            tempStr += c
        }
    }

    if (lastStr.isNotEmpty()) {
        tempStr = "$tempStr-$lastStr"
    }

    return tempStr
}