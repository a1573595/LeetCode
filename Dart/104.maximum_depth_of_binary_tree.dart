import 'dart:math';

import 'other/tree_node.dart';

void main() {
  print(maxDepth(
      TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))));
  print(maxDepth(TreeNode(1, null, TreeNode(2))));
}

int maxDepth(TreeNode? root) {
  if (root == null) {
    return 0;
  } else if (root.left == null && root.right == null) {
    return 1;
  } else {
    return max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}
