
//Main.cpp
#include "stdafx.h"
#include<fstream>


ofstream outFile;
int A_matrix[v][v]=	{{1,1,0,1},
                    {1,0,0,1},
                    {0,0,0,0},
                    {0,1,1,0},};
	 
	 /*
{ {1,1,1,1,1,0,0,1,1,1},
                      {1,1,0,0,0,0,0,0,1,1},
                      {1,0,0,0,1,0,0,0,0,0},
                      {0,0,0,0,1,1,1,0,0,0},
                      {0,0,0,1,0,1,1,0,0,1},
                      {1,1,0,1,0,0,1,0,0,0},
                      {1,0,0,0,0,1,0,0,0,0},
					  {0,0,1,0,0,1,1,0,0,0},
					  {1,0,0,1,0,0,0,0,0,1},
                      {1,1,0,1,0,1,1,0,1,1}     };


					 { {1,0,0,1,1,0,0,1},
                      {1,1,0,0,0,0,0,1},
                      {0,0,0,0,1,0,0,0},
                      {0,1,0,0,1,0,0,0},
                      {0,1,0,1,0,1,1,1},
                      {1,1,0,0,0,1,0,0},
                      {0,0,0,0,0,0,0,0},
                      {1,1,0,1,0,1,1,1}     };
					  
					;
	

					  
					  */



int main()
{

	My_class D;
    outFile.open("The_Answer.txt");

	  outFile<<"the origin matrix is :"<<endl;
	  cout<<"the origin matrix is :"<<endl;
	  D.outputv(A_matrix);

for(int xi=0;xi<v;xi++)             
	{
		for(int xj=0;xj<v;xj++)
		{
         outFile<<A_matrix[xi][xj]<<" ";
		}
		outFile<<endl;
	}

      cout<<"-------------------------------------------------------------"<<endl;
	  outFile<<"-------------------------------------------------------------"<<endl;	
      D.let_us_change();
	outFile.close();
      getchar();
return 0;
}



void My_class::trans(int a[v][v],int a_adjacency[p][p])
{
for(int i=0;i<v;i++)
	{
		for(int j=0;j<v;j++)
		{
         if(a[i][j]!=0)
		 {a_adjacency[i*v+j][i*v+j]=1;}
		}
	}


if(a[0][1]!=0&&a[0][0]!=0)   //left up vertex
{a_adjacency[0][1]=1;}
if(a[1][0]!=0&&a[0][0]!=0) 
{a_adjacency[0][v]=1;}

if(a[0][v-2]!=0&&a[0][v-1]!=0)    //right up   vertex
{a_adjacency[v-1][v-2]=1;}
if(a[1][v-1]!=0&&a[0][v-1]!=0)
{a_adjacency[v-1][2*v-1]=1;}

if(a[v-2][0]!=0&&a[v-1][0]!=0)
{a_adjacency[v*v-v][v*v-2*v]=1;}    //left down   vertex
if(a[v-1][1]==1&&a[v-1][0]==1)
{a_adjacency[v*v-v][v*v-v+1]=1;}

if(a[v-2][v-1]!=0&&a[v-1][v-1]!=0)        //right down   vertex
{a_adjacency[v*v-1][v*v-v-1]=1;}
if(a[v-1][v-2]!=0&&a[v-1][v-1]!=0)
{a_adjacency[v*v-1][v*v-2]=1;}

for(int i=1;i<v-1;i++)     
{
	if(a[0][i-1]!=0&&a[0][i]!=0)         //up line
	{a_adjacency[i][i-1]=1;}
	if(a[0][i+1]!=0&&a[0][i]!=0)
	{a_adjacency[i][i+1]=1;}
	if(a[1][i]!=0&&a[0][i]!=0)
	{a_adjacency[i][v+i]=1;}


    if(a[v-1][i-1]!=0&&a[v-1][i]!=0)             //down line
	{a_adjacency[v*v-v+i][v*v-v+i-1]=1;}
	if(a[v-1][i+1]!=0&&a[v-1][i]!=0)
	{a_adjacency[v*v-v+i][v*v-v+i+1]=1;}
	if(a[v-2][i]!=0&&a[v-1][i]!=0)
	{a_adjacency[v*v-v+i][v*v-2*v+i]=1;}

	if(a[i-1][0]!=0&&a[i][0]!=0)       //left line
	{a_adjacency[v*i][v*i-v]=1;}
	if(a[i+1][0]!=0&&a[i][0]!=0)
	{a_adjacency[v*i][v*i+v]=1;}
	if(a[i][1]!=0&&a[i][0]!=0)
	{a_adjacency[v*i][v*i+1]=1;}

	if(a[i-1][v-1]!=0&&a[i][v-1]!=0)    //right line
	{a_adjacency[v*i-1+v][v*i-1]=1;}
	if(a[i+1][v-1]!=0&&a[i][v-1]!=0)
	{a_adjacency[v*i-1+v][v*i-1+2*v]=1;}
	if(a[i][v-2]!=0&&a[i][v-1]!=0)
	{a_adjacency[v*i-1+v][v*i-2+v]=1;}
}


	for(int i=1;i<v-1;i++)
	{
		for(int j=1;j<v-1;j++)
		{
            if(a[i][j-1]!=0&&a[i][j]!=0)
			{a_adjacency[i*v+j][i*v+j-1]=1;}  //left

			if(a[i][j+1]!=0&&a[i][j]!=0)
			{a_adjacency[i*v+j][i*v+j+1]=1;} //right

			if(a[i-1][j]!=0&&a[i][j]!=0)
			{a_adjacency[i*v+j][(i-1)*v+j]=1;}   //up

			if(a[i+1][j]!=0&&a[i][j]!=0)
			{a_adjacency[i*v+j][(i+1)*v+j]=1;}   //down

		}
	}

}
void My_class::warshall(int b[p][p])
{
int i,j,k;
for(j=0;j<p;j++)
{
	for(i=0;i<p;i++)
	{
		if((b[i][j])!=0)
		{
			for(k=0;k<p;k++)
			{
				b[i][k]=b[i][k]+b[j][k];
				if(b[i][k]!=0)
				{
					b[i][k]=1;
				}
			}
		}
	}
}
	
}
int My_class::countaclot(int b[p][p])
{
	aclot=0;

	int c_c[p];
	int k_k=0;
	for(int ii=0;ii<p;ii++)
	{
		for(int jj=0;jj<p;jj++)
		{
			c_c[jj]=b[ii][jj];
		}

		if(allzero(c_c)==0)
		{
			acount[p-1][k_k]=ii;
		    k_k++;
			acount[p-1][p-1]=k_k;
		}
	}


	int j=0;
	while(j<p)
	{
	int Aa[p];
	int a=findfirstnonezero(b);
	for(int uu=0;uu<p;uu++)
	{
		Aa[uu]=b[a][uu];
	}

    int k=0;
	for(int i=0;i<p;i++)
	{
		
		if(compare(Aa,b[i])==0)
		{
			deleteline(b,i);
			acount[aclot][k]=i;
			acount[aclot][p-1]++;
			k++;
		}
	}
	aclot++;
	if(checkzero(b)==0)
		break;
	j++;
	}
	//cout<<"the number of aclot is "<<aclot<<endl;
	return 0;
}
int My_class::countzclot(int b[p][p])
{
	zclot=0;

	int c_c[p];
	int k_k=0;
	for(int ii=0;ii<p;ii++)
	{
		for(int jj=0;jj<p;jj++)
		{
			c_c[jj]=b[ii][jj];
		}

		if(allzero(c_c)==0)
		{
			zcount[p-1][k_k]=ii;
		    k_k++;
			zcount[p-1][p-1]=k_k;
		}
	}


	int j=0;
	while(j<p)
	{
	int Aa[p];
	int a=findfirstnonezero(b);
	for(int uu=0;uu<p;uu++)
	{
		Aa[uu]=b[a][uu];
	}

    int k=0;
	for(int i=0;i<p;i++)
	{
		
		if(compare(Aa,b[i])==0)
		{
			deleteline(b,i);
			zcount[zclot][k]=i;
			zcount[zclot][p-1]++;
			k++;
		}
	}
	zclot++;
	if(checkzero(b)==0)
		break;
	j++;
	}
	//cout<<"the number of zclot is "<<zclot<<endl;
	return 0;
}
void My_class::change_one_step()
{


    init_temp_acount();
	put_acount_temp(acount);
	find_min_max_aclot(temp_acount);

   int a_diff=0;
     int z_diff=0;
for(int i=0;i<temp_acount[min_aclot][p-1];i++)
{
	for(int j=0;j<temp_acount[p-1][p-1];j++)
	{
		int former=temp_acount[min_aclot][i];
		int later=temp_acount[p-1][j];


	 exchange(A_matrix,former,later);

	 init_acount();
	 init_a_adjacency();

	 trans(A_matrix,a_adjacency);
	 warshall(a_adjacency);
     inputd(a_adjacency);
	 countaclot(temp_matrix);
	 min_line_temp_number=acount[min_aclot][p-1]; 

	 createZ(A_matrix);
	 init_zcount();
	 init_z_adjacency();

	 trans(zz,z_adjacency);
	 warshall(z_adjacency);
     inputd(z_adjacency);
	 countzclot(temp_matrix);
	 a_temp_diff=final_aclot-aclot;
	 z_temp_diff=final_zclot-zclot; 


	 exchange(A_matrix,later,former);
	 
 
if(a_diff<a_temp_diff)  //get max a_diff
		 {
			  a_diff=a_temp_diff;
			  z_diff=z_temp_diff;
			  min_line_temp_number=min_line_number;
			      final_pre=former;
			      final_post=later;
				  final_aclot=aclot;
	              final_zclot=zclot;
		 }


 if((a_diff==a_temp_diff)&&(i==temp_acount[min_aclot][p-1]))
 {
	 if(z_diff<z_temp_diff)
	 {
		 z_diff=z_temp_diff;
		 min_line_temp_number=min_line_number;
		 final_pre=former;
		 final_post=later;
		 final_aclot=aclot;
	     final_zclot=zclot;
	 }
 }

 

 if((a_diff==a_temp_diff)&&(z_diff==z_temp_diff))
 {
	 if(min_line_temp_number<min_line_number)
	 {
		 min_line_temp_number=min_line_number;
		 final_pre=former;
		 final_post=later;
		 final_aclot=aclot;
	     final_zclot=zclot;
	 }
 }


	}
}


exchange(A_matrix,final_pre,final_post);

cout<<endl<<"Step "<<Step<<" : "<<endl;
cout<<"The matrix above got by changing ["<<final_pre/v<<","<<final_pre%v<<"]"
	<<" to ["<<final_post/v<<","<<final_post%v<<"]"<<endl;
outputv(A_matrix);


outFile<<endl<<"Step "<<Step<<" : "<<endl;
outFile<<"The matrix is got by changing ["<<final_pre/v<<","<<final_pre%v<<"]"
	<<" to ["<<final_post/v<<","<<final_post%v<<"]"<<endl;

	for(int xi=0;xi<v;xi++)             
	{
		for(int xj=0;xj<v;xj++)
		{
         outFile<<A_matrix[xi][xj]<<" ";
		}
		outFile<<endl;
	}



Step++;
}
void My_class::let_us_change()
{
	init_acount();
	init_a_adjacency();
	init_zcount();
	init_z_adjacency();
	createZ(A_matrix);

	trans(A_matrix,a_adjacency);
	warshall(a_adjacency);

	inputd(a_adjacency);
	countaclot(temp_matrix);
	/*
	outputp(acount);
	outFile<<"the acount matrix is :"<<endl;
	for(int i=0;i<p;i++)              
	{
		for(int j=0;j<p;j++)
		{
         outFile<<acount[i][j]<<" ";
		}
		outFile<<endl;
	}
	outFile<<endl;
	*/
	trans(zz,z_adjacency);
	warshall(z_adjacency);



	//outputp(a_adjacency);
	//outputp(acount);



	inputd(z_adjacency);
	countzclot(temp_matrix);



    final_aclot=aclot;
	final_zclot=zclot;
	int k=0;
	
	while((aclot>1)&&(k<p))
	{
		change_one_step();
		
		init_acount();
	    init_a_adjacency();

		trans(A_matrix,a_adjacency);
	    warshall(a_adjacency);
        inputd(a_adjacency);
	    countaclot(temp_matrix);

	init_zcount();
	init_z_adjacency();
	createZ(A_matrix);

	trans(zz,z_adjacency);
	warshall(z_adjacency);
	inputd(z_adjacency);
	countzclot(temp_matrix);
	k++;
cout<<"aclot = "<<aclot<<"   ,"<<"zclot = "<<zclot<<endl;
outFile<<"aclot = "<<aclot<<"   ,"<<"zclot = "<<zclot<<endl;
	}

}
