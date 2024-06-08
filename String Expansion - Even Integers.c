// Online C compiler to run C program online
/*The program must accept a string S containing alphabets and integers alternatively as the input. For each even integer X in the string S, the program must expand the previous alphabet by repeating X times. Then the program must print the modified string S as the output. 
Note: The first character in the string S is always alphabet. 
Boundary Condition(s): 
2 <= Length of S <= 100 
Input Format: 
The first line contains S. 
Output Format: 
The first line contains the modified string S. 
Example Input/Output 1:
 Input: 
u5h4a10k7 
Output: 
u5hhhhaaaaaaaaaak7 
Explanation: In the string u5h4a10k7, the even integers are 4 and 10. After repeating the previous alphabet of 4 by 4 times in the string u5h4a10k7, the string becomes u5hhhha10k7. After repeating the previous alphabet of 10 by 10 times in the string u5hhhha10k7, the string becomes u5hhhhaaaaaaaaaak7. 
Hence the output is u5hhhhaaaaaaaaaak7 
Example Input/Output 2: 
Input: 
A2B4C6 
Output: 
AABBBBCCCCCC
*/
#include <stdio.h>
#include<math.h>
int main() {
    // Write C code here
    char s[90000];
    int tot=9;
    scanf("%s",s);
    int i,c=0;
    for(i=0;s[i];i++)
    {
        c++;
    }
    char ch[9000],a=48,u;
    for(i=0;i<=9;i++)
    {
        ch[i]=a;
        a++;
    }
    int j,m=0,k,l=1,q[900],z=1;
    for(i=0;i<c;i++)
    {
        for(j=0;j<=9;j++)
        {
            if(s[i]==ch[j])
            {
                m++;
                if(m>=1)
                {
                    int w=i,M=0,y,tot=0;
                    for(k=m;k>=1;k--)
                    {
                        for(int t=0;t<=9;t++)
                        {
                            if(s[w]==ch[t])
                            {
                                y=t;
                            }
                        }
                        w--;
                        tot+=y*pow(10,M);
                        M++;
                        
                    }
                   q[z]=tot;
                }
                break;
            }
        }
        if(m==l)
        {
            l++;
        }
        else
        {
            if(m!=0 &&l!=1)
            {
                z++;
            }
            l=1;
            m=0;
        }
        
        
    }
    int t[9000],R=1;
    for(i=1;i<=z;i++)
    {
        if(q[i]!=0)
        {
            t[R]=q[i];
            R++;
        }
    }
    int Z[9000],H=1;
    for(i=1;i<R;i++)
    {
        int e=t[i];
        int g=0;
        while(e!=0)
        {
            e/=10;
            g++;
        }
        Z[H]=g;
        g=0;
        H++;
        
    }
    int p=1;
    int U=0;
    printf("\n");
    for(i=0;i<c;i++)
    {
        for(j=0;j<=9;j++)
        {
            if(s[i]==ch[j])
            {
                int V=t[p];
                if(V%2==0)
                {
                    for(k=1;k<=V;k++)
                    {
                        printf("%c",s[i-1]);
                        
                    }
                }
                else
                {
                    printf("%c",s[i-1]);
                    printf("%d",t[p]);
                }
                U++;
            }
            
        }
        if(U!=0)
        {
        i+=Z[p];
        p++;  
        }
       
    }
    return 0;
}

