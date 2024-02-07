void main() {
  print(containsNearbyDuplicate([1, 2, 3, 1], 3));
  print(containsNearbyDuplicate([1, 0, 1, 1], 1));
  print(containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2));
}

bool containsNearbyDuplicate(List<int> nums, int k) {
  final map = <int, int>{};

  for (int i = 0; i < nums.length; i++) {
    if (map.containsKey(nums[i])) {
      if (i - map[nums[i]]! <= k) {
        return true;
      }
    }

    map[nums[i]] = i;
  }

  return false;
}
