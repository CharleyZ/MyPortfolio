
// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to 
// the number of appearances of "not" anywhere in the string (case sensitive). 

// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true


public boolean equalIsNot(String str) {
  int index_is = 0;
  int index_not = 0;
  int length = str.length();
  for(int i=0;i<length-2;i++)
  {
   if(str.charAt(i) == 'n'
      && str.charAt(i+1) == 'o'
        && str.charAt(i+2) == 't')
        {index_not++;}
  }
    for(int i=0;i<length-1;i++)
  {
   if(str.charAt(i) == 'i'
        && str.charAt(i+1) == 's')
        {index_is++;}
  }
  if(index_not == index_is)
  return true;
  else
  return false;
}