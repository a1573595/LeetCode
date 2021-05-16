package easy

import kotlin.collections.ArrayList
import kotlin.system.measureTimeMillis

/**
 * valid-parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(isValid("()"))  // true
        println(isValid("()[]{}"))  // true
        println(isValid("(]"))
        println(isValid("([)]"))
        println(isValid("{[]}"))  // true
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(isValid2("()"))  // true
        println(isValid2("()[]{}"))  // true
        println(isValid2("(]")) // false
        println(isValid2("([)]")) // false
        println(isValid2("{[]}"))  // true
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(isValid3("()"))  // true
        println(isValid3("()[]{}"))  // true
        println(isValid3("(]")) // false
        println(isValid3("([)]")) // false
        println(isValid3("{[]}"))  // true
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")

}

/**
 * 放入陣列中計算
 */
fun isValid(str: String): Boolean {
    val charList = ArrayList<Char>()

    for (c in str) {
        if (charList.size >= 0 && (c == '(' || c == '{' || c == '[')) {
            charList.add(c)
        } else if (charList.size > 0 && (c == ')' && charList[charList.size - 1] == '(' ||
                    c == '}' && charList[charList.size - 1] == '{' ||
                    c == ']' && charList[charList.size - 1] == '[')
        ) {
            charList.removeAt(charList.size - 1)
        } else
            return false
    }

    return charList.size == 0
}

/**
 * 暴力法直接比對組合
 */
fun isValid2(str: String): Boolean {
    var str2 = str

    while (str2.contains("()") || str2.contains("[]") || str2.contains("{}")) {
        str2 = str2.replace("()", "").replace("[]", "").replace("{}", "")
    }

    return str2.isEmpty()
}

/**
 * 當有對應符號出現
 * 則下一個或最後一個符號應為對應符號
 */
fun isValid3(str: String): Boolean {
    val strList = str.toMutableList()

    while (strList.isNotEmpty()) {
        when (strList.first()) {
            '(' -> {
                when {
                    strList.size == 1 -> {
                        return false
                    }
                    strList[1] == ')' -> {
                        strList.removeAt(1)
                        strList.removeAt(0)
                    }
                    strList.last() == ')' -> {
                        strList.removeAt(strList.lastIndex)
                        strList.removeAt(0)
                    }
                    else -> {
                        return false
                    }
                }
            }
            '{' -> {
                when {
                    strList.size == 1 -> {
                        return false
                    }
                    strList[1] == '}' -> {
                        strList.removeAt(1)
                        strList.removeAt(0)
                    }
                    strList.last() == '}' -> {
                        strList.removeAt(strList.lastIndex)
                        strList.removeAt(0)
                    }
                    else -> {
                        return false
                    }
                }
            }
            '[' -> {
                when {
                    strList.size == 1 -> {
                        return false
                    }
                    strList[1] == ']' -> {
                        strList.removeAt(1)
                        strList.removeAt(0)
                    }
                    strList.last() == ']' -> {
                        strList.removeAt(strList.lastIndex)
                        strList.removeAt(0)
                    }
                    else -> {
                        return false
                    }
                }
            }
        }
    }

    return true
}