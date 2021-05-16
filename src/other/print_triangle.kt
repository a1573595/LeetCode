package other

/**
 * 印出三角形
 * 1. 右三角
 * 2. 左三角
 * 3. 倒右三角
 * 4. 倒左三角
 * 5. 三角型
 * 6. 完整倒三角
 */
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

    printHollowTriangle(5)
    println()
    println()

    printInvertedHollowTriangle(5)
    println()
    println()
}

//  右三角
fun printTriangle(level: Int) {
    for (i in 0 until level) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }
}

// 左三角
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

//  印出倒右三角
fun printInvertedTriangle(level: Int) {
    for (i in level - 1 downTo 0) {
        for (j in i downTo 0) {
            print("*")
        }
        println()
    }
}

// 倒左三角
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

//  印出三角
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

//  印出倒三角
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

//  印出空心三角
fun printHollowTriangle(level: Int) {
    for (i in 0 until level) {
        for (j in i until level - 1) {
            print(" ")
        }

        for (k in 0..i) {
            if (i == 0 || i == level - 1 || k == 0 || k == i) {
                print("* ")
            } else {
                print("  ")
            }
        }

        println()
    }
}

//  印出空心倒三角
fun printInvertedHollowTriangle(level: Int) {
    for (i in 0 until level) {
        for (j in 0 until i) {
            print(" ")
        }

        for (k in i until level) {
            if (i == 0 || i == level - 1 || k == i || k == level - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }

        println()
    }
}