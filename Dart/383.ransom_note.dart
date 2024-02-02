void main() {
  print(canConstruct("a", "b"));
  print(canConstruct("aa", "ab"));
  print(canConstruct("aa", "aab"));
  print(canConstruct(
      "bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
}

bool canConstruct(String ransomNote, String magazine) {
  final map = <String, int>{};

  for (int i = 0; i < ransomNote.length; i++) {
    map[ransomNote[i]] = (map[ransomNote[i]] ?? 0) + 1;
  }

  for (int i = 0; i < magazine.length; i++) {
    final value = map[magazine[i]];
    if (value != null && value > 0) {
      map[magazine[i]] = value - 1;
    }
  }

  return !map.values.any((element) => element > 0);
}
