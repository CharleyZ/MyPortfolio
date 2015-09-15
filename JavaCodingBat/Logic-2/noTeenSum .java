// Given 3 int values, a b c, return their sum. However, 
// if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.

// noTeenSum(1, 2, 3) → 6
// noTeenSum(2, 13, 1) → 3
// noTeenSum(2, 1, 14) → 3

public int noTeenSum(int a, int b, int c) {
return checkTeen(a)+checkTeen(b)+checkTeen(c);

} public int checkTeen(int n){
if(n>=13 && n<=19 && n!=15 && n!=16)
return 0;
else
return n; 
}