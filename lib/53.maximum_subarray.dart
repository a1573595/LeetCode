import 'dart:math';

void main() {
  print(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]));
  print(maxSubArray([1]));
  print(maxSubArray([5, 4, -1, 7, 8]));
  print(maxSubArray([-1, -2]));
  print(maxSubArray([1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4]));
}

int maxSubArray(List<int> nums) {
  int curSum = nums[0];
  int maxSum = nums[0];

  for (int i = 1; i < nums.length; i++) {
    curSum = max(nums[i], curSum + nums[i]);
    maxSum = max(maxSum, curSum);
  }

  return maxSum;
}
