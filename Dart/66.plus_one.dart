void main() {
  print(plusOne([1, 2, 3]));
  print(plusOne([4, 3, 2, 1]));
  print(plusOne([9]));
  print(plusOne([8, 9, 9, 9]));
}

List<int> plusOne(List<int> digits) {
  bool count = true;

  for (var i = digits.length - 1; i >= 0; i--) {
    if (digits[i] == 9 && count) {
      digits[i] = 0;
      count = true;
    } else {
      digits[i]++;
      count = false;
      break;
    }
  }

  if (count) {
    digits.insert(0, 1);
  }

  return digits;
}
