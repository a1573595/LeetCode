void main() {
  print(maxProfit([7, 1, 5, 3, 6, 4]));
  print(maxProfit([1, 2, 3, 4, 5]));
  print(maxProfit([7, 6, 4, 3, 1]));
  print(maxProfit([1, 2]));
}

int maxProfit(List<int> prices) {
  var last = prices.first;
  var price = 0;

  for (var i = 1; i < prices.length; i++) {
    if (prices[i] > last) {
      price += prices[i] - last;
      last = prices[i];
    } else {
      last = prices[i];
    }
  }

  return price;
}
