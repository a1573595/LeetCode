void main() {
  print(isAnagram("anagram", "nagaram"));
  print(isAnagram("rat", "car"));
  print("");
  print(isAnagramV2("anagram", "nagaram"));
  print(isAnagramV2("rat", "car"));
}

bool isAnagram(String s, String t) {
  final map = <String, int>{};
  final map2 = <String, int>{};

  for (int i = 0; i < s.length; i++) {
    map[s[i]] = (map[s[i]] ?? 0) + 1;
  }

  for (int i = 0; i < t.length; i++) {
    map2[t[i]] = (map2[t[i]] ?? 0) + 1;
  }

  var isSame = true;

  if (map.length != map2.length) {
    isSame = false;
  }

  map.forEach((key, value) {
    if (map2[key] != value) {
      isSame = false;
    }
  });

  return isSame;
}

bool isAnagramV2(String s, String t) {
  final array = List.generate(26, (index) => 0);

  for (var i = 0; i < s.length; i++) {
    array[s[i].codeUnitAt(0) - 'a'.codeUnitAt(0)] += 1;
  }

  for (var i = 0; i < t.length; i++) {
    array[t[i].codeUnitAt(0) - 'a'.codeUnitAt(0)] -= 1;
  }

  return !array.any((e) => e != 0);
}
