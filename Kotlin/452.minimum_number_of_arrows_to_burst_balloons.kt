fun main() {
    println(findMinArrowShots(arrayOf(intArrayOf(10,16),intArrayOf(2,8),intArrayOf(1,6),intArrayOf(7,12),)))
    println(findMinArrowShots(arrayOf(intArrayOf(1,2),intArrayOf(3,4),intArrayOf(5,6),intArrayOf(7,8))))
    println(findMinArrowShots(arrayOf(intArrayOf(1,2),intArrayOf(2,3),intArrayOf(3,4),intArrayOf(4,5))))
}

fun findMinArrowShots(points: Array<IntArray>): Int {
    if(points.isEmpty()) { 
        return 0;
    }

    points.sortBy { it.first() }

    var count = 1

    var minValue = points.first().first()
    var maxValue = points.first()[1]

    points.forEach { element -> 
        if (element.first() >= minValue && element.first() <= maxValue ||
            element[1] <= maxValue && element[1] >= minValue) {
            minValue = Math.max(minValue, element.first());
            maxValue = Math.min(maxValue, element[1]);
        } else {
            count++;
            minValue = element.first();
            maxValue = element[1];
        }
    }

    return count
}
