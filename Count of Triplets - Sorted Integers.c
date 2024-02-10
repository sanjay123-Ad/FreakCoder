/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/* The program must accept N integers as the input. The program must print the count of triplets where the three integers are in strictly increasing order in the given N integers as the output. 
Note: The order of integers in the triplets must be in the same order as in the input. 
Boundary Condition(s): 
3 <= N <= 100 1 <= Each integer value <= 10^5 
Input Format: 
The first line contains N. 
The second line contains N integers separated by a space. 
Output Format: 
The first line contains the count of triplets where the three integers are in strictly increasing order in the given N integers. 
Example Input/Output 1: 
Input: 5 3 4 1 8 7
 Output: 2 
Explanation: 
The 2 triplets are given below. 
3 < 4 < 8 3 < 4 < 7 
Example Input/Output 2:
 Input: 8 60 84 17 26 76 87 72 19 
Output: 7 
Explanation: The 7 triplets are given below.
60 < 84 < 87 
60 < 76 < 87 
17 < 26 < 76 
17 < 26 < 87
17 < 26 < 72
17 < 76 < 87
26 < 76 < 87

*/

#include <stdio.h>

int main()
{
    int n,i,j,k,a,b,s[900],C=0;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        scanf("%d",&s[i]);
    }
    for(i=1;i<=n;i++)
    {
        a=s[i];
        for(j=i+1;j<=n;j++)
        {
            if(a<s[j])
            {
                b=s[j];
                for(k=j+1;k<=n;k++)
                {
                    if(b<s[k])
                    {
                        C++;
                    }
                }
            }
        }
    }
    printf("%d",C);

    return 0;
}
