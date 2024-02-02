void main() {
  print(lengthOfLongestSubstring("abcabcbb"));
  print(lengthOfLongestSubstring("bbbbb"));
  print(lengthOfLongestSubstring("pwwkew"));
}

int lengthOfLongestSubstring(String s) {
  var set = <String>{};

  for (int i = 0; i < s.length; i++) {
    final currentSet = <String>{};
    currentSet.add(s[i]);

    for (int j = i + 1; j < s.length; j++) {
      if (!currentSet.add(s[j])) {
        break;
      }
    }

    if (set.length < currentSet.length) {
      set = currentSet;
    }
  }

  return set.length;
}
