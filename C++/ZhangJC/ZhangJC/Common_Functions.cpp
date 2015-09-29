
// Common_Functions.cpp

#include "stdafx.h"

void My_class::deleteline(int b[p][p],int i)   //delete the line which is the same with the certain line
{                                              //in order to calculate the number of clots
	for(int j=0;j<p;j++)
	{
		b[i][j]=0;     
	}
}
int My_class::findfirstnonezero(int b[p][p])
{                                                  // find the first line with nonezero element
 int i=0;                                          //in order to count the clots 
   while(i<p)
   {
	 for(int j=0;j<p;j++)
	 {
		 if(b[i][j]!=0)
		 {
			 return i;			
		 }
	 }
	 i++;
 } 
  return i; 
}
void My_class::outputp(int b[p][p])
{ 
	for(int i=0;i<p;i++)              //output a matrix with p*p elements
	{
		for(int j=0;j<p;j++)
		{
         cout<<b[i][j]<<" ";
		}
		cout<<endl;
	}
	cout<<endl;
}
void My_class::outputv(int temp_a[v][v])
{
	for(int i=0;i<v;i++)              //output a matrix with v*v elements
	{
		for(int j=0;j<v;j++)
		{
         cout<<temp_a[i][j]<<" ";
		}
		cout<<endl;
	}
}
int My_class::compare(int cc[p],int bb[p])
{
	for(int i=0;i<p;i++)              //compare two p-element-vectors
	{
		if((cc[i]-bb[i])!=0)      // different return 1
		{return 1;}		
	}
return 0;                        // the same return 0;
}
int My_class::checkzero(int b[p][p])
{
	for(int i=0;i<p;i++)
	{
		for(int j=0;j<p;j++)      //check whether there is a nonezero element in this vector
		{
			if(b[i][j]!=0)
			{
				return 1;   //have a nonezero element return 1
			}
		}
	}
	return 0;            //all zero return 0        
}
void My_class::inputd(int b[p][p])
{
	for(int i=0;i<p;i++)             // put the p*p adjacency matrix to a p*p temp matrix
	{
		for(int j=0;j<p;j++)
		{
			temp_matrix[i][j]=b[i][j];
		}
	}
}
void My_class::createZ(int a[v][v])
{
	for(int i=0;i<v;i++)                   //creat a matrix oppose 
	{
		for(int j=0;j<v;j++)
		{
			if(a[i][j]==0)
			  zz[i][j]=1;
			else
			  zz[i][j]=0;
		}
	}
}
void My_class::init_a_adjacency()
{
	  for(int i=0;i<p;i++)           //initializing adjacency matrix by putting all 
	{                               //elements with 0
		for(int j=0;j<p;j++) 
		{
         a_adjacency[i][j]=0;
		}
	}
}
void My_class::init_z_adjacency()
{
	  for(int i=0;i<p;i++)         //same as above
	{
		for(int j=0;j<p;j++)
		{
         z_adjacency[i][j]=0;
		}
	}
}
void My_class::init_acount()
{
	  for(int i=0;i<p;i++)             //same above
	{
		for(int j=0;j<p;j++)
		{
         acount[i][j]=0;
		}
	}
}
void My_class::init_zcount()
{
	  for(int i=0;i<p;i++)             //same above
	{
		for(int j=0;j<p;j++)
		{
         zcount[i][j]=0;
		}
	}
}
void My_class::exchange(int a[v][v],int former,int later)
{

	int former_i=former/v;
	int former_j=former%v;
	int later_i=later/v;
	int later_j=later%v;
	int temp_a=a[former_i][former_j];
	a[former_i][former_j]=a[later_i][later_j];
	a[later_i][later_j]=temp_a;
	//cout<<"exchange a["<<former_i<<","<<former_j<<"] with a["<<later_i<<","<<later_j<<"]"<<endl;
}
void My_class::find_min_max_aclot(int b[p][p])
{
	int min=p,max=0;
	for(int i=0;i<p-1;i++)
	{
		if(b[i][p-1]>=max)
		{max=b[i][p-1];}
		if((b[i][p-1]<=min)&&(b[i][p-1]!=0))
			{
				min=b[i][p-1];
				min_aclot=i;
		     }
	}
	max_line=max;
	min_line=min;
	if(min==max)
	{
		cout<<"error"<<endl;
	}

}
int My_class::allzero(int c[p])
{
	for(int i=0;i<p;i++)
	{
		if(c[i]!=0)
			return 1;      //else return 1;
	}
	        return 0;     //all zero line return 0;
}
void My_class::init_temp_acount()
{
for(int i=0;i<p;i++)          
	{                               
		for(int j=0;j<p;j++) 
		{
         temp_acount[i][j]=0;
		}
	}
}
void My_class::put_acount_temp(int b[p][p])
{
for(int i=0;i<p;i++)          
	{                               
		for(int j=0;j<p;j++) 
		{
         temp_acount[i][j]=b[i][j];
		}
	}
}
void My_class::init_temp_zcount()
{
for(int i=0;i<p;i++)          
	{                               
		for(int j=0;j<p;j++) 
		{
         temp_zcount[i][j]=0;
		}
	}
}
int My_class::back_step_first_nonezero(int vector[p])
{
	for(int i=p-2;i>=0;i--)
	{
		if(vector[i]!=0)
		{return i;}
	}
	
	return 0;
}
