// Online C compiler to run C program online

/*The program must accept an integer N as the input. The program must print the maximum possible integer which is formed by toggling exactly one bit in the binary representation of N as the output. If all the bits in the binary representation of N are 1, the program must print the value of N. 
Boundary Condition(s): 
2 <= N < 2^31 
Input Format: 
The first line contains N. 
Output Format: 
The first line contains an integer based on the given conditions. 
Example Input/Output 1: 
Input: 
22 
Output: 
30 
Explanation: 
The binary representation of 22 is 10110. 
If the first bit is toggled, the binary representation becomes 00110 and its decimal equivalent is 6. 
If the second bit is toggled, the binary representation becomes 11110 and its decimal equivalent is 30. 
If the third bit is toggled, the binary representation becomes 10010 and its decimal equivalent is 18. 
If the fourth bit is toggled, the binary representation becomes 10100 and its decimal equivalent is 20. 
If the fifth bit is toggled, the binary representation becomes 10111 and its decimal equivalent is 23. 
Here the maximum integer value is 30. So it is printed as the output. 
Example Input/Output 2: 
Input: 
15 
Output: 
15
*/
#include <stdio.h>
#include <math.h>
int main() {
    // Write C code here
    int n;
    printf("enter the number :");
    scanf("%d",&n);
    int a=n,c=0,i,s[900];
    for(i=1;a>0;i++)
    {
        s[i]=a%2;
        a/=2;
    }
    int j,t=i-1,k[900],b=i-2,tot=0;
    for(j=i-1;j>=1;j--)
    {
       
        k[j]=s[j];
    }
    int g[9000],v=1;
    for(int r=1;r<=i-1;r++)
    {
        for(j=i-1;j>=1;j--)
        {
            if(t==j)
            {
                if(s[j]==0)
                {
                    s[j]=1;
                }
                else
                {
                    s[j]=0;
                }
            }
           
            tot+=s[j]*pow(2,b);
            b--;
            for(int p=i-1;p>=1;p--)
            {
                s[p]=k[p];
                
            }
        }
        
        t--;
        g[v]=tot;
        v++;
        tot=0;
        b=i-2;
    }
    int max=n;
    for(i=1;i<v;i++)
    {
        if(max<g[i])
        {
            max=g[i];
        }
    }
    printf("%d",max);
    

    return 0;
}