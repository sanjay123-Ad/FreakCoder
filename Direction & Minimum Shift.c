// Online C compiler to run C program online
/*The program must accept two string values S1 and S2 as the input. The string S2 represents the rotated version of the string S1. The program must find the minimum number of characters M that must be shifted (Left or Right) in S1 to convert S1 to S2. Then the program must print the direction (L-Left or R-Right or A-Any direction) in which the characters in the string S1 are shifted and the value of M as the output. The direction A represents that the string S1 can be converted to S2 in both directions with the same value M. 
Boundary Condition(s): 
2 <= Length of S1, S2 <= 100 
Input Format: 
The first line contains S1. 
The second line contains S2. Output Format: The first line contains a character (L or R or A) and M. 
Example Input/Output 1: 
Input: 
hello 
llohe 
Output: 
L2 
Explanation: 
Here S1 = hello and S2 = llohe. If 3 characters in S1 are shifted to the right, it becomes llohe. If 2 characters in S1 are shifted to the left, it becomes llohe. Here the minimum is 2, so L2 is printed as the output. 
Example Input/Output 2: 
Input: 
IcecrEAm 
EAmIcecr 
Output: 
R3 

*/


#include <stdio.h>
#include <string.h>
int main() {
    // Write C code here
    char c1[9000];
    scanf("%s",c1);
    char c2[9000];
    scanf("%s",c2);
    char l[900];
    int y=0;
    for(int i=0;c2[i];i++)
    {
        l[i]=c2[i];
        y++;
        
    }
   int a=strlen(c2);
    int i,f=1,p=1;
    int fir=strcmp(c1,c2);
    if(fir!=0)
    {
    H:
    char t=c2[0];
    for(i=0;c2[i];i++)
    {
        c2[i]=c2[i+1];
    }
    c2[a-1]=t;
  
    int b=strcmp(c1,c2);
    if(b!=0)
    {
        f++;
        goto H;
    }
    printf("\n%d",f);
    J:
    char g=l[y-1];
    for(i=y-1;i>0;i--)
    {
        l[i]=l[i-1];
    }
    l[0]=g;
   
    int c =strcmp(c1,l);
    if(c!=0)
    {
        p++;
        goto J;
    }
    printf("\n%d",p);
    }
    else
    {
        p--;
        f--;
    }
    if(p==f)
    {
        printf("A%d",p);
    }
    else if(f<p)
    {
        printf("R%d",f);
    }
    else
    {
        printf("L%d",p);
    }
    

    return 0;
}