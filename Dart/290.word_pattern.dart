void main() {
  print(wordPattern("abba", "dog cat cat dog"));
  print(wordPattern("abba", "dog cat cat fish"));
  print(wordPattern("aaaa", "dog cat cat dog"));
  print(wordPattern("aaa", "aa aa aa aa"));
}

bool wordPattern(String pattern, String s) {
  final map = <String, String>{};
  final map2 = <String, String>{};

  final str2 = s.split(" ");

  if (pattern.length != str2.length) {
    return false;
  }

  for (var i = 0; i < pattern.length; i++) {
    final value = map[pattern[i]];
    final value2 = map2[str2[i]];

    if (value == null) {
      map[pattern[i]] = str2[i];
    } else if (value != str2[i]) {
      return false;
    }

    if (value2 == null) {
      map2[str2[i]] = pattern[i];
    } else if (value2 != pattern[i]) {
      return false;
    }
  }

  return true;
}
