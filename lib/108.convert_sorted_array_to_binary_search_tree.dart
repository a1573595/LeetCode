import 'other/tree_node.dart';

void main() {
  print(sortedArrayToBST([-10, -3, 0, 5, 9]));
  print(sortedArrayToBST([1, 3]));
}

/// todo
TreeNode? sortedArrayToBST(List<int> nums) {
  if (nums.isEmpty) {
    return null;
  }

  final mid = nums.length ~/ 2;
  final root = TreeNode(nums[mid]);

  root.left = sortedArrayToBST(nums.sublist(0 , mid));
  root.right = sortedArrayToBST(nums.sublist(mid + 1));

  return root;
}
