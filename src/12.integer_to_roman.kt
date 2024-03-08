fun main() {
    println(intToRoman(3))
    println(intToRoman(58))
    println(intToRoman(1994))
}

fun intToRoman(num: Int): String {
    val ones = listOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    val tens = listOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val hunds = listOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val thous = listOf("", "M", "MM", "MMM", "MMMM")

    var n = num

    val t = thous[n / 1000]
    val h = hunds[n / 100 % 10]
    val te = tens[n / 10 % 10]
    val o = ones[n % 10]

    return t + h + te + o
}
