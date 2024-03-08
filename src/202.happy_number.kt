fun main() {
    println(isHappy(19))
    println(isHappy(2))
}

fun isHappy(n: Int): Boolean {
    var x = n
    val set = mutableSetOf<Int>()

    while (x > 1) {
        if (!set.add(x)) {
            break
        }

        val str = x.toString()
        x = 0

        for (s in str) {
            x += "$s".toInt() * "$s".toInt()
        }
    }

    return x == 1
}