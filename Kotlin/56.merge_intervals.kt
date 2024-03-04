fun main() {
    println(merge(arrayOf(intArrayOf(1,3), intArrayOf(2,6), intArrayOf(8,10), intArrayOf(15,18))).joinToString(){ e-> e.joinToString()})
    println(merge(arrayOf(intArrayOf(1,4), intArrayOf(4,5))).joinToString(){ e-> e.joinToString()})
    println(merge(arrayOf(intArrayOf(1,4), intArrayOf(0,4))).joinToString(){ e-> e.joinToString()})
    println(merge(arrayOf(intArrayOf(1,4), intArrayOf(0,1))).joinToString(){ e-> e.joinToString()})
    println(merge(arrayOf(intArrayOf(1,4), intArrayOf(0,0))).joinToString(){ e-> e.joinToString()})
    println(merge(arrayOf(intArrayOf(2,3), intArrayOf(4,5), intArrayOf(6,7), intArrayOf(8,9), intArrayOf(1,10))).joinToString(){ e-> e.joinToString()})
}

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }

    val result = mutableListOf<IntArray>()

    var lastList: IntArray? = null

    for(list in intervals) {
        if (lastList == null) {
            lastList = list;
        } else if (lastList[1] >= list[0] && lastList[0] <= list[1]) {
            lastList[0] = Math.min(lastList[0], list[0]);
            lastList[1] = Math.max(lastList[1], list[1]);
        } else {
            result.add(lastList);
            lastList = list;
        }
    }
  
    if (lastList != null) {
      result.add(lastList);
    }
  
    return result.toTypedArray();
}