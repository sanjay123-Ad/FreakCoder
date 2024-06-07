// Online C compiler to run C program online
/*The program must accept a string S as the input. The program must print the string S for (L+1)/2 times (where L is the length of the string S) based on the following conditions. In the first line, the program must print the string S except the first and last characters. In the second line, the program must print the string S except the second and last but one characters. Similarly, the program must print the remaining possible string values as the output. 
Boundary Condition(s): 
3 <= Length of S <= 100 
Input Format: 
The first line contains S. 
Output Format: 
The first (L+1)/2 lines, each contains the string S based on the given conditions. 
Example Input/Output 1: 
Input: 
environment 
Output: 
nvironmen 
evironmet 
enironmnt 
envronent 
envioment 
envirnment 
Example Input/Output 2: 
Input: 
Robotics 
Output: 
obotic 
Rbotis 
Rootcs 
Robics
*/
#include <stdio.h>

int main() {
    // Write C code here
    char s[9000];
    scanf("%s",s);
    int i,c=0;
    for(i=0;s[i];i++)
    {
        c++;
    }
    int r=c;
    if(r%2==0)
    {
        r/=2;
    }
    else
    {
        r/=2;
        r++;
    }
    int u[9000],w=1;
    for(i=0;s[i];i++)
    {
        u[w]=s[i];
        w++;
    }
    int q=1,e=w-1,j;
    for(i=1;i<=r;i++)
    {
        for(j=1;j<w;j++)
        {
            if(j!=q && j!=e)
            {
                printf("%c",u[j]);
            }
        }
        q++;
        e--;
        printf("\n");
    }

    return 0;
}