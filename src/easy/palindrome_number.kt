package easy

import kotlin.system.measureTimeMillis

/**
 * palindrome-number
 * https://leetcode.com/problems/palindrome-number/
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(isPalindrome(121))  // true
        println(isPalindrome(-121)) // false
        println(isPalindrome(10))   // false
        println(isPalindrome(-10))  // false
        println(isPalindrome(1234321))    // true
        println(isPalindrome(123321))     // true
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(isPalindrome2(121))   // true
        println(isPalindrome2(-121))    // false
        println(isPalindrome2(10))  // false
        println(isPalindrome2(-10)) // false
        println(isPalindrome2(1234321))   // true
        println(isPalindrome2(123321))    // true
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(isPalindrome3(121))   // true
        println(isPalindrome3(-121))    // false
        println(isPalindrome3(10))  // false
        println(isPalindrome3(-10)) // false
        println(isPalindrome3(1234321))   // true
        println(isPalindrome3(123321))    // true
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
}

/**
 * 將數值依序由大致小放入陣列
 * 再將陣列中的值反向放入第二個陣列
 * 並比較兩者是否相等
 */
fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false    // 小於零

    val intList: ArrayList<Int> = ArrayList()
    var y = x

    while (y > 0) {
        intList.add(y % 10)
        y /= 10
    }

    val intList2: ArrayList<Int> = ArrayList()
    for (i in 0 until intList.size) {
        intList2.add(intList[intList.size - i - 1])
    }

    return intList == intList2
}

/**
 * 將數值依序由大致小放入陣列
 * 並複製陣列並反轉
 * 並比較兩者是否相等
 * 推測reverse()吃掉部分消能
 */
fun isPalindrome2(x: Int): Boolean {
    if (x < 0) return false    // 小於零

    val intList: ArrayList<Int> = ArrayList()
    var y = x

    while (y > 0) {
        intList.add(y % 10)
        y /= 10
    }

    val intList2: ArrayList<Int> = intList.clone() as ArrayList<Int>
    intList2.reverse()

    return intList == intList2
}

/**
 * 將數值直接倒過來
 * 並比較兩者是否相等
 */
fun isPalindrome3(x: Int): Boolean {
    if (x < 0) return false    // 小於零

    var x2 = x
    var revertedNumber = 0
    while (x2 > 0) {
        revertedNumber = revertedNumber * 10 + x2 % 10
        x2 /= 10
    }

    return x == revertedNumber
}