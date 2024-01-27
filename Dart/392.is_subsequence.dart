void main() {
  print(isSubsequence("abc", "ahbgdc"));
  print(isSubsequence("axc", "ahbgdc"));
  print(isSubsequence("", "ahbgdc"));
  print(isSubsequence("b", "abc"));
}

bool isSubsequence(String s, String t) {
  if (s.isEmpty) {
    return true;
  }

  var index = 0;

  for (int i = 0; i < t.length; i++) {
    if (index >= s.length) {
      break;
    } else if (s[index] == t[i]) {
      index++;
    }
  }

  return index == s.length;
}
