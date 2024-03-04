import 'dart:math';

void main() {
  print(findMinArrowShots([
    [10, 16],
    [2, 8],
    [1, 6],
    [7, 12],
  ]));
  print(findMinArrowShots([
    [1, 2],
    [3, 4],
    [5, 6],
    [7, 8]
  ]));
  print(findMinArrowShots([
    [1, 2],
    [2, 3],
    [3, 4],
    [4, 5]
  ]));
}

int findMinArrowShots(List<List<int>> points) {
  if (points.isEmpty) {
    return 0;
  }

  points.sort((a, b) => a.first.compareTo(b.first));

  var count = 1;

  var minValue = points.first.first;
  var maxValue = points.first[1];

  points.forEach((element) {
    if (element.first >= minValue && element.first <= maxValue ||
        element[1] <= maxValue && element[1] >= minValue) {
      minValue = max(minValue, element.first);
      maxValue = min(maxValue, element[1]);
    } else {
      count++;
      minValue = element.first;
      maxValue = element[1];
    }
  });

  return count;
}
