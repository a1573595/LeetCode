  void main() {
    print(removeElement([3,2,2,3], 3));
    print(removeElement([0,1,2,2,3,0,4,2], 2));
  }
  
  int removeElement(List<int> nums, int val) {
    for(int i = nums.length - 1; i >=0 ; i--) {
      if(nums[i]== val) {
        nums.removeAt(i);
      }
    }

    return nums.length;
  }