import 'dart:math';

void main() {
  print(maxProfit([7, 1, 5, 3, 6, 4]));
  print(maxProfit([7, 6, 4, 3, 1]));
  print(maxProfit([1, 2]));
}

/// Time Limit Exceeded
// int maxProfit(List<int> prices) {
//   var max = 0;

//   for (int i = 0; i < prices.length; i++) {
//     for (int j = i + 1; j < prices.length; j++) {
//       if (prices[j] < prices[i]) {
//         break;
//       } else {
//         final value = prices[j] - prices[i];

//         if (value > max) {
//           max = value;
//         }
//       }
//     }
//   }

//   return max;
// }

int maxProfit(List<int> prices) {
  var maxPrice = 0;
  var minValue = prices.first;

  for (int i = 1; i < prices.length; i++) {
    maxPrice = max(maxPrice, prices[i] - minValue);
    minValue = min(minValue, prices[i]);
  }

  return maxPrice;
}
