fun main() {
    println(groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
    println(groupAnagrams(arrayOf("")))
    println(groupAnagrams(arrayOf("a")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()

    strs.forEach { str ->
        val partStr = str.split("").sorted()
        val key = partStr.joinToString()

        if (map.containsKey(key)) {
            map[key]?.add(str)
        } else {
            map[key] = mutableListOf(str)
        }
    }

    return map.values.toList()
}