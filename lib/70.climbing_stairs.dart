void main() {
  print(climbStairs(2));
  print(climbStairs(3));
  print(climbStairs(4));
  print(climbStairs(5));
  print("");
  print("");
  print(climbStairsV2(2));
  print(climbStairsV2(3));
  print(climbStairsV2(4));
  print(climbStairsV2(5));
}

int climbStairs(int n) {
  if (n == 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  } else if (n == 2) {
    return 2;
  } else {
    return climbStairs(n - 1) + climbStairs(n - 2);
  }
}

int climbStairsV2(int n) {
  if (n == 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  } else if (n == 2) {
    return 2;
  } else {
    var perviousPervious = 1;
    var pervious = 2;

    var step;
    for (int i = 3; i <= n; i++) {
      step = perviousPervious + pervious;

      perviousPervious = pervious;
      pervious = step;
    }

    return step;
  }
}
