fun main() {
    println(removeElement(intArrayOf(3,2,2,3), 3))
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val list = mutableListOf<Int>()

    nums.forEach { e -> 
        if(e!=`val`) {
            list.add(e)
        }
    }

    list.forEachIndexed { index, value ->
        nums[index] = value
    }

    return list.size;
}