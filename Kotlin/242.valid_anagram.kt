fun main() {
    println(isAnagram("anagram", "nagaram"))
    println(isAnagram("rat", "car"))
}

fun isAnagram(s: String, t: String): Boolean {
    val map = mutableMapOf<Char, Int>();
    val map2 = mutableMapOf<Char, Int>();

    s.forEach { c ->
        map[c] = (map[c]?:0) + 1;
    }

    t.forEach { c ->
        map2[c] = (map2[c]?:0) + 1;
    }
  
    return map == map2;
}