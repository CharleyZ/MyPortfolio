
// Given two arrays of ints sorted in increasing order, outer and inner, 
// return true if all of the numbers in inner appear in outer.
//  The best solution makes only a single "linear" pass of both arrays,
//   taking advantage of the fact that both arrays are already in sorted order. 

// linearIn({1, 2, 4, 6}, {2, 4}) → true
// linearIn({1, 2, 4, 6}, {2, 3, 4}) → false
// linearIn({1, 2, 4, 4, 6}, {2, 4}) → true

public boolean linearIn(int[] outer, int[] inner) {
  int i=0;
  int k=0;
  if(inner.length<1)
  return true;
  while(i<inner.length && k<outer.length)
  {
    if(inner[i] == outer[k])
    { 
     i++;
    }
    else
    {
    k++;
    }
    if(i == inner.length)
    return true;
  }
  return false;
}
