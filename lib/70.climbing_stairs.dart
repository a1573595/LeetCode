void main() {
  print(climbStairs(2));
  print(climbStairs(3));
  print(climbStairs(4));
  print(climbStairs(5));
}

int climbStairs(int n) {
  if (n == 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  } else if (n == 2) {
    return 2;
  }

  var theOneBeforeLast = 1;
  var pervious = 2;

  var step = 3;
  for (int i = 3; i < n; i++) {
    theOneBeforeLast = pervious;
    pervious = step;

    step = theOneBeforeLast + pervious;
  }

  return step;
}
