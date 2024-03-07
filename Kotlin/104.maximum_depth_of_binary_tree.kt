fun main() {
    println(maxDepth(
        TreeNode(3).apply { 
            left = TreeNode(9)
            right = TreeNode(20).apply { 
                left = TreeNode(15)
                right=TreeNode(7)
            }
        }
    ))

    println(maxDepth(
        TreeNode(1).apply { 
            right = TreeNode(2)
        }
    ))
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun maxDepth(root: TreeNode?): Int {
    return when {
        root == null -> 0;
        root.left == null && root.right == null -> 1;
        else -> Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}