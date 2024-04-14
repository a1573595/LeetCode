fun main() {
    println(romanToInt("III"))
    println(romanToInt("IV"))
    println(romanToInt("IX"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    var count = 0
    var index = 0

    while (index < s.length) {
        if (index < s.length - 1) {
            val value = twoChar ("${s[index]}${s[index + 1]}")

            count += value

            if (value != 0) {
                index += 2
                continue
            }
        }

        val value = oneChar ("${s[index]}")

        count += value
        index++
    }

    return count
}

fun twoChar(str: String): Int {
    return when (str) {
        "IV" -> 4
        "IX" -> 9
        "XL" -> 40
        "XC" -> 90
        "CD" -> 400
        "CM" -> 900
        else -> 0
    }
}

fun oneChar(str: String): Int {
    return when (str) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }
}