
// (This is a slightly harder version of the fix34 problem.) 
// Return an array that contains exactly the same numbers as the given array, 
// but rearranged so that every 4 is immediately followed by a 5. 
// Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, 
// and every 4 has a number after it that is not a 4. In this version, 
// 5's may appear anywhere in the original array. 

// fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9}
// fix45({1, 4, 1, 5}) → {1, 4, 5, 1}
// fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}

public int[] fix45(int[] nums) {
  
int[] n5=new int[nums.length/2];
int k=0;
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]==5)
    {
      n5[k]=i;
      k++;
    }
      
  }
  k=0;
  for(int i=nums.length-1;i>-1;i--)
  {
   if(nums[i]==4)
   {
     nums[n5[k]]=nums[i+1];
     nums[i+1]=5;
     k++;
   }
  }
  return nums;
}
