fun main() {
    println(maxProfit2(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(maxProfit2(intArrayOf(1, 2, 3, 4, 5)))
    println(maxProfit2(intArrayOf(7, 6, 4, 3, 1)))
    println(maxProfit2(intArrayOf(1, 2)))
}

fun maxProfit2(prices: IntArray): Int {
    var price = 0
    var last = prices.first()

    for (i in 1..<prices.size) {
        if (prices[i] > last) {
            price += prices[i] - last
        }

        last = prices[i]
    }

    return price
}