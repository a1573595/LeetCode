fun main() {
    println(strStr("sadbutsad", "sad"));
    println(strStr("leetcode", "leeto"));
}

fun strStr(haystack: String, needle: String): Int {
    for(i in haystack.indices) {
        if(haystack.length - i - needle.length < 0) {
            break;
        } else if (haystack.substring(i, i + needle.length) == needle) {
            return i;
        }
    }
     
    return -1;
}