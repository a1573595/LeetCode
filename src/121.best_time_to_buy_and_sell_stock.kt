fun main() {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    println(maxProfit(intArrayOf(1, 2)))
}

fun maxProfit(prices: IntArray): Int {
    var maxPrice = 0
    var minValue = prices.first()

    for (i in 1..<prices.size) {
        maxPrice = Math.max(maxPrice, prices[i] - minValue)
        minValue = Math.min(minValue, prices[i])
    }

    return maxPrice
}