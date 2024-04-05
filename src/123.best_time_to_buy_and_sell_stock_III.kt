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
        buy1 = Math.max(buy1, -prices[i])
        sell1 = Math.max(sell1, buy1 + prices[i])
        buy2 = Math.max(buy2, sell1 - prices[i])
        sell2 = Math.max(sell2, buy2 + prices[i])
    }

    return sell2
}