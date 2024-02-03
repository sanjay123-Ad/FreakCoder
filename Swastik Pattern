#include <stdio.h>

int main()
{
    int n,a,i,j;
    scanf("%d",&n);
    a=n/2;
    if(n%2==0)
    {
        for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if((i==a||j==a)||(j>a&&i==0)||(i<a&&j==0)||(i>a&&j==n-1)||((i==n-1)&&j<a)||((i==a-1)||(j==a-1)))
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
        for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if((i==a||j==a)||(j>a&&i==0)||(i<a&&j==0)||(i>a&&j==n-1)||((i==n-1)&&j<a))
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
