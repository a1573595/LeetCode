fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    val reversedStr = str.reversed()

    return str == reversedStr
}
