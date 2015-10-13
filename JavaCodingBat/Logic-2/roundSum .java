
// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. 
// Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, 
// return the sum of their rounded values. To avoid code repetition,


// roundSum(16, 17, 18) → 60
// roundSum(12, 13, 14) → 30
// roundSum(6, 4, 4) → 10


public int roundSum(int a, int b, int c) {
return checkRound(a)+checkRound(b)+checkRound(c);
  
}
public int checkRound(int n){
int a= n/10;
int low=a*10;
int high=(a+1)*10;
if((n-low)<(high-n))
return low;
else
return high;
}