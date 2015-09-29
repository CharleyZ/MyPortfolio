
// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
// but not the 'y' in "yellow" (not case sensitive). 
// We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 


// countYZ("fez day") → 2
// countYZ("day fez") → 2
// countYZ("day fyyyz") → 2

public int countYZ(String str) {
  int index = 0;
  int length = str.length();
  for(int i=0;i<length-1;i++)
  {
  
   if((str.charAt(i)=='y' 
   || str.charAt(i)=='z' 
   || str.charAt(i)=='Y'
   || str.charAt(i)=='Z')
   && !Character.isLetter(str.charAt(i+1)))
   index++;
  }
  if(str.charAt(length-1)=='y' 
  || str.charAt(length-1)=='z'
  || str.charAt(length-1)=='Y'
  || str.charAt(length-1)=='Z')
  {index++;}
  return index;
}