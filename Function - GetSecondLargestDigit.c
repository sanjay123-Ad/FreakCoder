/*You must implement the function getSecondLargestDigit (int N) which accepts an integer N as the input. The function must return the second largest digit in N. If there is no such digit in N, the function must return -1. 
Boundary Condition(s): 
10 <= N <= 10^8 
Example Input/Output 1:
 Input: 
24324
 Output: 
Second Largest Digit: 3
 Explanation: 
The 2nd largest digit in 24324 is 3.
 Example Input/Output 2: 
Input: 22 
Output: Second Largest Digit: -1
*/

#include <stdio.h>
int g(int N)
{

unsigned long long int a=N,c=0,b=N,i,s[9000],k[9000],j,R=1,x=1,temp,y,u=0;
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
for(i=1;i<=c;i++)
{
    k[i]=s[i];
}
for(i=1;i<=c;i++)
{
    printf("%llu ",k[i]);
}
printf("\n");
for(i=1;i<=c;i++)
{
    for(j=i+1;j<=c;j++)
    {
        if(k[i]==k[j])
        {
           k[j]=99;
        }
    }
}
for(i=1;i<=c;i++)
{
    if(k[i]!=99)
    {
        k[R]=k[i];
        R++;
    }
    
}
printf("\n");
for(i=1;i<R;i++)
{
    printf("%llu ",k[i]);
}

for(i=1;i<R;i++)
{
    for(j=i+1;j<R;j++)
    {
        if(k[i]<k[j])
        {
            temp=k[i];
            k[i]=k[j];
            k[j]=temp;
        }
    }
}
printf("\nsort");
for(i=1;i<R;i++)
{
    printf("%llu ",k[i]);
}
for(i=1;i<R;i++)
{
    u++;
}
if(u==1)
{
    y=-1;
}
else
{
    for(i=1;i<R;i++)
    {
        if(2==i)
        {
            y=k[i];
        }
    }
}
return y;
}


int main()
{

int N;
scanf("%d",&N);
printf("Second Largest Digit : %d",g(N));

}

