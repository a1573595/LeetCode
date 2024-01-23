void main() {
  print(longestCommonPrefix(["flower", "flow", "flight"]));
  print(longestCommonPrefix(["dog", "racecar", "car"]));
}

String longestCommonPrefix(List<String> strs) {
  var str = '';
  var index = 0;

  while (true) {
    final c = strs
        .map((e) => e.length > index ? e[index] : null)
        .reduce((a, b) => a == b && a != null ? a : null);

    if (c != null) {
      str = str + c;
      index++;
    } else {
      break;
    }
  }

  return str;
}
