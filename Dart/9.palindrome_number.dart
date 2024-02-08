void main() {
  print(isPalindrome(121));
  print(isPalindrome(-121));
}

bool isPalindrome(int x) {
  final str = x.toString();
  final reversedStr = str.split("").reversed.join();

  return str == reversedStr;
}
