/*The program must accept N pairs of integers as the input. Each pair contains two integers representing the starting point S and the ending point E of a path. The program must print YES if a cyclic path is formed by connecting all the N paths. Else the program must print NO as the output. The two paths P1 and P2 can be connected only if the end point of P1 is equal to the starting point of P2. 
Boundary Condition(s): 
2 <= N <= 20 -100 <= E, 
P <= 100 
Input Format: 
The first line contains the value of N. 
The next N lines contain two integers on each line separated by a space. 
Output Format: 
The first line contains either YES or NO. 
Example Input/Output 1: 
Input: 
4 
2 3 
5 1 
3 5 
1 2 
Output: 
YES 
Explanation: The cyclic path formed using the 4 paths is given below. 2 -> 3 -> 5 -> 1 -> 2 So YES is printed as the output. 
Example Input/Output 2: 
Input: 
4 
-2 -4 
-3 -1 
-4 -3 
-1 2 
Output: NO
*/

// Online C compiler to run C program online
#include <stdio.h>

int main() {

        int n;
        scanf("%d",&n);
        int k[9000],s[9000];
        int i,j;
        for(i=1;i<=n;i++)
        {
            scanf("%d %d",&s[i],&k[i]);
        }
        
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(k[i]==s[j])
                {
                    int temp1,temp2;
                    temp1=s[i+1];
                    s[i+1]=s[j];
                    s[j]=temp1;
                    temp2=k[i+1];
                    k[i+1]=k[j];
                    k[j]=temp2;
                }
            }
        }
        for(i=1;i<=n;i++)
        {
            printf("%d %d\n",s[i],k[i]);
        }
       if(s[1]==k[n])
       {
           printf("YES");
       }
       else
       {
           printf("NO");
       }


    return 0;
}