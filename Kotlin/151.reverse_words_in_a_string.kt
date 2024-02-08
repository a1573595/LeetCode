fun main() {
    println(reverseWords("the sky is blue"))
    println(reverseWords("  hello world  "))
    println(reverseWords("a good   example"))
}

fun reverseWords(s: String): String {
    val list = mutableListOf<String>()

    var temp = ""
    for (c in s) {
        if (temp.isEmpty() && c == ' ') {
            continue
        }

        if (c == ' ') {
            if (temp.isNotEmpty()) {
                list.add(temp)
            }

            temp = ""
        } else {
            temp += c
        }
    }

    if (temp.isNotEmpty() && temp.first() != ' ') {
        list.add(temp)
    }

    return list.reversed().joinToString(" ")
}
