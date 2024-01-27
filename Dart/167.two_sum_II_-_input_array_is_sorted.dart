void main() {
  print(twoSum2([2, 7, 11, 15], 9));
  print(twoSum2([2, 3, 4], 6));
  print(twoSum2([-1, 0], -1));
}

List<int> twoSum2(List<int> numbers, int target) {
  final map = {};

  for (int i = 0; i < numbers.length; i++) {
    map[numbers[i]] = i;
  }

  for (int i = 0; i < numbers.length; i++) {
    final i2 = map[target - numbers[i]];

    if (i2 != null && i != i2) {
      return [i + 1, i2 + 1];
    }
  }

  throw Exception("Not found!");
}
