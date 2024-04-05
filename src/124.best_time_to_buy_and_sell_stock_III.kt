fun main() {
    println(maxProfit(2, intArrayOf(2, 4, 1)))
    println(maxProfit(2, intArrayOf(3, 2, 6, 5, 0, 3)))
}

fun maxProfit(k: Int, prices: IntArray): Int {
    if (prices.isEmpty()) return 0

    val buyList = MutableList(size = k, init = { _ -> -prices.first() })
    val sellList = MutableList(size = k, init = { _ -> 0 })

    for (i in 1..<prices.size) {
        for (j in 0..<k) {
            buyList[j] =
                Math.max(buyList[j], if (j == 0) -prices[i] else sellList[j - 1] - prices[i])
            sellList[j] = Math.max(sellList[j], buyList[j] + prices[i])
        }
    }

    return sellList.last()
}