void main() {
  print(findDuplicate([1,3,4,2,2]));
  print(findDuplicate([3,1,3,4,2]));
  print(findDuplicate([3,3,3,3,3]));
}

/// todo https://leetcode.com/problems/find-the-duplicate-number/solutions/4063075/the-tortoise-and-hare-algorithm-efficient-duplicate-number-detection/
int findDuplicate(List<int> nums) {
  int tortoise = nums[0];
  int hare = nums[0];

  do {
    tortoise = nums[tortoise];
    hare = nums[nums[hare]];
  } while (tortoise != hare);

  tortoise = nums[0];
  while (tortoise != hare) {
    tortoise = nums[tortoise];
    hare = nums[hare];
  }

  return tortoise;
}