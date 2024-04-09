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
  for (int y = 0; y < matrix.length - 1; y++) {
    for (int x = 0; x < matrix.first.length - 1; x++) {
      if (matrix[y][x] != matrix[y + 1][x + 1]) {
        return false;
      }
    }
  }

  return true;
}
