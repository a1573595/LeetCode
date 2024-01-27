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

    for (i in 0..t.length - 1) {
        if (index >= s.length) {
            break
        } else if (s[index] == t[i]) {
            index++
        }
    }

    return index == s.length
}
