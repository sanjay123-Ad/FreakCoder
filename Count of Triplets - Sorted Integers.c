/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
