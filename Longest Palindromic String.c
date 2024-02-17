// Online C compiler to run C program online
/*The program must accept N string values as the input. The program must print the length of the longest palindromic string among the N string values as the output. 
Note: - 
-Each string value contains only lower case alphabets. 
- At least one palindromic string is always present in the given N string values.
 Boundary Condition(s): 
1 <= N <= 100 
1 <= Length of each string <= 1000 
Input Format: 
The first line contains N. 
The next N lines, each containing a string value. 
Output Format: 
The first line contains the length of the longest palindromic string among the N string values. Example Input/Output 1:
 Input:
 5 
abcdefg 
eye
engine 
madam 
environment 
Output:
 5
 Explanation: 
Here, the palindromic string values are eye and madam.
 madam is the longest palindromic string whose length is 5, so 5 is printed as the output. 
Example Input/Output 2:
 Input: 
4 
book 
redder 
rotor 
wow 
Output: 
6
*/

#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,r=0,k,j,c=0,y,q=1;
    int s[900];
    for(i=1;i<=n;i++)
    {
        char a[900];
        printf("\nenter the string:");
        scanf("%s",a);
        for(j=0;a[j];j++)
        {
            r++;
        }
        for(k=r-1;k>=0;k--)
        {
            printf("\n%c ",a[k]);
        }
        int u=r-1;
        for(y=0;a[y];y++)
        {
            printf("\n%c %c ",a[y],a[u-y]);
           if(a[y]==a[u-y])
           {
               c++;
           }
        }
        printf("\n %d : %d",r,c);
        if(c==r)
        {
            printf("\n%s",a);
            s[q]=c;
            q++;
            
        }
        r=0;
        c=0;
    }
    printf("\n");
    for(i=1;i<q;i++)
    {
        printf("%d ",s[i]);
    }
    printf("\n");
    int N=s[1];
    for(i=1;i<q;i++)
    {
       if(N<s[i])
       {
           N=s[i];
       }
    }
    printf("\n%d",N);
    

    return 0;
}