void main() {
  print(removeDuplicates([1, 1, 2]));
  print(removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]));
}

int removeDuplicates(List<int> nums) {
  final set = nums.toSet();

  var index = 0;
  set.forEach((e) {
    nums[index++] = e;
  });

  return set.length;
}
