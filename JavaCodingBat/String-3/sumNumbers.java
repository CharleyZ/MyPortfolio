
// Given a string, return the sum of the numbers appearing in the string,
//  ignoring all other characters. A number is a series of 1 or more digit chars in a row. 


// sumNumbers("abc123xyz") → 123
// sumNumbers("aa11b33") → 44
// sumNumbers("7 11") → 18

public int sumNumbers(String str) {
  int sum=0;
  int length = str.length();
  String num = "0";
  for(int i=0;i<length;i++)
  {
   if(Character.isDigit(str.charAt(i)))
   {num=num.concat(str.substring(i,i+1));
   if(i == length-1)
   {  int number = Integer.parseInt(num);
    sum=sum+number;}
   }
   else
   {
    int number = Integer.parseInt(num);
    sum=sum+number;
    num="0";
   }
   
  }
  return sum;
}