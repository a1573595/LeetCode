void main() {
  final list = [2, 0, 2, 1, 1, 0];
  sortColors(list);
  print(list.join());

  final list2 = [2, 0, 1];
  sortColors(list2);
  print(list2.join());

  final list3 = [1, 0];
  sortColors(list3);
  print(list3.join());
}

void sortColors(List<int> nums) {
  // nums.sort();

  var length = nums.length - 1;

  while (length > 0) {
    for (var i = 0; i < length; i++) {
      final left = nums[i];
      final right = nums[i+1];

      if(left > right) {
        nums[i] = right;
        nums[i+1] = left;
      }
    }

    length--;
  }
}
