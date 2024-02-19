// Online C compiler to run C program online
/*The program must accept a string S as the input. The program must print the ASCII values of all the characters in the string S as shown in the Example Input/Output section. 
Boundary Condition(s):
 2 <= Length of S <= 100
 Input Format: 
The first line contains S.
 Output Format: 
The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1: 
Input: 
mark 
Output: 
********109
******97***
 ***114*****
 107********
 Example Input/Output 2:
 Input:
 SkillRack
 Output: 
 *********************83
 ******************107**
 ***************105***** 
 ************108******** 
 *********108***********
 *******82**************
 *****97**************** 
***99****************** 
107********************
*/

#include <stdio.h>

int main() {
    // Write C code here
    char s[900];
    scanf("%s",s);
    int i,j,c,x[900],g=1,d=0,r=0,T[900],v=1;
    for(i=0;s[i];i++)
    {
       c=s[i];
       x[g]=c;
       g++;
       int a=c;
       while(a!=0)
       {
           a/=10;
           d++;
           r++;
       }
       T[v]=r;
       r=0;
       v++;
    }
    for(i=1;i<g;i++)
    {
        printf("\n%d : %d ",x[i],T[i]);
    }
    printf("\n%d",d);
    printf("\n");
    int tot=T[1],w=1;
    printf("\n");
    for(i=1;i<g;i++)
    {
        for(j=1;j<=d;j++)
        {
           int u;
           u=d-tot;
           if(j>u && w<=T[i] )
           {
               if(w==T[i])
               {
                   printf("%d ",x[i]);
               }
               w++;
           }
           else
           {
               printf("* ");
           }
        }
        tot+=T[i+1];
        w=1;
        printf("\n");
    }
 

    
    return 0;
}
