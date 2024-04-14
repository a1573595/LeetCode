void main() {
  print(isItAMultipleOfEleven("112233"));
  print(isItAMultipleOfEleven("30800"));
  print(isItAMultipleOfEleven("2937"));
  print(isItAMultipleOfEleven("323455693"));
  print(isItAMultipleOfEleven("5038297"));
  print(isItAMultipleOfEleven("112234"));
  print(isItAMultipleOfEleven("0"));
  print(isItAMultipleOfEleven(""));
}

/// todo 若一個數是11的倍數，那它的奇數項減偶數項也會是11的倍數。
bool isItAMultipleOfEleven(String num) {
  if (num.isEmpty) {
    return false;
  }

  var odd = 0;
  var even = 0;

  var isOdd = true;
  for (var i = 0; i < num.length; i++) {
    final value = int.parse(num[i]);

    if (isOdd) {
      odd += value;
    } else {
      even += value;
    }

    isOdd = !isOdd;
  }

  return 0 == odd - even;
}
