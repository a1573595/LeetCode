fun main() {
    println(canJump(intArrayOf(2,3,1,1,4))) // true
    println(canJump(intArrayOf(3,2,1,0,4))) // false
    println(canJump(intArrayOf(2, 0))); // true
    println(canJump(intArrayOf(2, 5, 0, 0))); // true
    println(canJump(intArrayOf(0, 1))); // false
}

fun canJump(nums: IntArray): Boolean {
    var reachable = 0;

    for(i in nums.indices) {
        if (i > reachable) {
            return false;
          }
      
          reachable = Math.max(reachable, i + nums[i]);
    }
  
    return true;
}