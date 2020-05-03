package easy

// https://leetcode.com/problems/count-and-say/

fun main() {
    println(countAndSay(8))
    println(countAndSay(10))

    println(countAndSay2(8))
    println(countAndSay2(10))
}

fun countAndSay(n: Int): String {
    var sayString = "1"
    var count = 1

    for (i in 2..n) {
        val temString = sayString
        sayString = ""

        for (j in temString.indices) {
            if (j < temString.lastIndex && temString[j] == temString[j + 1]) {
                count++
            } else {
                sayString = sayString + count + temString[j]
                count = 1
            }
        }
    }


    return sayString
}

fun countAndSay2(n: Int): String {
    var sayString = when {
        n <= 1 -> "1"
        n == 2 -> "11"
        n == 3 -> "21"
        n == 4 -> "1211"
        else -> "111221"
    }
    var count = 1

    for (i in 6..n) {
        val temString = sayString
        sayString = ""

        for (j in temString.indices) {
            if (j < temString.lastIndex && temString[j] == temString[j + 1]) {
                count++
            } else {
                sayString = sayString + count + temString[j]
                count = 1
            }
        }
    }


    return sayString
}