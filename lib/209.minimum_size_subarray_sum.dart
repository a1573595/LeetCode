import 'dart:math';

void main() {
  print(minSubArrayLen(7, [2, 3, 1, 2, 4, 3]));
  print(minSubArrayLen(4, [1, 4, 4]));
  print(minSubArrayLen(11, [1, 1, 1, 1, 1, 1, 1, 1]));
  print(minSubArrayLen(213, [12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12]));
  print(minSubArrayLen(15, [1, 2, 3, 4, 5]));
}

int minSubArrayLen(int target, List<int> nums) {
  var sum = 0;
  var len = 0;

  for (int left = 0, right = 0; right < nums.length; ++right) {
    sum += nums[right];

    while (sum >= target) {
      if (len != 0) {
        len = min(len, right + 1 - left);
      } else {
        len = right + 1 - left;
      }

      sum -= nums[left];
      left += 1;
    }
  }

  return len;
}
