/* The program must accept a matrix of size R*C and sort the integers in the matrix. 
Then the program must print the integer values in the sorted matrix. 
Boundary Condition(s): 
2 <= R, C <= 100
 Input Format: 
The first line contains R and C separated by a space. 
The next R lines, each containing C integer values separated by a space. 
Output Format: 
The first R lines, each containing C integer values separated by a space. 
Example Input/Output 1:
 Input:
 3 3 
66 6 69 
34 45 54
 36 7 77
 Output:
 6 7 34 
36 45 54 
66 69 77 
Example Input/Output 2:
 Input:
 4 5 
39 22 20 98 68
 28 52 30 57 58 
57 97 46 23 76 
53 70 44 51 95
 Output: 
20 22 23 28 30 
39 44 46 51 52 
53 57 57 58 68 
70 76 95 97 98


*/


// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code h
    int a,b;
    scanf("%d%d",&a,&b);
    int i,j,k,l,s[1000][1000];
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=b;j++)
        {
            printf("Enter the num[%d][%d]:",i,j);
            scanf("%d",&s[i][j]);
        }
    }
    int f[1000],p=1;
   for(i=1;i<=3;i++)
   {
       for(j=1;j<=3;j++)
       {
          f[p]=s[i][j];
          p++;
       }
   }
   for(i=1;i<p;i++)
   {
       printf("%d ",f[i]);
   }
   int temp;
   for(i=1;i<p;i++)
   {
       for(j=i+1;j<p;j++)
       {
           if(f[i]>f[j])
           {
               temp=f[i];
               f[i]=f[j];
               f[j]=temp;
           }
       }
   }
   printf("\n");
   for(i=1;i<p;i++)
   {
       printf("%d ",f[i]);
   }
   printf("\n");
   int v=1;
   for(i=1;i<=a;i++)
   {
       for(j=1;j<=b;j++)
       {
           s[i][j]=f[v];
           v++;
       }
   }
   printf("\n");
   for(i=1;i<=a;i++)
   {
       for(j=1;j<=b;j++)
       {
           printf("%d ",s[i][j]);
       }
       printf("\n");
   }

    return 0;
}