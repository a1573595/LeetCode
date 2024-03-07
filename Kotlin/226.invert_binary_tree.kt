import TreeNode

fun main() {
    println(invertTree(
        TreeNode(4).apply { 
            left = TreeNode(4).apply { 
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(2) .apply { 
                left = TreeNode(6)
                right = TreeNode(9)
            }
        }
    ))

    println(invertTree(
        TreeNode(2).apply { 
            left = TreeNode(1)
            right = TreeNode(3)
        }
    ))
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun invertTree(root: TreeNode?): TreeNode? {
    if(root==null || root.left ==null && root.right==null) {
        return root
    }

    val temp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(temp);
  
    return root;
}
