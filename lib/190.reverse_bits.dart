void main() {
  print(reverseBits(18432));
  print(reverseBits(43261596));
}

int reverseBits(int n) {
  var result = 0;
  for (var i = 0; i < 32; i++) {
    result <<= 1;
    result += (n >> i) & 1;
  }
  return result;
}

