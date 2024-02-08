import 'dart:math';

void main() {
  print(insert([
    [1, 3],
    [6, 9]
  ], [
    2,
    5
  ]));
  print(insert([
    [1, 2],
    [3, 5],
    [6, 7],
    [8, 10],
    [12, 16]
  ], [
    4,
    8
  ]));
}

List<List<int>> insert(List<List<int>> intervals, List<int> newInterval) {
  final list = <List<int>>[];

  var index = 0;

  var start = newInterval.first;
  var end = newInterval.last;

  while (index < intervals.length && intervals[index].last < start) {
    list.add(intervals[index++]);
  }

  while (index < intervals.length && intervals[index].first <= end) {
    start = min(start, intervals[index].first);
    end = max(end, intervals[index++].last);
  }

  list.add([start, end]);

  while (index < intervals.length) {
    list.add(intervals[index++]);
  }

  return list;
}
