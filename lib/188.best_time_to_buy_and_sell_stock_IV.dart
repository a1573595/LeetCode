import 'dart:math';

void main() {
  print(maxProfit(2, [2, 4, 1]));
  print(maxProfit(2, [3, 2, 6, 5, 0, 3]));
}

int maxProfit(int k, List<int> prices) {
  if (prices.isEmpty) {
    return 0;
  }

  final buyList = List.generate(k, (index) => -prices.first);
  final sellList = List.generate(k, (index) => 0);

  for (int i = 0; i < prices.length; i++) {
    for (int j = 0; j < k; j++) {
      buyList[j] = max(buyList[j], j == 0 ? -prices[i] : sellList[j - 1] - prices[i]);
      sellList[j] = max(sellList[j], buyList[j] + prices[i]);
    }
  }

  return sellList.last;
}
