void main() {
  print(removeDuplicates([1, 1, 1, 2, 2, 3]));
  print(removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]));
  print(removeDuplicates([-3, -1]));
}

int removeDuplicates(List<int> nums) {
  int? beforePrevious = null;
  int? previous = null;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] == previous && previous == beforePrevious) {
      nums.removeAt(i);
    }

    beforePrevious = previous;
    previous = nums[i];
  }

  return nums.length;
}
