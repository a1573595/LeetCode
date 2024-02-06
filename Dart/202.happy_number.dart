void main() {
  print(isHappy(19));
  print(isHappy(2));
}

bool isHappy(int n) {
  final set = <int>{};

  while (n > 1) {
    if (!set.add(n)) {
      break;
    }

    final parStr = n.toString().split("");

    n = 0;
    for (int i = 0; i < parStr.length; i++) {
      final value = int.parse(parStr[i]);
      n += value * value;
    }
  }

  return n == 1;
}
