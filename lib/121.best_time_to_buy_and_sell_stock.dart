import 'dart:math';

void main() {
  print(maxProfit([7, 1, 5, 3, 6, 4]));
  print(maxProfit([7, 6, 4, 3, 1]));
  print(maxProfit([1, 2]));
}

int maxProfit(List<int> prices) {
  var maxPrice = 0;
  var minValue = prices.first;

  for (int i = 1; i < prices.length; i++) {
    maxPrice = max(maxPrice, prices[i] - minValue);
    minValue = min(minValue, prices[i]);
  }

  return maxPrice;
}
