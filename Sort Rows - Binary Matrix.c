// Online C compiler to run C program online
#include <stdio.h>
#include <math.h>
int main() {
    // Write C code here
    int a,b;
    scanf("%d%d",&a,&b);
    int i,j,s[900][900];
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=b;j++)
        {
            printf("Enter the num[%d][%d]:",i,j);
            scanf("%d",&s[i][j]);
        }
    }
    int tot=0,k[900],f=1;
    int u=b-1;
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=b;j++)
        {
            {
                tot=tot+s[i][j]*pow(2,u);
                u--;
            }
        }
        k[f]=tot;
        tot=0;
        f++;
        u=b-1;
    }
    printf("%d",f);
    printf("\n");
    for(i=1;i<f;i++)
    {
        printf("%d ",k[i]);
    }
    int temp;
    for(i=1;i<f;i++)
    {
        for(j=i+1;j<f;j++)
        {
            if(k[i]>=k[j])
            {
                temp=k[i];
                k[i]=k[j];
                k[j]=temp;
            }
        }
    }
    printf("\n");
    for(i=1;i<f;i++)
    {
        printf("%d ",k[i]);
    }
    int r,t[900][900],h=b;
    for(i=1;i<f;i++)
    {
        r=k[i];
        for(j=1;r!=0;j++)
        {
            t[i][h]=r%2;
            r=r/2;
            h--;
        }
        h=b;
    }
    printf("\n");
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=b;j++)
        {
            printf("%d ",t[i][j]);
        }
        printf("\n");
    }

    return 0;
}