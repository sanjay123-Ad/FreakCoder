#include <stdio.h>
#include<math.h>
con(X,N)
{
    // Write C code here
    int a,b;
    a=X,b=N;
    int i,j,u=a,y=a,r=0;
    while(y!=0)
    {
        y=y/10;
        r++;
    }
    int d=1,f[900];
    for(i=1;i<=r;i++)
    {
        f[d]=u%10;
        u=u/10;
        d++;
    }
    d=d-1;
    int t[900],c=1;
    for(i=d;c<=b;i--)
    {
       t[c]=f[i];
       c++;
    }
    int v=1;
    for(i=b;v<=b;i--)
    {
        t[c]=f[i];
        c++;
        v++;
    }
    int p=1;
    for(i=1;i<c;i++)
    {
        p++;
    }
    unsigned long long int tot=0,e=p-1;
    e=e-1;
    for(i=1;i<p;i++)
    {
        tot=tot+t[i]*pow(10,e);
        e=e-1;
    }
    return tot;
}
int main()
{
    int X,N;
    scanf("%d%d",&X,&N);
    printf("INTEGERS: %llu",con(X,N));
}