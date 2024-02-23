// Online C compiler to run C program online
/*You must implement the function addWithPrevious(int arr[], int N) which accepts an integer array arr and its size N as the input. The function must modify the integer array arr by replacing each integer X by adding with its previous integer. The first integer in the array arr has no integers on its left side, so it remains the same.
 Example Input/Output 1: 
Input: 
5 
10 20 30 40 50 
Output: 
Array: 10 30 50 70 90 
Explanation: 
The first integer in the array has no integers on its left side, so it remains the same. 
The previous integer of 20 is 10. So their sum 30 (20+10) is replaced. 
The previous integer of 30 is 20. So their sum 50 (30+20) is replaced. 
The previous integer of 40 is 30. So their sum 70 (40+30) is replaced. 
The previous integer of 50 is 40. So their sum 90 (50+40) is replaced.
 Now the array becomes 10 30 50 70 90. 
Example Input/Output 2: 
Input:
4 
1 2 3 4 
Output: 
Array: 1 3 5 7
*/



#include <stdio.h>
int i,t[9000];
void a(int arr[],int N)
{
    t[1]=arr[1];
    for(i=1;i<=N;i++)
    {
        t[i+1]=arr[i]+arr[i+1];
    }
    for(i=1;i<=N;i++)
    {
        arr[i]=t[i];
    }
    
}
int main() {
    // Write C code here
    int N;
    scanf("%d",&N);
    int arr[N];
    for(i=1;i<=N;i++)
    {
        printf("enter the num %d :",i);
        scanf("%d",&arr[i]);
    }
    a(arr,N);
    printf("Array :");
    for(i=1;i<=N;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}