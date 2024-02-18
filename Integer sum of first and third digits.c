// Online C compiler to run C program online
/*The program must accept an integer N as the input. The program must print yes if the sum of the first and third digits is present in N. Else the program must print no as the output.
 Boundary Condition(s): 
100 <= N <= 10^8
 Input Format: 
The first line contains N. 
Output Format:
 The first line contains yes or no.
 Example Input/Output 1: 
Input: 
968172 
Output: 
Yes
 Explanation: 
The sum of the first and third digits in 968172 is 17.
 The sum 17 is present in the integer 968172. 
Hence the output is yes
 Example Input/Output 2:
 Input:
 747134
 Output: 
no
*/


#include <stdio.h>
#include<math.h>
int main() {
    // Write C code here
    int n,i,j;
    scanf("%d",&n);
    int a=n,c=0,b=n,s[900];
    while(a!=0)
    {
        a/=10;
        c++;
    }
    for(i=c;i>=1;i--)
    {
        s[i]=b%10;
        b/=10;
    }
    int e=s[1]+s[3];
    int S=e,v=0;
    while(S!=0)
    {
        S/=10;
        v++;
    }
    printf("\n%d",v);
    printf("\n%d",e);
    printf("\n");
    int tot=0,r=0;
    int q=v-1,y[9000],E=1;
    for(i=1;i<c;i++)
    {
        for(j=i;r<=v;j++)
        {
            
            tot=tot+s[j]*pow(10,q);
            q--;
            r++;
        }
        y[E]=tot;
        tot=0;
        E++;
        r=0;
        q=v-1;
    }
    y[E]=s[c];
    for(i=1;i<=E;i++)
    {
        printf("%d ",y[i]);
    }
    printf("\n");
    int t=0;
    for(i=1;i<=E;i++)
    {
        if(y[i]==e)
        {
            t++;
        }
    }
    if(t>=1)
    {
        printf("yes");
    }
    else
    {
        printf("no");
    }
    

    return 0;
}
