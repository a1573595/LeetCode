package other

fun main() {
    println(3.toBinary())
    println(4.toBinary())
    println(5.toBinary())

    println()
    println()

    println(3.toOctal())
    println(4.toOctal())
    println(5.toOctal())
    println(8.toOctal())

    println()
    println()

    println(3.toHex())
    println(4.toHex())
    println(5.toHex())
    println(8.toHex())
    println(16.toHex())
    println(32.toHex())
}

// 2's
fun Int.toBinary(): String {
    val builder = StringBuilder()
    var temp = this

    while (temp > 0) {
        builder.insert(0, temp % 2)
        temp = temp.shr(1)
    }

    return builder.toString()
}

// 8's
fun Int.toOctal(): String {
    val builder = StringBuilder()
    var temp = this

    while (temp > 0) {
        builder.insert(0, temp % 8)
        temp = temp.shr(3)
    }

    return builder.toString()
}

// 16's
fun Int.toHex(): String {
    val builder = StringBuilder()
    var temp = this

    while (temp > 0) {
        builder.insert(0, temp % 16)
        temp = temp.shr(4)
    }

    return builder.toString()
}
