// Online C compiler to run C program online
/*The program must accept N integers as the input. The program must sort the integers based on the frequency (i.e., the number of occurrences). If more than one integers have the same frequency, then the program must sort those integers in ascending order. Finally, the program must print the sorted integers as the output. 
Boundary Condition(s): 
2 <= N <= 100 
1 <= Each integer value <= 10^8 
Input Format: 
The first line contains N. 
The second line contains N integers separated by a space. 
Output Format: 
The first line contains N integers representing the sorted integers. 
Example Input/Output 1: 
Input: 
6 
10 20 30 20 10 10 
Output: 
30 20 20 10 10 10 
Explanation: 
After sorting the 6 integers based on the frequency, the integers become 30, 20, 20, 10, 10 and 10. Hence the output is 30 20 20 10 10 10 
Example Input/Output 2: 
Input: 
9 
880 91 880 91 91 1887 134 1887 880 
Output: 
134 1887 1887 91 91 91 880 880 880
*/

#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,s[900];
    for(i=1;i<=n;i++)
    {
        printf("enter the num %d :",i);
        scanf("%d",&s[i]);
    }
    int y=1,g[9000],j,v=0;
    
   
    int k[9000];
    for(i=1;i<=n;i++)
    {
        k[i]=s[i];
    }
    for(i=1;i<=n;i++)
    {
        for(j=i+1;j<=n;j++)
        {
            if(s[i]==s[j])
            {
                s[j]=0;
            }
            
        }
    }
    printf("\n");
    for(i=1;i<=n;i++)
    {
        printf("%d ",s[i]);
    }
    for(i=1;i<=n;i++)
    {
        if(s[i]!=0)
        {
            g[y]=s[i];
            y++;
        }
    }
    printf("\n");
    for(i=1;i<y;i++)
    {
        printf("%d ",g[i]);
    }
    printf("\n");
    for(i=1;i<=n;i++)
    {
        printf("%d ",k[i]);
    }
    printf("\n");
    int o[9000],o1[9000],r=1,a=0;
    for(i=1;i<y;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(g[i]==k[j])
            {
                a++;
            }
        }
        o[r]=a;
        o1[r]=g[i];
        a=0,r++;
    }
    printf("\n");
    for(i=1;i<r;i++)
    {
        printf("%d ",o[i]);
    }
    printf("\n");
     for(i=1;i<r;i++)
    {
        printf("%d ",o1[i]);
    }
    printf("\n");
    for(i=r;i>=1;i--)
    {
        for(j=1;j<=o[i];j++)
        {
            printf("%d ",o1[i]);
        }
    }
    for(i=1;i<r;i++)
    {
        for(j=i+1;j<r;j++)
        {
            if(o[i]>o[j])
            {
                int temp,temp1;
                temp=o[i];
                temp1=o1[i];
                o[i]=o[j];
                o1[i]=o1[j];
                o[j]=temp;
                o1[j]=temp1;
            }
            if(o[i]==o[j])
            {
                if(o1[i]>o1[j])
                {
                    int temp,temp1;
                temp=o[i];
                temp1=o1[i];
                o[i]=o[j];
                o1[i]=o1[j];
                o[j]=temp;
                o1[j]=temp1;
                }
            }
        }
    }
     printf("\n");
    for(i=1;i<r;i++)
    {
        printf("%d ",o[i]);
    }
    printf("\n");
     for(i=1;i<r;i++)
    {
        printf("%d ",o1[i]);
    }
    printf("\n");
     for(i=1;i<r;i++)
    {
        for(j=1;j<=o[i];j++)
        {
            printf("%d ",o1[i]);
        }
    }
    
    
    return 0;
}