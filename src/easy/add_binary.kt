package easy

import kotlin.system.measureTimeMillis

/**
 * add-binary
 * https://leetcode.com/problems/add-binary/
 */
fun main() {
    println(addBinary("11", "1"))   // 100
    println(addBinary("1010", "1011"))  // 10101
//    println(
//        addBinary(
//            "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//            "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
//        )
//    )  // 10101

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(addBinary2("11", "1"))   // 100
        println(addBinary2("1010", "1011"))  // 10101
        println(
            addBinary2(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
            )
        )  // 10101
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun2: $costTimeMillis2")
}

/**
 * 使用內建函式轉換
 * NumberFormatException
 */
fun addBinary(a: String, b: String): String {
    val sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
    return Integer.toBinaryString(sum)
}

/**
 * 使用pad將兩個字串填充0至相同長度
 * 第一個迴圈只合併數字，不管進位
 * 第二個迴圈再計算進位
 * 第三個迴圈轉字串
 * 輸出時把開頭的0去掉
 */
fun addBinary2(a: String, b: String): String {
    val size = (if (a.length > b.length) a.length else b.length) + 1

    val newA = a.padStart(size, '0')
    val newB = b.padStart(size, '0')
    val strs: Array<Char> = Array(size) { '0' }

    for (i in strs.size - 1 downTo 0) {
        strs[i] = when {
            newA[i] == '1' && newB[i] == '1' -> {
                '2'
            }
            newA[i] == '0' && newB[i] == '0' -> {
                '0'
            }
            else -> '1'
        }
    }

    var needPlus = false
    for (i in strs.size - 1 downTo 0) {
        if (needPlus) {
            if (strs[i] == '2') {
                strs[i] = '1'
                needPlus = true
            } else if (strs[i] == '1') {
                strs[i] = '0'
                needPlus = true
            } else {
                strs[i] = '1'
                needPlus = false
            }
        } else if (strs[i] == '2') {
            strs[i] = '0'
            needPlus = true
        }
    }

    var str = ""
    strs.forEach {
        str += it
    }

    return if (str[0] == '0') str.drop(1) else str
}