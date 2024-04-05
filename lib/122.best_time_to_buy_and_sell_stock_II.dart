void main() {
  print(maxProfit([7, 1, 5, 3, 6, 4]));
  print(maxProfit([1, 2, 3, 4, 5]));
  print(maxProfit([7, 6, 4, 3, 1]));
  print(maxProfit([1, 2]));
}

int maxProfit(List<int> prices) {
  var price = 0;
  var lastValue = prices.first;

  for (int i = 1; i < prices.length; i++) {
    if (prices[i] > lastValue) {
      price += prices[i] - lastValue;
    }

    lastValue = prices[i];
  }

  return price;
}
