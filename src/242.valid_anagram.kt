fun main() {
    println(isAnagram("anagram", "nagaram"))
    println(isAnagram("rat", "car"))
    println()
    println(isAnagramV2("anagram", "nagaram"))
    println(isAnagramV2("rat", "car"))
}

fun isAnagram(s: String, t: String): Boolean {
    val map = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()

    s.forEach { c ->
        map[c] = (map[c] ?: 0) + 1
    }

    t.forEach { c ->
        map2[c] = (map2[c] ?: 0) + 1
    }

    return map == map2
}

fun isAnagramV2(s: String, t: String): Boolean {
    val array = IntArray(26)

    for (c in s) {
        array[c - 'a'] += 1
    }

    for (c in t) {
        array[c - 'a'] -= 1
    }

    return !array.any { e -> e != 0 }
}