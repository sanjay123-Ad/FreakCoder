/*
The program must accept N integers as the input. The program must find the maximum of every three integers among the N integers. Then the program must find the minimum of every three integers from the obtained maximum integers. Repeat those two steps until the program gets a single integer X. Finally, the program must print X as the output. 
Note: If there are no three integers to find the minimum or maximum, consider only the available integers. 
Boundary Condition(s):
 3 <= N <= 1000 1 <= Each integer value <= 10^8 
Input Format: 
The first line contains N. 
The second line contains N integers separated by a space.
 Output Format: 
The first line contains X. 
Example Input/Output 1: 
Input: 
10 14 3 66 26 2 98 86 23 51 5
 Output: 66 
Explanation: 
The given 10 integers are 14 3 66 26 2 98 86 23 51 5 
After finding the maximum of every three integers, the integers become 66 98 86 5 

After finding the minimum of every three integers, the integers become 66 5
 After finding the maximum of the remaining two integers, there will be one integer 66. Hence the output is 66 
Example Input/Output 2:
 Input: 
9 1 2 3 4 5 6 7 8 9 
Output: 3 
Example Input/Output 3: 
Input: 
28 41 25 34 15 17 49 42 50 38 20 36 30 39 18 28 16 22 23 11 33 45 27 37 13 31 19 14 12 
Output: 12 
Explanation: 
Maximum of every three among the given 28 integers: 41 49 50 36 39 23 45 37 31 12 
Minimum of every three among the obtained integers from the previous step: 41 23 31 12 
Maximum of every three among the obtained integers from the previous step: 41 12 
Minimum of the remaining two from the previous step: 12
*/




#include <stdio.h>

int main()
{
    int n,X=1,U,C=1;
    scanf("%d",&n);
    int i,j,k[900],s[900],a,h=1;
    for(i=1;i<=n;i++)
    {
        printf("Enter the num[%d]:",i);
        scanf("%d",&s[i]);
    }
    U=n;
    int b=1,r=1;
    A:
    C++;
    printf("\n Maximum no ");
    printf("\n");
    for(i=1;i<=U;i++)
    {
        if(i==h)
        {
            a=s[i];
            for(j=i;b<=3;j++)
            {
                
                if(a<=s[j] && j<=U)
                {
                    a=s[j];
                }
                h++;
                b++;
            }
            k[r]=a;
            r++;
            b=1;
        }
    }
    for(i=1;i<r;i++)
    {
        printf("%d ",k[i]);
    }
    printf("\n");
    printf("Minimum no :");
    printf("\n");
    int g=1,t,v=1,w[900],z=1;
    for(i=1;i<r;i++)
    {
        if(i==g)
        {
            t=k[i];
            for(j=i;v<=3;j++)
            {
                if(t>=k[j] && j<r)
                {
                    t=k[j];
                }
                v++;
                g++;
            }
            w[z]=t;
            z++;
            v=1;
            
        }
    }
    printf("\n");
    int O=0;
    for(i=1;i<z;i++)
    {
        O++;
        printf("%d ",w[i]);
    }
    printf("\n");
    U=0;
    if(O>2)
    {
        for(i=1;i<z;i++)
        {
            s[i]=w[i];
            U++;
            printf("%d ",s[i]);
        }
        printf("\n %d ",U);
        h=1,b=1,r=1,g=1,v=1,z=1;
        goto A;
    }
    int S;
    if(C%2!=0)
    {
        S=w[1];
    for(i=1;i<z;i++)
    {
        if(S>=w[i])
        {
            S=w[i];
        }
    }
    printf("\n%d",S);
    }
    else
    {
        S=w[1];
        for(i=1;i<z;i++)
        {
            if(S<=w[i])
            {
                S=w[i];
            }
        }
        printf("\n%d",S);
    }
    

    return 0;
}


