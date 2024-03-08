fun main() {
    println(wordPattern("abba", "dog cat cat dog"))
    println(wordPattern("abba", "dog cat cat fish"))
    println(wordPattern("aaaa", "dog cat cat dog"))
}

fun wordPattern(pattern: String, s: String): Boolean {
    val map = mutableMapOf<Char, String>()
    val map2 = mutableMapOf<String, Char>()

    val str2 = s.split(" ")

    if (pattern.length != str2.size) {
        return false
    }

    for (i in pattern.indices) {
        val value = map[pattern[i]]
        val value2 = map2[str2[i]]

        if (value == null) {
            map[pattern[i]] = str2[i]
        } else if (value != str2[i]) {
            return false
        }

        if (value2 == null) {
            map2[str2[i]] = pattern[i]
        } else if (value2 != pattern[i]) {
            return false
        }
    }

    return true
}