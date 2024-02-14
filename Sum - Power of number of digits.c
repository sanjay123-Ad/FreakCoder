/*The program must accept an integer N as the input. The program must print the sum of each digit to the power of number of digits in N as the output. 
Boundary Condition(s): 
1 <= N <= 10^8 
Input Format: 
The first line contains N. 
Output Format
The first line contains the sum of each digit to the power of number of digits in N. 
Example Input/Output 1: 
Input: 
154
 Output: 
190 
Explanation: 
The number of digits in 154 is 3.
 (1 * 1 * 1) + (5 * 5 * 5) + (4 * 4 * 4) = 190 
Hence the output is 190 
Example Input/Output 2: 
Input: 
6047 
Output: 
3953
*/

#include <stdio.h>

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
  int i,j,s[900];
  for(i=c;i>=1;i--)
  {
      s[i]=b%10;
      b/=10;
  }
  int z=1,w,k[900],v=1,tot=1;
  for(i=1;i<=c;i++)
  {
      w=s[i];
      for(j=1;z<=c;j++)
      {
         tot*=w;
         z++;
      }
      k[v]=tot;
      v++,tot=1,z=1;
  }
  for(i=1;i<v;i++)
  {
      printf("%d ",k[i]);
  }
  printf("\n");
  int t=0;
  for(i=1;i<v;i++)
  {
      t+=k[i];
  }
  printf("%d",t);

    return 0;
}

