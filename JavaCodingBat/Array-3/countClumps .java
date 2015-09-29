
// Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
// Return the number of clumps in the given array. 

// countClumps({1, 2, 2, 3, 4, 4}) → 2
// countClumps({1, 1, 2, 1, 1}) → 2
// countClumps({1, 1, 1, 1, 1}) → 1

public int countClumps(int[] nums) {
  int index=0;
  if(nums.length<2)
  {
  return index;
  }
  else if(nums.length==2)
  {
  if(nums[0] == nums[1])
  {index++;}
  return index;
  }
  else{
  int first;
  int last;
  for(int i=0;i<nums.length-1;i++)
  {
  first=nums[i];
  last=nums[i+1];
  if(first==last)
  {index++;
    if(i<nums.length-2 && first == nums[i+2])
  {index--;  }
  }
  }

  return index;
  }
}