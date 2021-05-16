package other

/**
 * 印出九九乘法表
 */
fun main() {
    printMultiplicationTable()
}

//  九九乘法表
fun printMultiplicationTable() {
    for (i in 1..9) {
        for (j in 1..9) {
            println("$i * $j = ${i * j}")
        }
//        println()
    }
}