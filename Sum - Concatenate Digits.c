/*The program must accept an integer N as the input. For each digit D in N, the program must form an integer by concatenating all the digits from D to 0 in the reverse order. Then the program must print the sum of integers which are formed from the digits of N as the output. 
Boundary Condition(s): 
1 <= N <= 10^5 
Input Format: 
The first line contains N. 
Output Format: 
The first line contains the sum of integers which are formed from the digits of N. 
Example Input/Output 1: 
Input:
 4052
 Output:
 586630 
Explanation:
 N = 4052 
43210 + 0 + 543210 + 210 = 586630
 Example Input/Output 2:
 Input:
 913 
Output: 
9876546430 
*/

#include <stdio.h>
#include<math.h>
int main()
{
   int n;
   scanf("%d",&n);
   int a=n,c=0,b=n;
   while(a!=0)
   {
       a/=10;
       c++;
   }
   int i,j;
   unsigned long long int s[9000],x[9000];
   for(i=c;i>=1;i--)
   {
      s[i]=b%10;
      b/=10;
   }
   unsigned long long int tot=0;
   int v=1;
   for(i=1;i<=c;i++)
   {
       int r=s[i];
       int z=r;
       for(j=r;j>=0;j--)
       {
           tot=tot+j*pow(10,z);
           z--;
       }
       x[v]=tot;
       v++;
       tot=0;
       
   }
   for(i=1;i<v;i++)
   {
       printf("%d ",x[i]);
   }
   unsigned long long int t=0;
   for(i=1;i<v;i++)
   {
       t=t+x[i];
   }
   printf("\n %llu",t);
   

    return 0;
}



