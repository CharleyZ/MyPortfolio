
// Given three ints, a b c, one of them is small, one is medium and one is large. 
// Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large. 

// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false

public boolean evenlySpaced(int a, int b, int c) {
int min, mid,max;
	if(a>b)
	{
		max=a;min=b;
	}
	else
	{
		max=b;min=a;
	}
	if(c>=max)
	{mid=max;
	max=c;}
	else if(c<=min)
	{
		mid=min;
		min=c;
	}
	else
		mid=c;
if(max-mid==mid-min)
return true;
else return false;
  
}