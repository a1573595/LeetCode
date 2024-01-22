fun main() {
    println(removeDuplicates2(intArrayOf(1,1,1,2,2,3)))
    println(removeDuplicates2(intArrayOf(0,0,1,1,1,1,2,3,3)))
    print(removeDuplicates2(intArrayOf(-3, -1)));
}

fun removeDuplicates2(nums: IntArray): Int {
    var list = mutableListOf<Int>()

    var beforePrevious:Int? = null;
    var previous:Int? = null;

    for(i in nums) {
        if(i != previous || previous != beforePrevious) {
            list.add(i);
        }

        beforePrevious = previous;
        previous = i;
    }

    list.forEachIndexed { i, v -> 
        nums[i] = v;
    }

    return list.size;
}