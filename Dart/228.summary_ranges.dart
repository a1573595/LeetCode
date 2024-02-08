void main() {
  print(summaryRanges([0, 1, 2, 4, 5, 7]));
  print(summaryRanges([0, 2, 3, 4, 6, 8, 9]));
}

List<String> summaryRanges(List<int> nums) {
  if (nums.isEmpty) {
    return List.empty();
  }

  final list = <String>[];

  var left = nums.first;
  var right = left;

  for (var i = 1; i < nums.length; i++) {
    if (nums[i] - 1 != right) {
      if (left != right) {
        list.add("$left->$right");
      } else {
        list.add("$left");
      }

      left = nums[i];
    }

    right = nums[i];
  }

  if (left != right) {
    list.add("$left->$right");
  } else {
    list.add("$left");
  }

  return list;
}
