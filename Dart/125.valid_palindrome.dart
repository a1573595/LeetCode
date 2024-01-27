void main() {
  print(isPalindrome("A man, a plan, a canal: Panama"));
  print(isPalindrome("race a car"));
  print(isPalindrome("0P"));
}

final regex = RegExp(r'^[a-zA-Z0-9]+$');

bool isPalindrome(String s) {
  final list = <String>[];

  for (int i = 0; i < s.length; i++) {
    if (regex.hasMatch(s[i])) {
      list.add(s[i]);
    }
  }

  final str = list.join().toLowerCase();
  final str2 = list.reversed.join().toLowerCase();

  return str == str2;
}
