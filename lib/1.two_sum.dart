void main() {
  print(twoSum([2, 7, 11, 15], 9));
  print(twoSum([3, 2, 4], 6));
  print(twoSum([3, 3], 6));
}

List<int> twoSum(List<int> nums, int target) {
  final map = {};

  for (int i = 0; i < nums.length; i++) {
    map[nums[i]] = i;
  }

  for (int i = 0; i < nums.length; i++) {
    final i2 = map[target - nums[i]];

    if (i2 != null && i != i2) {
      return [i, i2];
    }
  }

  throw Exception("Not found!");
}
