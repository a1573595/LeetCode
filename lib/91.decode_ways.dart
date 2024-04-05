void main() {
  print(numDecodings("12"));
  print(numDecodings("226"));
  print(numDecodings("06"));
}

/// todo
int numDecodings(String s) {
  final n = s.length;
  final dp = List.generate(n + 1, (index) => 0);
  dp[0] = 1;

  for (int i = 1; i <= n; i++) {
    final ch = int.parse(s[i-1]);
    if (ch == 0) dp[i] = 0;
    final preCh = i > 1 ? int.parse(s[i - 2]) : 0;
    if(ch != 0) dp[i] += dp[i-1];
    if(preCh != 0 && preCh <= 1 || preCh == 2 && ch <= 6) dp[i] += dp[i-2];
  }

  return dp[n];
}
