void main() {
  print(isToeplitzMatrix([
    [1, 2, 3, 4],
    [5, 1, 2, 3],
    [9, 5, 1, 2],
  ]));
  print(isToeplitzMatrix([
    [1, 2],
    [2, 2]
  ]));
}

bool isToeplitzMatrix(List<List<int>> matrix) {
  if (matrix.length <= 1 || matrix.first.length <= 1) {
    return true;
  }

  for (int y = 1; y < matrix.length; y++) {
    for (int x = 1; x < matrix[y].length; x++) {
      if (matrix[y - 1][x - 1] != matrix[y][x]) {
        return false;
      }
    }
  }
  return true;
}
