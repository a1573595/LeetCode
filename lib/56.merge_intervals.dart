import 'dart:math';

void main() {
  print(merge([
    [1, 3],
    [2, 6],
    [8, 10],
    [15, 18],
  ]));
  print(merge([
    [1, 4],
    [4, 5],
  ]));
  print(merge([
    [1, 4],
    [0, 4],
  ]));
  print(merge([
    [1, 4],
    [0, 1],
  ]));

  /// 0,0, 1,4
  print(merge([
    [1, 4],
    [0, 0],
  ]));

  /// 1, 0
  print(merge([
    [2, 3],
    [4, 5],
    [6, 7],
    [8, 9],
    [1, 10],
  ]));
}

List<List<int>> merge(List<List<int>> intervals) {
  intervals.sort((a, b) => a[0].compareTo(b[0]));

  final result = <List<int>>[];

  List<int>? lastList = null;
  intervals.forEach((list) {
    if (lastList == null) {
      lastList = list;
    } else if (lastList![1] >= list[0] && lastList![0] <= list[1]) {
      lastList![0] = min(lastList![0], list[0]);
      lastList![1] = max(lastList![1], list[1]);
    } else {
      result.add(lastList!);
      lastList = list;
    }
  });

  if (lastList != null) {
    result.add(lastList!);
  }

  return result;
}
