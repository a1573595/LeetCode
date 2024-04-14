void main() {
  print(romanToInt("III"));
  print(romanToInt("IV"));
  print(romanToInt("IX"));
  print(romanToInt("LVIII"));
  print(romanToInt("MCMXCIV"));
}

// Symbol       Value
// I             1
// IV            4
// V             5
// IX            9
// X             10
// XL            40
// L             50
// XC            90
// C             100
// CD            400
// D             500
// CM            900
// M             1000
int romanToInt(String s) {
  var count = 0;
  var index = 0;

  while (index < s.length) {
    if (index < s.length - 1) {
      final value = twoChar("${s[index]}${s[index + 1]}");

      count += value;

      if (value != 0) {
        index += 2;
        continue;
      }
    }

    final value = oneChar("${s[index]}");

    count += value;
    index++;
  }

  return count;
}

int twoChar(String str) {
  switch (str) {
    case 'IV':
      return 4;
    case 'IX':
      return 9;
    case 'XL':
      return 40;
    case 'XC':
      return 90;
    case 'CD':
      return 400;
    case 'CM':
      return 900;
    default:
      return 0;
  }
}

int oneChar(String str) {
  switch (str) {
    case 'I':
      return 1;
    case 'V':
      return 5;
    case 'X':
      return 10;
    case 'L':
      return 50;
    case 'C':
      return 100;
    case 'D':
      return 500;
    case 'M':
      return 1000;
    default:
      return 0;
  }
}
