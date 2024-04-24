void main() {
  print(search([-1, 0, 3, 5, 9, 12], 9));
  print(search([-1, 0, 3, 5, 9, 12], 2));
  print(search([-1, 0, 2, 3, 5, 9, 12], 12));
}

int search(List<int> nums, int target) {
  var left = 0;
  var right = nums.length - 1;

  while (left <= right) {
    final middle = left + (right - left) ~/ 2;
    final value = nums[middle];

    if (value == target) {
      return middle;
    } else if (value > target) {
      right = middle - 1;
    } else {
      left = middle + 1;
    }
  }

  return -1;
}
