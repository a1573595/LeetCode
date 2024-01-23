void main() {
  print(lengthOfLastWord("Hello World"));
  print(lengthOfLastWord("   fly me   to   the moon  "));
  print(lengthOfLastWord("luffy is still joyboy"));
}

int lengthOfLastWord(String s) {
  var count = 0;

  for (int i = s.length - 1; i >= 0; i--) {
    if (count != 0 && s[i] == ' ') {
      break;
    } else if (s[i] != ' ') {
      count++;
    }
  }

  return count;
}
