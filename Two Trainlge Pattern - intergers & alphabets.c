// Online C compiler to run C program online
/*
The program must accept an odd integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section. 
Boundary Condition(s): 
3 <= N <= 999 
Input Format: 
The first line contains N. 
Output Format: 
The lines containing the desired pattern as shown in the Example Input/Output section. 
Example Input/Output 1:
Input: 
5 
Output: 
1 * * * * a
 2 3 * * b c 
4 5 6 d e f 
7 8 * * g h 
9 * * * * i 
Example Input/Output 2: 
Input: 
7 
Output:
 1 * * * * * * a 
2 3 * * * * b c
 4 5 6 * * d e f 
7 8 9 10 g h i j 
11 12 13 * * k l m 
14 15 * * * * n o 
16 * * * * * * p 
Example Input/Output 3: 
Input: 
11
 Output: 
1 * * * * * * * * * * a 
2 3 * * * * * * * * b c 
4 5 6 * * * * * * d e f 
7 8 9 10 * * * * g h i j 
11 12 13 14 15 * * k l m n o 
16 17 18 19 20 21 p q r s t u 
22 23 24 25 26 * * v w x y z 
27 28 29 30 * * * * a b c d 
31 32 33 * * * * * * e f g 
34 35 * * * * * * * * h i 
36 * * * * * * * * * * j

*/


#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,j;
    int a=1,b=n+1,c=97;
    int u=(n/2)+1;
    int y=n-u;
    for(i=1;i<=(n/2)+1;i++)
    {
        for(j=1;j<=n+1;j++)
        {
            if(i>=j)
            {
                printf("%d ",a);
                a++;
            }
            else if(j>=b)
            {
                if(c>122)
                {
                    c=97;
                }
                printf("%c ",c);
                c++;
            }
            else
            {
                printf("* ");
            }
        }
        printf("\n");
        b--;
    }
    int k=y;
    int x=n+1-y;
    for(i=1;i<=y;i++)
    {
        for(j=1;j<=n+1;j++)
        {
            if(k>=j)
            {
                printf("%d ",a);
                a++;
            }
            else if(x<j)
            {
                if(c>122)
                {
                    c=97;
                }
                printf("%c ",c);
                c++;
            }
            else
            {
                printf("* ");
            }
        }
        printf("\n");
        x++;
        k--;
    }

    return 0;
}
