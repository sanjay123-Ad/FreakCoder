/* Asterik Pattern in c program */
#include <stdio.h>

int main()
{
    int i,j,n,a;
    scanf("%d",&n);
    a=n/2;
    if(n%2==0)
    {
      for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if((i==j||i==a+1)||(j==a+1)||(i+j)==n+1||(i==a||j==a))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
  
    }
    else
    {
        
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if((i==j||i==a+1)||(j==a+1)||(i+j)==n+1)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    }

    return 0;
}