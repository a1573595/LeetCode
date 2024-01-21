fun main() {
    println(twoSum(intArrayOf(2,7,11,15), 9).joinToString())
    println(twoSum(intArrayOf(3,2,4), 6).joinToString());
    println(twoSum(intArrayOf(3,3), 6).joinToString());
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>();

    for(i in nums.indices) {
        map[nums[i]] = i;
    }

    for(i in nums.indices) {
        val i2 = map[target - nums[i]];

        if(i2 !=null && i != i2) {
            return intArrayOf(i, i2);
        }
    }

    throw Exception("Not found!")
}
