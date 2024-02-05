// Online C compiler to run C program online
#include <stdio.h>

int *get(int arr[],int N) {
    // Write C code here
   int i,j;
    int a,C=0,h[900],o=1;
    for(i=1;i<=N;i++)
    {
        a=arr[i];
        for(j=i+1;j<=N;j++)
        {
            if(a>arr[j])
            {
                C++;
            }
        }
        h[o]=C;
        o++;
        C=0;
    }
    int *new=h;
    return(new);

}
int main()
{
    int N,i;
    scanf("%d",&N);
    int arr[900];
    for(i=1;i<=N;i++)
    {
        printf("enter the num[%d]:",i);
        scanf("%d",&arr[i]);
    }
    int *result=get(arr,N);
    printf("INTEGERS:");
    for(i=1;i<=N;i++)
    {
        printf("%d ",result[i]);
    }
    return 0;
}
