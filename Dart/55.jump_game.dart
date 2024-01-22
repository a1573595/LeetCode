import 'dart:math';

void main() {
  print(canJump([2, 3, 1, 1, 4])); // true
  print(canJump([3, 2, 1, 0, 4])); // false
  print(canJump([2, 0])); // true
  print(canJump([2, 5, 0, 0])); // true
  print(canJump([0, 1])); // false
}

/// Time Limit Exceeded
// bool canJump(List<int> nums) {
//   var index = 0;

//   while (index < nums.length - 1) {
//     if (nums[index] == 0) {
//       break;
//     }

//     if (index + nums[index] < nums.length - 1) {
//       var max = 0;
//       var index2 = 0;

//       for (int i = index + nums[index]; i > index; i--) {
//         if (nums[i] > max) {
//           max = nums[i];
//           index2 = i;
//         }
//       }

//       index += index2;
//     } else {
//       index += nums[index];
//     }
//   }

//   return index >= nums.length - 1;
// }

bool canJump(List<int> nums) {
  var reachable = 0;

  for (int i = 0; i < nums.length; i++) {
    if (i > reachable) {
      return false;
    }

    reachable = max(reachable, i + nums[i]);
  }

  return true;
}
