void main() {
  print(reverseWords("the sky is blue"));
  print(reverseWords("  hello world  "));
  print(reverseWords("a good   example"));
}

String reverseWords(String s) {
  final list = <String>[];

  var temp = "";
  for (int i = 0; i < s.length; i++) {
    if (temp.isEmpty && s[i] == " ") {
      continue;
    }

    if (s[i] == " ") {
      if (temp.isNotEmpty) {
        list.add(temp);
      }

      temp = "";
    } else {
      temp += s[i];
    }
  }

  if (temp.isNotEmpty && temp[0] != " ") {
    list.add(temp);
  }

  return list.reversed.join(" ");
}
