void main() {
  print(findDuplicates([4, 3, 2, 7, 8, 2, 3, 1]));
  print(findDuplicates([1, 1, 2]));
  print(findDuplicates([1]));
}

List<int> findDuplicates(List<int> nums) {
  final set = Set<int>();

  return nums.where((e) => !set.add(e)).toList();
}
