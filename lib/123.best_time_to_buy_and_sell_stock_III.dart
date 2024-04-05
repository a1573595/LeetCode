import 'dart:math';

void main() {
  print(maxProfit([3, 3, 5, 0, 0, 3, 1, 4]));
  print(maxProfit([7, 1, 5, 3, 6, 4]));
  print(maxProfit([1, 2, 3, 4, 5]));
  print(maxProfit([7, 6, 4, 3, 1]));
  print(maxProfit([1, 2]));
}

/// todo
int maxProfit(List<int> prices) {
  if (prices.isEmpty) {
    return 0;
  }

  var buy1 = -prices.first;
  var buy2 = -prices.first;
  var sell1 = 0;
  var sell2 = 0;

  for (int i = 0; i < prices.length; i++) {
    buy1 = max(buy1, -prices[i]);
    sell1 = max(sell1, buy1 + prices[i]);
    buy2 = max(buy2, sell1 - prices[i]);
    sell2 = max(sell2, buy2 + prices[i]);
  }

  return sell2;
}
