fun main() {
    println(findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
    println(findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
    println(findDuplicate(intArrayOf(3, 3, 3, 3, 3)))
}

fun findDuplicate(nums: IntArray): Int {
    var tortoise = nums[0]
    var hare = nums[0]

    do {
        tortoise = nums[tortoise]
        hare = nums[nums[hare]]
    } while (tortoise != hare)

    tortoise = nums[0]

    while (tortoise != hare) {
        tortoise = nums[tortoise]
        hare = nums[hare]
    }
    return tortoise
}