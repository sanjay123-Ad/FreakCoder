// Online C compiler to run C program online
/*The program must accept the length L and the breadth B of N rectangles as the input. The program must find the area of N rectangles. Then the program must sort the N rectangles in ascending order based on their area. If two or more rectangles have the same area, the program must sort N rectangles in ascending order based on their length. Finally, the program must print the length, the breadth and the area of the sorted rectangles as the output. 
Boundary Condition(s): 
1 <= N <= 100 
1 <= L, B <= 100 
Input Format: 
The first line contains N. 
The next N lines, each contains the length and the breadth of a rectangle. 
Output Format: 
The first N lines, each contains the length and the breadth of a rectangle after sorting. 
Example Input/Output 1: 
Input: 
5 
5 7 
2 5 
3 2 
2 3 
4 6 
Output: 
2 3 6 
3 2 6 
2 5 10 
4 6 24 
5 7 35 
Explanation: 
The area of the first rectangle is 35 (5*7). 
The area of the second rectangle is 10 (2*5). 
The area of the third rectangle is 6 (3*2). 
The area of the fourth rectangle is 6 (2*3). 
The area of the fifth rectangle is 24 (4*6). 
After sorting the rectangles based on the given conditions, the rectangles become 
2 3 6 
3 2 6 
2 5 10 
4 6 24 
5 7 35 
*/
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,s[9000],k[9000];
    for(i=1;i<=n;i++)
    {
        printf("enter the num :%d",i);
        scanf("%d %d",&s[i],&k[i]);
    }
    int o[9000];
    for(i=1;i<=n;i++)
    {
        o[i]=s[i]*k[i];
    }
    for(i=1;i<=n;i++)
    {
        printf("\n%d",o[i]);
    }
    int j;
    for(i=1;i<=n;i++)
    {
        for(j=i+1;j<=n;j++)
        {
            if(o[i]>o[j])
            {
                int temp;
                temp=o[i];
                o[i]=o[j];
                o[j]=temp;
                int temp1;
                temp1=s[i];
                s[i]=s[j];
                s[j]=temp1;
                int temp2;
                temp2=k[i];
                k[i]=k[j];
                k[j]=temp2;
            }
            if(o[i]==o[j])
            {
                if(s[i]>s[j])
                {
                     int temp;
                temp=o[i];
                o[i]=o[j];
                o[j]=temp;
                int temp1;
                temp1=s[i];
                s[i]=s[j];
                s[j]=temp1;
                int temp2;
                temp2=k[i];
                k[i]=k[j];
                k[j]=temp2;
                    
                }
            }
        }
    }
    for(i=1;i<=n;i++)
    {
        printf("\n%d %d %d",s[i],k[i],o[i]);
    }

    return 0;
}