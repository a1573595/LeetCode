void main() {
  print(threeSum([-1, 0, 1, 2, -1, -4]));
  print(threeSum([0, 1, 1]));
  print(threeSum([0, 0, 0]));
}

List<List<int>> threeSum(List<int> nums) {
  List<List<int>> list = [];

  nums.sort();

  for (int i = 0; i < nums.length - 2; i++) {
    // Skip duplicates
    if (i != 0 && nums[i] == nums[i - 1]) {
      continue;
    }

    final target = -nums[i];
    var left = i + 1;
    var right = nums.length - 1;

    while (left < right) {
      final value = nums[left] + nums[right];

      if (value == target) {
        list.add([nums[i], nums[left], nums[right]]);

        // Skip duplicates
        while (left < right && nums[left] == nums[left + 1]) left++;
        while (left < right && nums[right] == nums[right - 1]) right--;

        left++;
        right--;
      } else if (value < target) {
        left++;
      } else {
        right--;
      }
    }
  }

  return list;
}
