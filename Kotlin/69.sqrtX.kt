fun main() {
    println(mySqrt(4))
    println(mySqrt(8))
}

fun mySqrt(x: Int): Int {
    if (x < 2) return x

    var left = 2
    var right = x / 2

    while (left <= right) {
        val middle = left + (right - left) / 2
        val squaredMiddle: Long = middle.toLong() * middle.toLong()

        if (squaredMiddle > x) {
            right = middle - 1
        } else if (squaredMiddle < x) {
            left = middle + 1
        } else {
            return middle
        }
    }

    return right
}
