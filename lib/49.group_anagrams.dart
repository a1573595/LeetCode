void main() {
  print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]));
  print(groupAnagrams([""]));
  print(groupAnagrams(["a"]));
}

List<List<String>> groupAnagrams(List<String> strs) {
  Map<String, List<String>> map = {};

  strs.forEach((str) {
    final partStr = str.split('')..sort();
    final key = partStr.join();

    if (map.containsKey(key)) {
      map[key]?.add(str);
    } else {
      map[key] = [str];
    }
  });

  return map.values.toList();
}
