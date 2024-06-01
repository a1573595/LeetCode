import 'other/tree_node.dart';

void main() {
  print(_reverseString("ABCDEFG"));
  print("");
  print("");
  print(_invertBinaryTree(
      TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7, TreeNode(6), TreeNode(9)))));
  print("");
  print("");
  print(_convertANumberToHexadecimal(16));
  print(_convertANumberToHexadecimal(17));
  print(_convertANumberToHexadecimal(32));
  print(_convertANumberToHexadecimal(34));
}

String _reverseString(String str) {
  // return str.split('').reversed.join('');

  var str2 = "";
  for (var i = str.length - 1; i >= 0; i--) {
    str2 += str[i];
  }

  return str2;
}

TreeNode? _invertBinaryTree(TreeNode? root) {
  if (root == null || (root.left == null && root.right == null)) return root;

  final temp = root.left;
  root.left = _invertBinaryTree(root.right);
  root.right = _invertBinaryTree(temp);

  return root;
}

String _convertANumberToHexadecimal(int value) => value.toRadixString(16);
