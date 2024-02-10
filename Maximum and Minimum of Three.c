

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


