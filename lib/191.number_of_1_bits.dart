void main() {
  print(hammingWeight(3));
  print(hammingWeight(11));
  print(hammingWeight(128));
  print(hammingWeight(2147483645));
}

int hammingWeight(int n) {
  var result = 0;

  while (n > 0) {
    if (n & 1 > 0) {
      result++;
    }

    n >>= 1;
  }

  return result;
}
