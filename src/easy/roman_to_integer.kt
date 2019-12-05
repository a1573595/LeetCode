package easy

// https://leetcode.com/problems/roman-to-integer/
/*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    I can be placed before V (5) and X (10) to make 4 and 9.    IV  IX
    X can be placed before L (50) and C (100) to make 40 and 90.    XL  XC
    C can be placed before D (500) and M (1000) to make 400 and 900.    CD  CM
 */
fun main(args: Array<String>) {
    println(romanToInt("III"))  // 3
    println(romanToInt("IV"))   // 4
    println(romanToInt("IX"))   // 9
    println(romanToInt("LVIII")) // 58
    println(romanToInt("MCMXCIV"))  // 1994

    println()

    println(romanToInt2("III"))  // 3
    println(romanToInt2("IV"))   // 4
    println(romanToInt2("IX"))   // 9
    println(romanToInt2("LVIII")) // 58
    println(romanToInt2("MCMXCIV"))  // 1994
}

fun romanToInt(str: String): Int {
    var answer = 0
    var index = str.length - 1

    while (index >= 0) {
        outer@ while(index >= 1) {
            when(str[index-1].toString() + str[index].toString()) {
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

        if(index >= 0) {
            when(str[index]) {
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

// Finds decimal value of a given romal numeral
fun romanToInt2(str: String): Int { // Initialize result
    var res = 0
    var i = 0
    while (i < str.length) {
        // Getting value of symbol s[i]
        val s1 = value(str[i])
        // Getting value of symbol s[i+1]
        if (i + 1 < str.length) {
            val s2 = value(str[i + 1])
            // Comparing both values
            if (s1 >= s2) { // Value of current symbol is greater or equalto the next symbol
                res += s1
            } else {
                res = res + s2 - s1
                i++ // Value of current symbol is less than the next symbol
            }
        } else {
            res += s1
            i++
        }
        i++
    }
    return res
}