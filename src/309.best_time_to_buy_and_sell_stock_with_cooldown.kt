fun main() {
    println(maxProfit4(intArrayOf(1, 2, 3, 0, 2)))
    println(maxProfit4(intArrayOf(1)))
}

fun maxProfit4(prices: IntArray): Int {
    var sold = -prices.first()
    var held = -prices.first()
    var rest = 0

    for (i in 1 ..< prices.size) {
        val prvSold = sold
        sold = held + prices[i]
        held = Math.max(held, rest - prices[i])
        rest = Math.max(rest, prvSold)
    }

    return Math.max(rest, sold)
}