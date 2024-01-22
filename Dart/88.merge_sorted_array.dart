void main() {
  merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3);
  merge(
      [
        1,
      ],
      1,
      [],
      0);
  merge([0], 0, [1], 1);
}

void merge(List<int> nums1, int m, List<int> nums2, int n) {
  final list = <int>[];

  for (int i = 0; i < m; i++) {
    list.add(nums1[i]);
  }

  for (int i = 0; i < n && i < nums1.length - m; i++) {
    list.add(nums2[i]);
  }

  list.sort();
  nums1.replaceRange(0, list.length, list);
}
