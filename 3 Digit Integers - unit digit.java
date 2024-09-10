/*The program must accept N integers as the input. For every three integers among the given N integers, the program must print the largest possible three-digit integer using their unit digits. If it is not possible to form a three-digit integer, then the program must print -1 as the output. Note: The value of N is always a multiple of 3. 
Boundary Condition(s): 
3 <= N <= 999 
0 <= Each integer value <= 10^8 
Input Format: 
The first line contains N. 
Output Format: 
The first line contains N/3 integer values separated by a space. 
Example Input/Output 1: 
Input: 
6 
988 54 19 87 64 25 
Output: 
984 754 
Explanation: 
The largest three-digit integer formed using the unit digits of 988 54 19 is 984. The largest three-digit integer formed using the unit digits of 87 64 25 is 754. Hence the output is 984 754 
Example Input/Output 2: 
Input: 
9 
2 50 18 590 10 890 87 68 18 
Output: 
820 -1 887
*/
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;s
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] s=new int[90000];
        int i;
        for(i=1;i<=n;i++)
        {
            s[i]=in.nextInt();
        }
        int[] arr=new int[9000];
        for(i=1;i<=n;i++)
        {
            arr[i]=s[i]%10;
            System.out.println(arr[i]);
        }
        int[] up=new int[9000];
        int[] tot=new int[9000];
        int a=1,j;
        for(i=1;i<=n/3;i++)
        {
            int g=1;
            for(j=a;g<=3;j++)
            {
                up[g]=arr[j];
                System.out.print(up[g]+" ");
                g++;
            }
            for(int k=1;k<=3;k++)
            {
                for(int o=k+1;o<=3;o++)
                {
                    if(up[k]<up[o])
                    {
                        int temp;
                        temp=up[k];
                        up[k]=up[o];
                        up[o]=temp;
                    }
                }
            }
            if(up[1]==0 && up[2]==0 && up[3]==0)
            {
                tot[i]=-1;
            }
            else
            {
            tot[i]=0;
            int b=2;
             for(j=1;j<=3;j++)
            {
                System.out.print(up[j]+" ");
                tot[i]+=up[j]*Math.pow(10,b);
                b--;
            }
            }
            a+=3;
            System.out.println(tot[i]);
        }
       
	}
}
