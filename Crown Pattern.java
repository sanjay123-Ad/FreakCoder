// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/* The program must accept an odd integer N as the input. 
The program must print a grid of characters representing the crown pattern based on the following conditions.
 - The number of rows R in the grid must be (N-1)/2. 
- The number of columns C in the grid must be N.
 - In the 1st row of the grid, the first column, the middle column and the last column have the asterisks (*). The remaining columns in the 1st row have the plus symbols (+). 
- In the 2nd row of the grid, the first column, the middle column and the last column have the hash symbols (#). The remaining columns in the 2nd row have the plus symbols (+).
- In the 3rd row of the grid, the first 2 columns, the middle 3 columns and the last 2 columns have the hash symbols (#). The remaining columns in the 3rd row have the plus symbols (+). 
- In the 4th row of the grid, the first 3 columns, the middle 5 columns and the last 3 columns have the hash symbols (#). The remaining columns in the 4th row have the plus symbols (+). 
- Similarly, the first R - ((R-1)/2) lines of the grid (consider the integer division for / operation). 
- The remaining rows of the grid have only hash symbols (#). 
Finally, the program must print the RxC grid as the output. 
Boundary Condition(s): 
7 <= N <= 99 
Input Format: 
The first line contains N. 
Output Format: 
The first R lines, each contains C characters based on the given conditions. 
Example Input/Output 1: 
Input: 
11 
Output: 
*++++*++++* 
#++++#++++# 
##++###++## 
########### 
###########
*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j,f,m1,m2,l;
        f=1;
        m1=n/2+1;
        m2=n/2+1;
        l=n;
        for(i=1;i<=(n-1)/2;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1)
                {
                    if(j==1 || j==n/2+1 || j==n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("+");
                    }
                }
                else
                {
                    if(j<=f || j>=m1 && j<=m2 ||j>=l)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print("+");
                    }
                }
            }
            if(i>1)
            {
                f++;
                l--;
                m1--;
                m2++;
            }
            System.out.println();
        }
    }
}