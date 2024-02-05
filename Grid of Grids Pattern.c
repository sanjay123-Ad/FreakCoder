// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int r,c,m,n,w=1;
    printf("enter the r:");
    scanf("%d",&r);
    printf("enter the c:");
    scanf("%d",&c);
    printf("enter the m:");
    scanf("%d",&m);
    printf("enter the n:");
    scanf("%d",&n);
    int u=1,b=0;
    int i,j,a=0,k,l;
    B:
    for(i=1;i<=r;i++)
    {
        H:
        if(i<=r)
        {
        for(j=1;j<=c;j++)
        {
            printf("*");
        }
        a++;
        }
        else
        {
            break;
        }
        if(a<n)
        {
            printf("|");
            goto H;
        }
        else
        {
            printf("\n");
            if(i>=r)
            {
                i=i+1;
                a=n+1;
                goto H;
            }
            else
            {
            i=i+1;
            a=0;
            goto H;
                
            }
           
        }
    }
    for(k=w;k<=r;k++)
    {
        h:
        if(k<=1)
        {
        for(l=1;l<=c;l++)
        {
            printf("-");
        }
        b++;
        }
        else
        {
            break;
        }
        if(b<n)
        {
            printf("+");
            goto h;
        }
        else
        {
            printf("\n");
            if(k>=1)
            {
                k=k+1;
                b=n+1;
                goto h;
            }
            else
            {
            k=k+1;
            b=0;
            goto h;
                
            }
           
        }
    }
    u=u+1;
    if(u<=m)
    {
        if(u!=m)
        {
            a=0,b=0;
            goto B;
        }
        else
        {
            a=0;b=n+1,w=2;
            goto B;
        }
    }
    

    return 0;
}
