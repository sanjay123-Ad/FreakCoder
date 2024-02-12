// Online C compiler to run C program online
/*The program must accept N integers and an integer X. The program must print the count C of multiples of X (which are greater than X) after the first occurrence of X.
 Boundary Condition(s): 
1 <= N <= 1000
 1 <= X, Each integer value <= 10^8 
Input Format: 
The first line contains N and X separated by a space.
 The second line contains N integer values separated by a space.
 Output Format: 
The first line contains C. 
Example Input/Output 1:
 Input:
 6 100 
500 100 200 100 600 545 
Output: 
2 
Explanation: 
200 and 600 are the multiples. The second 100 is not counted as the multiples must be greater than X. 
Example Input/Output 2: 
Input:
 6 50 
500 100 200 100 600 50 
Output:
 0
*/
#include <stdio.h>

int main() {
    // Write C code here
    int n,x;
    scanf("%d%d",&n,&x);
    int i,s[9000];
    for(i=1;i<=n;i++)
    {
        printf("Enter the num [%d]: ",i);
        scanf("%d",&s[i]);
    }
    int c=0;
    int y=0;
    for(i=1;i<=n;i++)
    {
        if(x==s[i])
        {
            y=1;
        }
        if(y==1)
        {
            if(s[i]>x && s[i]%x==0)
            {
                c++;
            }
       }
    }
    printf("%d ",c);
    
    return 0;
}