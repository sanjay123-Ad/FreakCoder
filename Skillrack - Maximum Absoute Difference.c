#include <stdio.h>
#include<stdlib.h>

int main() {
    // Write C code here
    int n;
    int i,j;
    scanf("%d",&n);
    int s[900];
    for(i=1;i<=n;i++)
    {
        printf("enter the num[%d]:",i);
        scanf("%d",&s[i]);
    }
    int tot=0;
    int u=1,y[900];
    for(i=1;i<=n;i++)
    {
        if(i!=n)
        {
            tot=abs(s[i]-s[i+1]);
            y[u]=tot;
            tot=0;
            u++;
        }
    }
    for(i=1;i<u;i++)
    {
        printf("%d ",y[i]);
    }
    int o=y[1];
    for(i=1;i<u;i++)
    {
        if(o<=y[i])
        {
            o=y[i];
        }
    }
    printf("\n%d",o);

    return 0;
}
