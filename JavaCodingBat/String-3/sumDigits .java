
// Given a string, return the sum of the digits 0-9 that appear in the string, 
// ignoring all other characters. Return 0 if there are no digits in the string. 


// sumDigits("aa1bc2d3") → 6
// sumDigits("aa11b33") → 8
// sumDigits("Chocolate") → 0

public int sumDigits(String str) {
  int sum=0;
  int length = str.length();
  for(int i=0;i<length;i++)
  {
   if(Character.isDigit(str.charAt(i)))
   {
    int k = Integer.parseInt(str.substring(i,i+1));
    sum = sum+k;
   }
  }
  return sum;
}
