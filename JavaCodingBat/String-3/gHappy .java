// We'll say that a lowercase 'g' in a string is "happy" if there is 
// another 'g' immediately to its left or right. Return true if all the g's in the given string are happy. 

// gHappy("xxggxx") → true
// gHappy("xxgxx") → false
// gHappy("xxggyygxx") → false

public boolean gHappy(String str) {
  int length = str.length();
  if(length ==1)
  return false;
  else if(length ==0)
  return true;
  else
  {
  int index = 0;
  if(str.charAt(0) == 'g' && str.charAt(1) != 'g')
  {index++;}
  if(str.charAt(length-1) == 'g' && str.charAt(length-2) != 'g')
  {index++;}
  for(int i=1;i<length-1;i++)
  {
   if(str.charAt(i) == 'g' 
    && (str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g'))
    {index++;}
  }
  if(index == 0)
  return true;
  else
  return false;
  }
}
