fun main() {
    println(containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))
    println(containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))
    println(containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = mutableMapOf<Int,Int>()

    for(i in nums.indices) {
        if (map.containsKey(nums[i])) {
            if (i - map[nums[i]]!! <= k) {
              return true;
            }
          }
      
          map[nums[i]] = i;
    }

    return false
}