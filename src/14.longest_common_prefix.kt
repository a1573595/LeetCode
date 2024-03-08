fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var str = ""
    var index = 0

    while (true) {
        val c: String = strs.map { e -> if (e.length > index) "${e[index]}" else "" }
            .reduce { a, b -> if (a == b && a != "") a else "" }

        if (c.isNotEmpty()) {
            str += c
            index++
        } else {
            break
        }
    }

    return str
}