void main() {
  print(missingNumber([3, 0, 1]));
  print(missingNumber([0, 1]));
  print(missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]));
}

int missingNumber(List<int> nums) {
  var count = 0;

  for (var i = 0; i < nums.length; i++) {
    count -= nums[i];
    count += i+1;
  }

  return count;
}
