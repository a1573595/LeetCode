void main() {
  print(maxProduct([3, 4, 5, 2]));
  print(maxProduct([1, 5, 4, 5]));
  print(maxProduct([3, 7]));
}

int maxProduct(List<int> nums) {
  var length = nums.length - 1;

  while (length > 0) {
    for (var i = 0; i < length; i++) {
      final left = nums[i];
      final right = nums[i + 1];

      if (left > right) {
        nums[i] = right;
        nums[i + 1] = left;
      }
    }

    length--;
  }

  // nums.sort();

  return (nums.last - 1) * (nums[nums.length - 2] - 1);
}
