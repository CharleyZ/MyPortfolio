
// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
// Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done. 

// makeChocolate(4, 1, 9) → 4
// makeChocolate(4, 1, 10) → -1
// makeChocolate(4, 1, 7) → 2

public int makeChocolate(int small, int big, int goal) {
  int total=big*5+small;
  if(total<goal)
  return -1;
  else
  {
  int a=goal/5;
  if(a<=big && 5*a+small>=goal)
  return goal-5*a;
   else if(a>big)
  return goal-5*big;
  else
  return -1;
  


  }
}