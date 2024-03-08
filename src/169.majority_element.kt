fun main() {
    println(majorityElement(intArrayOf(3, 2, 3)))
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()

    nums.forEach { e ->
        map[e] = (map[e] ?: 0) + 1
    }

    var maxKey = -1
    var maxValue = -1

    map.forEach { (k, v) ->
        if (v > maxValue) {
            maxKey = k
            maxValue = v
        }
    }

    return maxKey
}