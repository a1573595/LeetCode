void main() {
  print(majorityElement([3, 2, 3]));
  print(majorityElement([2, 2, 1, 1, 1, 2, 2]));
}

int majorityElement(List<int> nums) {
  final Map<int, int> map = {};

  nums.forEach((element) {
    final value = map[element] ?? 0;
    map[element] = value + 1;
  });

  var maxKey = 0;
  var maxValue = 0;

  map.forEach((key, value) {
    if (value > maxValue) {
      maxKey = key;
      maxValue = value;
    }
  });

  return maxKey;
}
