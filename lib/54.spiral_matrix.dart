void main() {
  print(spiralOrder([
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ]).join(','));
  print(spiralOrder([
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
  ]).join(','));
}

List<int> spiralOrder(List<List<int>> matrix) {
  final list = <int>[];

  var top = 0;
  var bottom = matrix.length - 1;
  var left = 0;
  var right = matrix.first.length - 1;

  while (true) {
    for (var i = left; i <= right; i++) {
      list.add(matrix[top][i]);
    }
    top++;
    if (left > right || top > bottom) break;

    for (var i = top; i <= bottom; i++) {
      list.add(matrix[i][right]);
    }
    right--;
    if (left > right || top > bottom) break;

    for (var i = right; i >= left; i--) {
      list.add(matrix[bottom][i]);
    }
    bottom--;
    if (left > right || top > bottom) break;

    for (var i = bottom; i >= top; i--) {
      list.add(matrix[i][left]);
    }
    left++;
    if (left > right || top > bottom) break;
  }

  return list;
}

