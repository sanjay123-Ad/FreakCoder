/*The program must accept an array of N integers and an integer K as the input. The program must perform the following processes K times. - The program must shift the even integers in the array by 1 position to the left (the odd integers remain in the same positions). - Then the program must print the integers in the modified array as the output. Note: At least two even integers are always present in the given N integers. 
Boundary Condition(s): 
2 <= N <= 100 
1 <= K <= N 
1 <= Each integer value <= 1000 
Input Format: 
The first line contains N and K separated by a space. 
The second line contains N integer values separated by a space. 
Output Format: 
The first K lines, each contains N integers separated by a space. 
Example Input/Output 1: 
Input: 
6 3 
42 15 66 72 27 32 
Output: 
66 15 72 32 27 42 
72 15 32 42 27 66 
32 15 42 66 27 72 
Explanation: 
Here N = 6 and K = 3. Initially, the integers in the array are 42 15 66 72 27 32. After shifting the even integers by 1 position to the left, the integers in the array become 66 15 72 32 27 42. So they are printed in the first line. After shifting the even integers by 1 position to the left, the integers in the array become 72 15 32 42 27 66. So they are printed in the second line. After shifting the even integers by 1 position to the left, the integers in the array become 32 15 42 66 27 72. So they are printed in the third line. 
Example Input/Output 2: 
Input: 
5 1 
6 17 22 18 11 
Output: 
22 17 18 6 11
*/
// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
        int n,k;
        scanf("%d %d",&n,&k);
        int s[9000],fin[9000];
        int i;
        for(i=1;i<=n;i++)
        {
            scanf("%d",&s[i]);
        }
        int j,h=1;
        for(i=1;i<=k;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(s[j]%2==0)
                {
                    fin[h]=s[j];
                    h++;
                }
            }
            int a=fin[1];
            for(int v=2;v<h;v++)
            {
                fin[v-1]=fin[v];
            }
            fin[h-1]=a;
            int q=1;
            for(int g=1;g<=n;g++)
            {
                if(s[g]%2==0)
                {
                    s[g]=fin[q];
                    q++;
                }
            }
            for(int b=1;b<=n;b++)
            {
                printf("%d ",s[b]);
            }
            printf("\n");
        }

    return 0;
}