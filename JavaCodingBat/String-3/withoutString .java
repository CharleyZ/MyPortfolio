
// Given two strings, base and remove, return a version of the base string 
// where all instances of the remove string have been removed (not case sensitive).
//  You may assume that the remove string is length 1 or more. 
//  Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". 

// withoutString("Hello there", "llo") → "He there"
// withoutString("Hello there", "e") → "Hllo thr"
// withoutString("Hello there", "x") → "Hello there"


public String withoutString(String base, String remove) {
  int b_len = base.length();
  int r_len = remove.length();
  base=base+"               ";
  String str="";
  int i=0;
  while(Character.isLetter(base.charAt(i)) || Character.isLetter(base.charAt(i+1)) ||
  Character.isLetter(base.charAt(i+2)))
  {
  
   if(base.substring(i,i+r_len).toLowerCase().equals(remove.toLowerCase()))
   { i=i+r_len;}
   else
   {str=str+base.substring(i,i+1);
   i++;}
  }
  return str;
}