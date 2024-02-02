fun main() {
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
    println(threeSum(intArrayOf(0,1,1)))
    println(threeSum(intArrayOf(0,0,0)))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val set = mutableSetOf<List<Int>>()

    nums.sort()
    for(i in 0 .. nums.size - 2) {
        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right];
      
            if (sum == 0) {
                set.add(listOf(nums[i], nums[left], nums[right]));
                left++;
                right--;
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
          }
    }

    return set.toList();
}