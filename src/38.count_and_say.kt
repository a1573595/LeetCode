fun main() {
    println(countAndSay(8))
    println(countAndSay(10))
    println(countAndSay(15))
}

fun countAndSay(n: Int): String {
    var str = when (n) {
        1 -> "1"
        2 -> "11"
        3 -> "21"
        4 -> "1211"
        else -> "111221"
    }

    var count = 1
    for (i in 6..n) {
        val temp = str
        str = ""

        for (j in temp.indices) {
            if (j != temp.lastIndex && temp[j] == temp[j + 1]) {
                count++
            } else {
                str += "$count${temp[j]}"
                count = 1
            }
        }
    }

    return str
}