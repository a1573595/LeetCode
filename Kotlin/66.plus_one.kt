fun main() {
    println(plusOne(intArrayOf(1, 2, 3)).joinToString())
    println(plusOne(intArrayOf(4, 3, 2, 1)).joinToString())
    println(plusOne(intArrayOf(9)).joinToString())
    println(plusOne(intArrayOf(8, 9, 9, 9)).joinToString())
}

fun plusOne(digits: IntArray): IntArray {
    var count = true

    for (i in digits.size - 1 downTo (0)) {
        if (digits[i] == 9 && count) {
            digits[i] = 0
            count = true
        } else {
            digits[i]++
            count = false
            break
        }
    }

    if (count) {
        return intArrayOf(1) + digits
    }

    return digits
}
