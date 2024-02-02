fun main() {
    println(lengthOfLongestSubstring("abcabcbb"));
    println(lengthOfLongestSubstring("bbbbb"));
    println(lengthOfLongestSubstring("pwwkew"));
}

fun lengthOfLongestSubstring(s: String): Int {
    var set = mutableSetOf<String>();

    for(i in 0 until(s.length)) {
        val currentSet = mutableSetOf<String>();
        currentSet.add(s[i].toString());

        for(j in i+1 until(s.length)) {
            if (!currentSet.add(s[j].toString())) {
                break;
            }
        }

        if (set.size < currentSet.size) {
            set = currentSet;
          }
    }

    return set.size
}