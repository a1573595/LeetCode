fun main() {
    println(insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5)).joinToString())
    println(
        insert(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 5),
                intArrayOf(6, 7),
                intArrayOf(8, 10),
                intArrayOf(12, 16)
            ),
            intArrayOf(4, 8)
        )
            .joinToString()
    )
}

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val list = mutableListOf<IntArray>()

    var index = 0

    var start = newInterval.first()
    var end = newInterval.last()

    while (index < intervals.size && intervals[index].last() < start) {
        list.add(intervals[index++])
    }

    while (index < intervals.size && intervals[index].first() <= end) {
        start = Math.min(intervals[index].first(), start)
        end = Math.max(intervals[index++].last(), end)
    }

    list.add(intArrayOf(start, end))

    while (index < intervals.size) {
        list.add(intervals[index++])
    }

    return list.toTypedArray()
}
