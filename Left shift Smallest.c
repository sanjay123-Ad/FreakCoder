// Online C compiler to run C program online
/*The program must accept an integer N as the input. The program must print the smallest possible integer S which is obtained by shifting the digits to the left in N as the output. 
Boundary Condition(s): 
10 <= N <= 10^8 
Input Format: 
The first line contains N. 
Output Format: 
The first line contains S. 
Example Input/Output 1: 
Input: 
52124 
Output: 
12452 
Explanation: All possible integers which are obtained by shifting the digits to the left in 52124 are given below. 
52124 
21245 
12452 
24521 
45212 
Here the smallest integer is 12452, so it is printed as the output. 
Example Input/Output 2: 
Input: 
201 
Output: 
12
*/
#include <stdio.h>
#include<math.h>
int main() {
    // Write C code here
    int n,k[9000],g=1;
    scanf("%d",&n);
    int i,c=0,a=n,b=n;
    while(a!=0)
    {
        a/=10;
        c++;
    }
    int s[90000];
    for(i=c;i>=1;i--)
    {
        s[i]=b%10;
        b/=10;
    }
    for(i=1;i<=c;i++)
    {
        printf("%d",s[i]);
    }
    H:
    int temp=s[1];
    for(i=1;i<c;i++)
    {
        s[i]=s[i+1];
    }
    s[c]=temp;
    int tot=0;
    int r=c-1;
    for(i=1;i<=c;i++)
    {
      tot=tot+s[i]*pow(10,r);
      r--;
    }
    printf("\ntot:%d",tot);
    k[g]=tot;
    tot=0;
    g++;
    printf("\n");
    if(g<=c)
    {
        goto H;
    }
    else
    {
        for(i=1;i<g;i++)
        {
            printf("%d ",k[i]);
        }
    }
    int sm=k[1];
    for(i=1;i<g;i++)
    {
        if(sm>k[i])
        {
            sm=k[i];
        }
    }
    printf("\n%d",sm);

    return 0;
}
