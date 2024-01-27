fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome("0P"))
}

fun isPalindrome(s: String): Boolean {
    val str = s.lowercase().filter { it in 'a'..'z' || it in '0'..'9' }

    return str == str.reversed()
}
