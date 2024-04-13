void main() {
  print(fourSum([1, 0, -1, 0, -2, 2], 0).toString());
  print(fourSum([2, 2, 2, 2, 2], 8).toString());
  print(fourSum([0, 0, 0, 0], 0).toString());
  print(fourSum([1000000000, 1000000000, 1000000000, 1000000000], -294967296)
      .toString());
}

List<List<int>> fourSum(List<int> nums, int target) {
  nums.sort();

  List<List<int>> list = [];

  for (var i = 0; i < nums.length - 3; i++) {
    if (i != 0 && nums[i] == nums[i - 1]) {
      continue;
    }

    for (var j = i + 1; j < nums.length - 2; j++) {
      if (j > i + 1 && nums[j] == nums[j - 1]) {
        continue;
      }

      final value = target - nums[i] - nums[j];
      var left = j + 1;
      var right = nums.length - 1;

      while (left < right) {
        final sum = nums[left] + nums[right];

        if (value == sum) {
          list.add([nums[i], nums[j], nums[left], nums[right]]);

          // Skip duplicates
          while (left < right && nums[left] == nums[left + 1]) left++;
          while (left < right && nums[right] == nums[right - 1]) right--;

          left++;
          right--;
        } else if (value > sum) {
          left++;
        } else {
          right--;
        }
      }
    }
  }

  return list;
}
