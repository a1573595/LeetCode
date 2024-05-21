fun main() {
    println(reverseBits(18432))
    println(reverseBits(43261596))
}

/// todo 無法確認編譯器如何把Long放入
fun reverseBits(n: Int): Int {
    var result = 0
    for (i in 0..31) {
        result = result.shl(1)
        result = result or (n shr i and 1)
    }
    return result
}