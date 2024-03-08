fun main() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
    println(isSubsequence("", "ahbgdc"))
    println(isSubsequence("b", "abc"))
}

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) {
        return true
    }

    var index = 0

    for (element in t) {
        if (index >= s.length) {
            break
        } else if (s[index] == element) {
            index++
        }
    }

    return index == s.length
}
