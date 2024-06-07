// Online C compiler to run C program online
/*You must implement the function leftShiftUnitDigits(int arr[], int N) which accepts an integer array arr and it's size N as the input. The function must modify the integer array arr by shifting the unit digits of N integers to the left by one position. 
Boundary Condition(s): 
2 <= N <= 100 
1 <= Each integer value <= 10^8 
Example Input/Output 1: 
Input: 
5
24 987 1 9870 15 
Output: 
Example Input/Output 2: 
Input: 
6 
987 168 1 2 3 133 
Output: 
988 161 2 3 3 137
*/
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int arr[9000];
    int i;
    for(i=1;i<=n;i++)
    {
        printf("enter the num %d:",i);
        scanf("%d",&arr[i]);
    }
     for(i=1;i<=n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
    // targetting the unit digit
    int t[900];
    for(i=1;i<=n;i++)
    {
        t[i]=arr[i]%10;
    }
    for(i=1;i<=n;i++)
    {
        printf("%d ",t[i]);
    }
    int temp=t[1];
    for(i=1;i<n;i++)
    {
        t[i]=t[i+1];
    }
    t[n]=temp;
    printf("\n");
     for(i=1;i<=n;i++)
    {
        printf("%d ",t[i]);
    }
    for(i=1;i<=n;i++)
    {
        arr[i]=arr[i]/10;
        arr[i]=arr[i]*10+t[i];
    }
    printf("\n");
     for(i=1;i<=n;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}