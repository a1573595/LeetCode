void main() {
  print(countPrimes(10));
  print(countPrimes(1));
  print(countPrimes(0));
  print(countPrimes(2));
  print(countPrimes(3));
  print(countPrimes(10000));
}

/// Time Limit Exceeded
// int countPrimes(int n) {
//   if (n < 3) {
//     return 0;
//   }

//   var isPrime = true;
//   List<int> primes = [];

//   for (var i = 3; i < n; i += 2) {
//     for (int prime in primes) {
//       if (i % prime == 0) {
//         isPrime = false;
//         break;
//       }
//     }

//     if (isPrime) {
//       primes.add(i);
//     } else {
//       isPrime = true;
//     }
//   }

//   return primes.length + 1;
// }

/// todo
int countPrimes(int n) {
  if (n < 3) {
    return 0;
  }

  List<bool> noPrimes = List.generate(n, (index) => false);
  var count = n ~/ 2;

  for (var i = 3; i < n; i += 2) {
    if (noPrimes[i]) {
      continue;
    }

    var j = i * 3;
    while (j < n) {
      if (!noPrimes[j]) {
        noPrimes[j] = true;
        count--;
      }
      j += i * 2;
    }
  }

  return count;
}
