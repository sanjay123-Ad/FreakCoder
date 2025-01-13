// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
 int n;
 scanf("%d",&n);
 int i,a,s[9000],j;
 for(i=1;i<=n;i++)
 {
     a=i;
     for(j=1;a>0;j++)
     {
         s[j]=a%2;
         a/=2;
     }
     for(int k=j-1;k>=1;k--)
     {
         printf("%d",s[k]);
     }
     printf(" ");
 }

    return 0;
}