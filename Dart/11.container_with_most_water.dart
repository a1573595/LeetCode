import 'dart:math';

void main() {
  print(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]));
  print(maxArea([1, 1]));
}

int maxArea(List<int> height) {
  var maxValue = 0;
  var left = 0;
  var right = height.length - 1;

  while (left != right) {
    final minValue = min(height[left], height[right]);
    final value = minValue * (right - left);
    maxValue = max(maxValue, value);

    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }

  return maxValue;
}
