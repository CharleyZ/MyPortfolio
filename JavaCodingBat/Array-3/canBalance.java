
// Given a non-empty array, return true if there is a place to split the array 
// so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. 

// canBalance({1, 1, 1, 2, 1}) → true
// canBalance({2, 1, 1, 2, 1}) → false
// canBalance({10, 10}) → true

public boolean canBalance(int[] nums) {
 for(int i=1;i<nums.length;i++)
		  {
		  int left=0;
		  int right=0;  
		  for(int j=0;j<i;j++)
		   {left=left+nums[j];}
		  for(int k=i;k<nums.length;k++)
		   {right=right+nums[k];}
		  
		  if(left == right)
		  {
			  return true;
			 
		  }
		  }
return false;

}