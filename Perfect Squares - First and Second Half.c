// Online C compiler to run C program online
#include <stdio.h>
#include<math.h>
int main() {
    // Write C code her
    int n,i,j,C=0;
    scanf("%d",&n);
    int a=n,b=n;
    while(a!=0)
    {
        a=a/10;
        C++;
    }
    int y=C/2;
    int s[900];
    for(i=C;i>=1;i--)
    {
        s[i]=b%10;
        b/=10;
    }
    int tot=0,p=1;
    int k[900];
    int d=1;
    int u=y-1;
    for(i=1;i<=C;i++)
    {
        for(j=i;p<=y;j++)
        {
            tot=tot+s[j]*pow(10,u);
            u=u-1;
            p++;
            i=i+1;
        }
        i=i-1;
        u=y-1;
        p=1;
        k[d]=tot;
        d++;
        tot=0;
    }
    for(i=1;i<d;i++)
    {
        printf("%d ",k[i]);
    }
    int F=0;
    for(i=1;i<d;i++)
    {
        
        int z=k[i];
        printf("\n%d",z);
        for(j=0;j<=z;j++)
        {
            if(j*j==z)
            {
                printf("\n%d : %d",j,z);
                F=F+1;
                break;
            }
        }
        
    }
    if(F==2)
    {
        printf("\nYES");
    }
    else
    {
        printf("\nNO");
    }
    

    return 0;
}
