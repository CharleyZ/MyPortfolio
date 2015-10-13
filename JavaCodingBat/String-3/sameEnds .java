
// Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
// For example, sameEnds("abXab") is "ab". 

// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"

public String sameEnds(String string) {
  int length = string.length();
  for(int i=length/2;i>-1;i--)
  { 
   String head = string.substring(0,i);
   if(string.substring(length-i,length).equals(head))
   return head;
  }
  return "";
}
