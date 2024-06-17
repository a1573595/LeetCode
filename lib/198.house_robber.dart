import 'dart:math';

void main() {
  print(rob([1, 2, 3, 1]));
  print(rob([2, 7, 9, 3, 1]));
  print(rob([2, 1, 1, 2]));
}

/// todo
int rob(List<int> nums) {
  final dp = List<int>.from(nums);

  for (var i = 0; i < nums.length; i++) {
    for (var j = i + 2; j < nums.length; j++) {
      dp[j] = max(dp[j], dp[i] + nums[j]);
    }
  }

  return dp.isEmpty ? 0 : dp.reduce(max);
}
