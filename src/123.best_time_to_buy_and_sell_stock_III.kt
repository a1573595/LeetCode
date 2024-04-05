fun main() {
    println(maxProfit3(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)))
    println(maxProfit3(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(maxProfit3(intArrayOf(1, 2, 3, 4, 5)))
    println(maxProfit3(intArrayOf(7, 6, 4, 3, 1)))
    println(maxProfit3(intArrayOf(1, 2)))
}

fun maxProfit3(prices: IntArray): Int {
    if (prices.isEmpty()) return 0
    var buy1 = -prices[0]
    var buy2 = -prices[0]
    var sell1 = 0
    var sell2 = 0

    for (i in 1..<prices.size) {
        buy1 = buy1.coerceAtLeast(-prices[i])
        sell1 = sell1.coerceAtLeast(buy1 + prices[i])
        buy2 = buy2.coerceAtLeast(sell1 - prices[i])
        sell2 = sell2.coerceAtLeast(buy2 + prices[i])
    }

    return sell2
}