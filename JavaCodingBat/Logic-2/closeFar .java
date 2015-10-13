
// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. 
// Note: Math.abs(num) computes the absolute value of a number. 

// closeFar(1, 2, 10) → true
// closeFar(1, 2, 3) → false
// closeFar(4, 1, 3) → true

public boolean closeFar(int a, int b, int c) {
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

if(mid-min<=1 && max-mid>=2)
return true;
else if(max-mid<=1 &&mid-min>=2)
return true;
else
return false;
  
}