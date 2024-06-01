void main() {
  final list1 = [1, 2, 3, 0, 0, 0];
  merge(list1, 3, [2, 5, 6], 3);
  print(list1.join(", "));
  print("");

  final list2 = [1];
  merge(list2, 1, [], 0);
  print(list2.join(", "));
  print("");

  final list3 = [0];
  merge(list3, 0, [1], 1);
  print(list3.join(", "));
  print("");
}

void merge(List<int> nums1, int m, List<int> nums2, int n) {
  var index = n + m - 1;
  var left = m - 1;
  var right = n - 1;

  while (index >= 0) {
    final int value;

    if (right < 0 || left >= 0 && nums1[left] >= nums2[right]) {
      value = nums1[left--];
    } else {
      value = nums2[right--];
    }

    nums1[index] = value;
    index--;
  }
}
