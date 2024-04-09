fun main() {
    println(sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
    println(sortedArrayToBST(intArrayOf(1, 3)))
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }

    val mid = nums.size / 2
    val root = TreeNode(nums[mid])

    root.left = sortedArrayToBST(nums.take(mid).toIntArray())
    root.right = sortedArrayToBST(nums.drop(mid+1).toIntArray())

    return root
}