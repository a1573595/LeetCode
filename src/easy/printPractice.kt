package easy

fun main() {
    printTriangle(5)
    println()
    println()

    printTriangle2(5)
    println()
    println()

    printInvertedTriangle(5)
    println()
    println()

    printInvertedTriangle2(5)
    println()
    println()

    printRegularTriangle(5)
    println()
    println()

    printRegularTriangle2(5)
    println()
    println()

//    printMultiplicationTable()
//    println()
//    println()
}

//  印出三角型
fun printTriangle(level: Int) {
    for (i in 0 until level) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }
}

fun printTriangle2(level: Int) {
    for (i in 0 until level) {
        for (j in 0 until level - i) {
            print(" ")
        }

        for (k in 0..i) {
            print("*")
        }
        println()
    }
}

//  印出倒三角型
fun printInvertedTriangle(level: Int) {
    for (i in level - 1 downTo 0) {
        for (j in i downTo 0) {
            print("*")
        }
        println()
    }
}

fun printInvertedTriangle2(level: Int) {
    for (i in level - 1 downTo 0) {
        for (j in level - 1 downTo i + 1) {
            print(" ")
        }

        for (k in i downTo 0) {
            print("*")
        }
        println()
    }
}

//  印出正三角形
fun printRegularTriangle(level: Int) {
    for (i in 0 until level) {
        for (j in i until level - 1) {
            print(" ")
        }

        for (k in 0..i) {
            print("* ")
        }

        println()
    }
}

//  印出倒正三角形
fun printRegularTriangle2(level: Int) {
    for (i in 0 until level) {
        for (j in 0 until i) {
            print(" ")
        }

        for (k in i until level) {
            print("* ")
        }

        println()
    }
}

//  印出空心三角形
fun printHollowTriangle(level: Int) {

}

//  印出九九乘法表
fun printMultiplicationTable() {
    for (i in 1..9) {
        for (j in 1..9) {
            println("$i * $j = ${i * j}")
        }
//        println()
    }
}
