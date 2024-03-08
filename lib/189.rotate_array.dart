void main() {
  rotate([1, 2, 3, 4, 5, 6, 7], 3);
  rotate([-1, -100, 3, 99], 2);
  rotate([1, 2], 3);
}

void rotate(List<int> nums, int k) {
  final list = <int>[];
  final offset = nums.length - k % nums.length;

  for (int i = 0; i < nums.length; i++) {
    list.add(nums[(i + offset) % (nums.length)]);
  }

  var index = 0;
  list.forEach((e) {
    nums[index++] = e;
  });
}
