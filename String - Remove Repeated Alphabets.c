// Online C compiler to run C program online
/*The program must accept a string S containing only alphabets as the input. The program must remove the repeated alphabets in the string S and print the modified string as the output. Note: At least one unique alphabet is always present in the string S. 
Boundary Condition(s): 
1 <= Length of S <= 1000 
Input Format:
 The first line contains S. 
Output Format: 
The first line contains the modified string S.
 Example Input/Output 1: 
Input: 
Engine
Output:
 gi 
Explanation:
 Here the string is engine, The alphabets e and n are repeated in the string engine, so they are removed from the string. 
Now the string becomes gi, so gi is printed as the output.
 Example Input/Output 2:
 Input: 
firefighter
 Output: 
fFght
*/

#include <stdio.h>
int main() {
    // Write C code here
    char s[9000];
    printf("enter the string :");
    scanf("%s",s);
    int i,j;
    for(i=0;s[i];i++)
    {
        printf("%c ",s[i]);
    }
    int c=0;
    for(i=0;s[i];i++)
    {
        c++;
    }
    printf("\n");
    char y[9000];
    for(i=0;i<c;i++)
    {
        y[i]=s[i];
   }
    for(i=0;i<c;i++)
    {
        for(j=i+1;j<c;j++)
        {
            if(s[i]==s[j])
            {
                y[i]='@';
                y[j]='@';
            }
        }
    }
    printf("\n");
    for(i=0;i<c;i++)
    {
        printf("%c ",y[i]);
    }
    char t[9000];
    int o=0;
    for(i=0;i<c;i++)
    {
        if(y[i]!='@')
        {
            t[o]=y[i];
            o++;
        }
    }
    printf("\n");
    for(i=0;i<o;i++)
    {
        printf("%c ",t[i]);
    }

    return 0;
}
