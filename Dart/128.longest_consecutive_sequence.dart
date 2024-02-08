void main() {
  print(longestConsecutive([100, 4, 200, 1, 3, 2]));
  print(longestConsecutive([0, 3, 7, 2, 5, 8, 4, 6, 0, 1]));
  print(longestConsecutive([9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6]));
}

int longestConsecutive(List<int> nums) {
  final set = nums.toSet();

  var max = 0;

  for (var i = 0; i < nums.length; i++) {
    if (!set.contains(nums[i])) {
      continue;
    }

    var left = nums[i];
    var right = nums[i];

    while (set.contains(--left)) {
      set.remove(left);
    }

    while (set.contains(++right)) {
      set.remove(right);
    }

    var count = right - left - 1;
    if (count > max) {
      max = count;
    }
  }

  return max;
}
