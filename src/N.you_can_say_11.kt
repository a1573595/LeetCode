fun main() {
    println(isItAMultipleOfEleven("112233"))
    println(isItAMultipleOfEleven("30800"))
    println(isItAMultipleOfEleven("2937"))
    println(isItAMultipleOfEleven("323455693"))
    println(isItAMultipleOfEleven("5038297"))
    println(isItAMultipleOfEleven("112234"))
    println(isItAMultipleOfEleven("0"))
    println(isItAMultipleOfEleven(""))
}

fun isItAMultipleOfEleven(num: String): Boolean {
    if (num.isEmpty()) {
        return false
    }

    var odd = 0
    var even = 0

    var isOdd = true
    for (i in 0 ..< num.length) {
        val value = num[i].digitToInt()

        if (isOdd) {
            odd += value
        } else {
            even += value
        }

        isOdd = !isOdd
    }

    return 0 == odd - even
}
