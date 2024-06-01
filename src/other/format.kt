package other

fun main() {
    println(3.toBinaryStr())
    println(4.toBinaryStr())
    println(5.toBinaryStr())

    println()
    println()

    println(3.toOctalStr())
    println(4.toOctalStr())
    println(5.toOctalStr())
    println(8.toOctalStr())

    println()
    println()

    println(3.toHexString())
    println(4.toHexString())
    println(5.toHexString())
    println(8.toHexString())
    println(16.toHexString())
    println(32.toHexString())
}

// todo
fun Int.toBinaryStr() = this.toString(2)
fun Int.toOctalStr() = this.toString(8)
fun Int.toHexString() = this.toString(16)

//fun Int.toBinary(): String {
//    val builder = StringBuilder()
//    var temp = this
//
//    while (temp > 0) {
//        builder.insert(0, temp % 2)
//        temp = temp.shr(1)
//    }
//
//    return builder.toString()
//}
//
//fun Int.toOctal(): String {
//    val builder = StringBuilder()
//    var temp = this
//
//    while (temp > 0) {
//        builder.insert(0, temp % 8)
//        temp = temp.shr(3)
//    }
//
//    return builder.toString()
//}
//
//fun Int.toHex(): String {
//    val builder = StringBuilder()
//    var temp = this
//
//    while (temp > 0) {
//        builder.insert(0, temp % 16)
//        temp = temp.shr(4)
//    }
//
//    return builder.toString()
//}
