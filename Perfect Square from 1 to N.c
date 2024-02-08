// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,s[900],a=1,b=1;
    for(i=1;b<=n;i++)
    {
        b=a*a;
        s[i]=b;
        a++;
    }
    for(i=1;i<a-1;i++)
    {
        printf("%d ",s[i]);
    }

    return 0;
}