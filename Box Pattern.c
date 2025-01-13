// Online C compiler to run C program online
// In this code there is no statement
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,j;
    int a=n-1,b=2;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1 || j==1 ||i==n||j==n)
            {
                printf("& ");
            }
            else if(i==a || j==a ||i==2||j==2)
            {
                printf("* ");
            }
            else
            {
                printf(". ");
            }
        }
        printf("\n");
    }

    return 0;
}