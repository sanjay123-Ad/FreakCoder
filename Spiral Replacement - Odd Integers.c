// Online C compiler to run C program online
/*The program must accept an integer matrix of size NxN and a string S as the input. The program must traverse the matrix spirally in the anti-clockwise direction and replace all the odd integers with the alphabets in S. If the number of odd integers is greater than the length of S, the program starts replacing the odd integers with the alphabets in S circularly(i.e., after the last character, start replacing from the first character in S). Finally, the program must print the modified matrix as the output. 
Boundary Condition(s): 
2 <= N <= 50 
1 <= Length of S <= 100 
Input Format: 
The first line contains N. 
The next N lines, each contains N integers separated by a space. 
The (N+2)nd line contains S. 
Output Format: 
The first N lines contain the modified matrix separated by a space. 
Example Input/Output 1: 
Input: 
3
7 8 9 
6 3 4 
1 5 7 
rock 
Output: 
r 8 r 
6 o 4
o c k 
Explanation: In the given 3x3 matrix, the odd integers are highlighted below. 
7 8 9 
6 3 4 
1 5 7 
The number odd integers in the matrix is 6 which is greater than the length of the string rock. 
Therefore, when traversing the matrix spirally in the anti-clockwise direction, the odd integers and their replacement characters are given below. 
7 -> r 
1 -> o 
5 -> c 
7 -> k 
9 -> r 
(after the last character, start replacing from the first character in S) 3 -> o So the matrix becomes 
r 8 r 
6 o 4 
o c k 
Example Input/Output 2: 
Input: 
6 
12 23 34 4 6 89 
31 55 45 15 87 91 
63 74 32 44 98 86 
23 43 56 87 99 54 
11 34 56 88 98 45 
34 44 46 88 67 54
ENVIRONMENT 
Output: 
12 E 34 4 6 M 
E N I V N N 
N 74 32 44 98 86 
V T 56 R E 54
I 34 56 88 98 O
 34 44 46 88 R 54 
Example Input/Output 3: 
Input: 
2 
65 71 
23 16 
Apple 
Output: 
A p 
p 16
*/

#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,j,s[900][900];
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("enter the num [%d][%d]:",i,j);
            scanf("%d",&s[i][j]);
        }
    }
    int u[900][900];
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
           u[i][j]=s[i][j];
        }
    }
    
     for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("%d ",s[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    int z=0;
    char k[9000];
    printf("Enter the string :");
    scanf("%s",k);
    int r=0;
    for(i=0;k[i];i++)
    {
        r++;
    }
    int w,h=2;
    if(n%2==0)
    {
        w=n/2;
    }
    else
    {
        w=n/2;
        w++;
    }
    int m[9000],q[9000],T=1;
    int b=n,a=1,c=a,o=a+1;
    H:
    for(i=a;i<=b;i++)
    {
        int t=s[i][c];
        if(z>=r)
        {
            z=0;
        }
        if(t%2!=0)
        {
            s[i][c]=k[z];
            z++;
            m[T]=i;
            q[T]=c;
            T++;
            
        }
    }
    c=b;
    for(i=a+1;i<=b;i++)
    {
        int t=s[c][i];
        if(z>=r)
        {
            z=0;
        }
        if(t%2!=0)
        {
            s[c][i]=k[z];
            z++;
            m[T]=c;
            q[T]=i;
            T++;
            
        }
        
    }
    for(i=b-1;i>=a;i--)
    {
        int t=s[i][c];
        if(z>=r)
        {
            z=0;
        }
        if(t%2!=0)
        {
            s[i][c]=k[z];
            z++;
            m[T]=i;
            q[T]=c;
            T++;
        }
    }
    c=a;
    for(i=b-1;i>=a+1;i--)
    {
        int t=s[c][i];
        if(z>=r)
        {
            z=0;
        }
        if(t%2!=0)
        {
            s[c][i]=k[z];
            z++;
            m[T]=c;
            q[T]=i;
            T++;
        }
    }
    a++;
    b--;
    c=a;
    if(h<=w)
    {
        h++;
        goto H;
    }
    for(i=1;i<T;i++)
    {
        for(j=i+1;j<T;j++)
        {
            if(m[i]>m[j])
            {
                int temp1,temp2;
                temp1=m[i];
                temp2=q[i];
                m[i]=m[j];
                q[i]=q[j];
                m[j]=temp1;
                q[j]=temp2;
            }
            if(m[i]==m[j])
            {
                if(q[i]>q[j])
                {
                int temp1,temp2;
                temp1=m[i];
                temp2=q[i];
                m[i]=m[j];
                q[i]=q[j];
                m[j]=temp1;
                q[j]=temp2;
                    
                }
            }
        }
    }
    int y=1;
    
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
           if(i==m[y] && j==q[y])
           {
               printf("%c ",s[i][j]);
               y++;
           }
           else
           {
               printf("%d ",s[i][j]);
           }
        }
        printf("\n");
    }
    
    return 0;
}
