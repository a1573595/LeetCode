fun main() {
    println(myAtoi(""))   // 0
    println(myAtoi("42"))   // 42
    println(myAtoi("   -42"))   // -42
    println(myAtoi("4193 with words"))  // 4193
    println(myAtoi("words and 987"))  // 0
    println(myAtoi("0032"))  // 32
    println(myAtoi("-91283472332"))  // -2147483648
    println(myAtoi("3.14159"))  // 3
    println(myAtoi("+1"))  // 1
    println(myAtoi("+-12"))  // 0
    println(myAtoi("00000-42a1234"))  // 0
    println(myAtoi("   +0 123"))  // 0
    println(myAtoi("9223372036854775808"))  // 2147483647
    println(myAtoi("-2147483648")) // -2147483648
    println(myAtoi("-2147483647")) // -2147483647
    println(myAtoi("2147483647")) // 2147483647
    println(myAtoi("2147483646")) // 2147483646
    println(myAtoi(" -1010023630o4")) // -1010023630
}

fun myAtoi(s: String): Int {
    val str = s.trimStart()
    val isPositive = str.firstOrNull() == '+'
    val isNegative = str.firstOrNull() == '-'
    val start = if (isPositive || isNegative) 1 else 0

    var result = 0

    for (i in start..<str.length) {
        val code = str[i].code - 48

        if (code in 0..9) {
            if (isNegative && -result < (Int.MIN_VALUE + code) / 10) {
                return Int.MIN_VALUE
            } else if (!isNegative && result > (Int.MAX_VALUE - code) / 10) {
                return Int.MAX_VALUE
            } else {
                result *= 10
                result += code
            }
        } else {
            break
        }
    }

    return if (!isNegative) result else -result
}