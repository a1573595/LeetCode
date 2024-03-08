fun main() {
    println(canConstruct("a", "b"))
    println(canConstruct("aa", "ab"))
    println(canConstruct("aa", "aab"))
    println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"))
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val map = mutableMapOf<Char, Int>()

    ransomNote.forEach { c ->
        map[c] = (map[c] ?: 0) + 1
    }

    for (c in magazine) {
        val value = map[c]

        if (value != null && value > 0) {
            map[c] = value - 1
        }
    }

    return !map.values.any { predicate -> predicate > 0 }
}