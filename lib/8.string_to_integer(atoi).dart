void main() {
  print(myAtoi("")); // 0
  print(myAtoi("42")); // 42
  print(myAtoi("   -42")); // -42
  print(myAtoi("4193 with words")); // 4193
  print(myAtoi("words and 987")); // 0
  print(myAtoi("0032")); // 32
  print(myAtoi("-91283472332")); // -2147483648
  print(myAtoi("3.14159")); // 3
  print(myAtoi("+1")); // 1
  print(myAtoi("+-12")); // 0
  print(myAtoi("00000-42a1234")); // 0
  print(myAtoi("   +0 123")); // 0
  print(myAtoi("9223372036854775808")); // 2147483647
  print(myAtoi("-2147483648")); // -2147483648
  print(myAtoi("-2147483647")); // -2147483647
  print(myAtoi("2147483647")); // 2147483647
  print(myAtoi("2147483646")); // 2147483646
  print(myAtoi(" -1010023630o4")); // -1010023630
}

const MAX = 2147483647;
const MIN = -2147483648;

int myAtoi(String s) {
  final str = s.trimLeft();

  if (str.isEmpty) {
    return 0;
  }

  final isPositive = str[0] == '+';
  final isNegative = str[0] == '-';

  var result = 0;

  for (var i = isPositive || isNegative ? 1 : 0; i < str.length; i++) {
    final code = str[i].codeUnitAt(0) - 48;

    if (code >= 0 && code <= 9) {
      if (isNegative && -result <= (MIN + code) / 10) {
        return MIN;
      } else if (!isNegative && result > (MAX - code) / 10) {
        return MAX;
      } else {
        result *= 10;
        result += code;
      }
    } else {
      break;
    }
  }

  return isNegative ? -result : result;
}
