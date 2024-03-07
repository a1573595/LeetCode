import 'other/tree_node.dart';

void main() {
  print(invertTree(TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)),
      TreeNode(7, TreeNode(6), TreeNode(9)))));
  print(invertTree(TreeNode(2, TreeNode(1), TreeNode(3))));
}

TreeNode? invertTree(TreeNode? root) {
  if (root == null || root.left == null && root.right == null) {
    return root;
  }

  final temp = root.left;
  root.left = invertTree(root.right);
  root.right = invertTree(temp);

  return root;
}
