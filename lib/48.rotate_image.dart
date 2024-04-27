void main() {
  final list1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ];
  rotate(list1);
  list1.forEach((element) {
    print(element);
  });
  print("");
  print("");

  final list2 = [
    [5, 1, 9, 11],
    [2, 4, 8, 10],
    [13, 3, 6, 7],
    [15, 14, 12, 16],
  ];
  rotate(list2);
  list2.forEach((element) {
    print(element);
  });
  print("");
  print("");

  final list3 = [
    [1],
  ];
  rotate(list3);
  list3.forEach((element) {
    print(element);
  });
  print("");
  print("");

  final list4 = [
    [1, 2],
    [3, 4],
  ];
  rotate(list4);
  list4.forEach((element) {
    print(element);
  });
  print("");
  print("");
}

/// todo 矩陣由左下向右上轉向後再將陣列反向
void rotate(List<List<int>> matrix) {
  final size = matrix.length;
  final subSize = size ~/ 2;

  for (var i = 0; i < size; i++) {
    for (var j = i; j < size; j++) {
      final temp = matrix[i][j];
      matrix[i][j] = matrix[j][i];
      matrix[j][i] = temp;
    }
  }

  for (var i = 0; i < size; i++) {
    for (var j = 0; j < subSize; j++) {
      final temp = matrix[i][j];
      matrix[i][j] = matrix[i][size - j - 1];
      matrix[i][size - j - 1] = temp;
    }
  }
}

/// 四個點互換
void rotateV2(List<List<int>> matrix) {
  final size = matrix.length;

  for (var i = 0; i < size / 2; i++) {
    for (var j = i; j < size - i - 1; j++) {
      final temp = matrix[i][j];
      matrix[i][j] = matrix[size - 1 - j][i];
      matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
      matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];
      matrix[j][size - 1 - i] = temp;
    }
  }
}
