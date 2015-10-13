
// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same. 

// maxBlock("hoopla") → 2
// maxBlock("abbCCCddBBBxx") → 3
// maxBlock("") → 0

public int maxBlock(String str) {
  int length = str.length();
  int max_index=1;
  int index = 1;
  if(length<2)
  return length;
  else
  {
   for(int i=0;i<length-1;i++)
   {
   if(str.charAt(i+1) == str.charAt(i))
   {
   index++;
   }
   else
   {index=1;}
   if(index>max_index)
   max_index=index;
   }  
  }
  return max_index;
}
