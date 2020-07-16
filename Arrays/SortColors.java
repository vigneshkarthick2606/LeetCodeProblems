Sort Colors(Dutch National Flag alg)

    public void sortColors(int[] nums) {
        
      int low = 0,mid = 0, high;
      high = nums.length -1;
      while(mid<=high){  // impt point to remember
          if(nums[mid] == 0){
              swap(low,mid, nums);
              low++;
              mid++;
          }else if(nums[mid] == 1){
              mid++;
          }else{
              swap(mid,high, nums);
              high--;
          }  
      }
      
    }
    
    public void swap(int l, int r, int[] nums){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }