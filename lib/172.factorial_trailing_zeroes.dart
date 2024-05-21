void main() {
  print(trailingZeroes(3));
  print(trailingZeroes(5));
  print(trailingZeroes(0));
  print(trailingZeroes(10));
  print(trailingZeroes(11));
  print(trailingZeroes(12));
  print(trailingZeroes(13));
  print(trailingZeroes(14));
  print(trailingZeroes(15));
  print(trailingZeroes(25));
}

/// todo
int trailingZeroes(int n) {
  var result = 0;
  var currentFactor = 5;

  while (currentFactor <= n) {
    result += n ~/ currentFactor;
    currentFactor *= 5;
  }

  return result;
}
