fun main() {
    println(isIsomorphic("egg", "add"))
    println(isIsomorphic("foo", "bar"))
    println(isIsomorphic("paper", "title"))
    println(isIsomorphic("badc", "baba"))
}

fun isIsomorphic(s: String, t: String): Boolean {
    val map = mutableMapOf<Char, Char>()
    val map2 = mutableMapOf<Char, Char>()

    for (i in s.indices) {
        val value = map[s[i]]
        val value2 = map2[t[i]]

        if (value == null) {
            map[s[i]] = t[i]
        } else if (value != t[i]) {
            return false
        }

        if (value2 == null) {
            map2[t[i]] = s[i]
        } else if (value2 != s[i]) {
            return false
        }
    }

    return true
}