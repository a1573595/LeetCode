void main() {
  print(isIsomorphic("egg", "add"));
  print(isIsomorphic("foo", "bar"));
  print(isIsomorphic("paper", "title"));
  print(isIsomorphic("badc", "baba"));
}

bool isIsomorphic(String s, String t) {
  final map = <String, String>{};
  final map2 = <String, String>{};

  for (var i = 0; i < s.length; i++) {
    final value = map[s[i]];
    final value2 = map2[t[i]];

    if (value == null) {
      map[s[i]] = t[i];
    } else if (value != t[i]) {
      return false;
    }

    if (value2 == null) {
      map2[t[i]] = s[i];
    } else if (value2 != s[i]) {
      return false;
    }
  }

  return true;
}
