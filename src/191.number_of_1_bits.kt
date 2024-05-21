fun main() {
    println(hammingWeight(3));
    println(hammingWeight(11));
    println(hammingWeight(128));
    println(hammingWeight(2147483645));
}

fun hammingWeight(n: Int): Int {
    var result = 0
    var num = n

    while (num > 0) {
        if (num.and(1) > 0) {
            result++
        }

        num = num.shr(1)
    }

    return result
}