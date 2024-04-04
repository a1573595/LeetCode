void main() {
  print(dominantIndex([3, 6, 1, 0]));
  print(dominantIndex([1, 2, 3, 4]));
  print(dominantIndex([0, 0, 3, 2]));
  print(dominantIndex([3, 0, 0, 2]));
}

int dominantIndex(List<int> nums) {
  if (nums.isEmpty) {
    return -1;
  }

  var maxValueIndex = 0;
  var secondMaxValueIndex = -1;

  for (int i = 1; i < nums.length; i++) {
    if (nums[i] > nums[maxValueIndex]) {
      secondMaxValueIndex = maxValueIndex;
      maxValueIndex = i;
    } else if (secondMaxValueIndex == -1 || nums[i] > nums[secondMaxValueIndex]) {
      secondMaxValueIndex = i;
    }
  }

  return secondMaxValueIndex == -1 || (nums[maxValueIndex] / 2) >= nums[secondMaxValueIndex]
      ? maxValueIndex
      : -1;
}
