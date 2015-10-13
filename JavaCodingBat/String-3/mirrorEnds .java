
// Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. 
// In other words, zero or more characters at the very begining of the given string, 
// and at the very end of the string in reverse order (possibly overlapping). 

// mirrorEnds("abXYZba") → "ab"
// mirrorEnds("abca") → "a"
// mirrorEnds("aba") → "aba"

public String mirrorEnds(String string) {
   String str = "";
  int length = string.length();
  for(int i=0;i<length;i++)
  {
   if(string.charAt(i) == string.charAt(length-1-i))
   {str=str.concat(string.substring(i,i+1));}
   else
   {return str;}
  }
  return str;
}
