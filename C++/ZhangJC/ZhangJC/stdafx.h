//stdafx.h

#ifndef Z_J_C_
#define Z_J_C_
#include<iostream>
#include<math.h>
#include<stdlib.h>
#define v (4)
#define p (v*v)

using namespace std;

class My_class 
{

public:
	My_class()
	{
		
	  final_aclot=p;
	  final_zclot=p;
      min_line_number=p;

	  Step=1;
	  final_pre=0;
      final_post=0;
	 
	}

public:

	void trans(int a[v][v],int a_adjacency[p][p]),
         outputp(int b[p][p]),
	     outputv(int a[v][v]),
	     let_us_change();



private:

   void init_temp_acount(),
        put_acount_temp(int b[p][p]),
        inputd(int b[p][p]),
        createZ(int a[v][v]),
        init_acount(),
        init_zcount(),
        init_temp_zcount(),
        init_a_adjacency(),
        init_z_adjacency(),
        warshall(int b[p][p]),
        check(int b[p][p]),
        change_one_step(),
        exchange(int a[v][v],int former,int later),
        find_min_max_aclot(int b[p][p]),
        find_min_zclot(int b[p][p]),
        deleteline(int b[p][p],int i);


   int checkzero(int b[p][p]),
       allzero(int c[p]),
       countaclot(int b[p][p]),
       countzclot(int b[p][p]),
       back_step_first_nonezero(int vector[p]),
       compare(int cc[p],int bb[p]),
       findfirstnonezero(int b[p][p]);
   

private:

	 int a_adjacency[p][p],
	     temp_matrix[p][p],
	     zz[v][v],
	     z_adjacency[p][p],
	     aclot,
	     zclot,
	     acount[p][p],
	     zcount[p][p],
	     min_aclot,
	     max_line,
	     min_line,

	     final_aclot,
	     final_pre,
	     final_post,
	     final_zclot,

	     index_for_switch,
	     a_temp_diff,
	     z_temp_diff,

	     temp_acount[p][p],
	     temp_zcount[p][p];

	 

	 

private:
     int Step,
         min_line_number,
	     min_line_temp_number;

};
#endif





