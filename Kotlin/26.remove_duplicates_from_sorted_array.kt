fun main() {
    println(removeDuplicates(intArrayOf(1,1,2)));
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)));
}

fun removeDuplicates(nums: IntArray): Int {
    val set = nums.toSet()

    set.forEachIndexed { i, v ->
        nums[i] = v;
    }

    return set.size;
}