void main() {
  print(mySqrt(4));
  print(mySqrt(8));
}

int mySqrt(int x) {
  if (x < 2) return x;

  var left = 2;
  var right = x ~/ 2;

  while (left <= right) {
    final middle = (left + (right - left) / 2).toInt();
    final squaredMiddle = middle * middle;

    if (squaredMiddle > x) {
      right = middle - 1;
    } else if (squaredMiddle < x) {
      left = middle + 1;
    } else {
      return middle;
    }
  }

  return right;
}
