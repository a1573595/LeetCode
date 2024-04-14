void main() {
  print(countAndSay(8));
  print(countAndSay(10));
  print(countAndSay(15));
}

String countAndSay(int n) {
  String str;
  switch (n) {
    case 1:
      str = "1";
    case 2:
      str = "11";
    case 3:
      str = "21";
    case 4:
      str = "1211";
    default:
      str = "111221";
  }

  var count = 1;
  for (var i = 6; i <= n; i++) {
    final tempStr = str;
    str = "";

    for (var j = 0; j < tempStr.length; j++) {
      if (j < tempStr.length - 1 && tempStr[j] == tempStr[j + 1]) {
        count++;
      } else {
        str += "$count${tempStr[j]}";
        count = 1;
      }
    }
  }

  return str;
}
