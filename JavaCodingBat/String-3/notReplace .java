
// Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
//  The word "is" should not be immediately preceeded or followed by a letter --
//   so for example the "is" in "this" does not count. 

// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"

public String notReplace(String str) {
    int length = str.length();
  if(length<2)
  return str;
  else if(length ==2)
  {
  if(str.equals("is"))
  return str.concat(" not");
  else
  return str;
  }
  else{
  str=" "+str+" ";
  String newstr = str.substring(1,2);
for(int i=2;i<length+1;i++)
{
 if(str.charAt(i) == 's' && str.charAt(i-1) == 'i' 
 && !Character.isLetter(str.charAt(i-2))
 && !Character.isLetter(str.charAt(i+1)))
 {newstr = newstr+"s not";}
 else
 {newstr = newstr+str.substring(i,i+1);}
}
  return newstr;
  }
}