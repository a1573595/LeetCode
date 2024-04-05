import 'dart:math';

void main() {
  print(maxProfit([1,2,3,0,2]));
  print(maxProfit([1]));
}

/// todo
int maxProfit(List<int> prices) {
  int sold = -prices.first;
  int held = -prices.first;
  int rest = 0;

  for(int i = 1; i < prices.length; i ++) {
    int prvSold = sold;
    sold = held + prices[i];
    // rest or buy p[i]
    held = max(held, rest - prices[i]);
    // rest again or rest once and accept the prv sold value
    rest = max(rest, prvSold);
  }

  return max(rest, sold);
}
