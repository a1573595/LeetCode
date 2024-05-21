void main() {
  print(twoSum2([2, 7, 11, 15], 9));
  print(twoSum2([2, 3, 4], 6));
  print(twoSum2([-1, 0], -1));
}

List<int> twoSum2(List<int> numbers, int target) {
  var left = 0;
  var right = numbers.length - 1;

  while (left < right) {
    final value = numbers[left] + numbers[right];

    if (value == target) {
      return [left + 1, right + 1];
    } else if (value < target) {
      left++;
    } else {
      right--;
    }
  }

  throw Exception("Not found!");
}
