/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

/********************************************************************************/
/* The program must accept N string values containing only alphabets as the input. The program must sort the given string values in descending order based on the number of upper case alphabets. If two or more string values have the same number of upper case alphabets, then the program must sort those string values in the order of their occurrence. Finally, the program must print the N sorted string values as the output. 
Boundary Condition(s): 
2 <= N <= 50 
1 <= Length of each string <= 100 
Input Format: 
The first line contains N. 
The next N lines, each contains a string value. 
Output Format: 
The first N lines, each contains a string value after sorting based on the given conditions. 
Example Input/Output 1: 
Input: 
3 
APple 
BaSkeT 
sKaTeBoArD 
Output: 
sKaTeBoArD 
BaSkeT 
APple 
Explanation: 
The number of upper case alphabets in APple is 2. 
The number of upper case alphabets in BaSkeT is 3. 
The number of upper case alphabets in sKaTeBoArD is 5. 
After sorting the string values in descending order based on the number of upper case alphabets, the string values become sKaTeBoArD BaSkeT APple 
Example Input/Output 2: 
Input: 
6 
cANDLe 
DOG 
penCIL 
BooK 
PLASTIc 
game 
Output: 
PLASTIc 
cANDLe 
DOG 
penCIL 
BooK 
game
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		   Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] s=new String[9000];
        int i;
        int[] arr=new int[9000];
        int[] occ=new int[9000];
        for(i=1;i<=n;i++)
        {
            s[i]=in.next();
            arr[i]=0;
            occ[i]=i;
        }
        
        for(i=1;i<=n;i++)
        {
            char[] ch=s[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if (Character.isUpperCase(ch[j]))
                {
                    arr[i]++;
                }
            }
        }
        for(i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                    int t1=occ[i];
                    occ[i]=occ[j];
                    occ[j]=t1;
                }
                else if(arr[i]==arr[j])
                {
                    if(occ[i]>occ[j])
                    {
                         int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                    int t1=occ[i];
                    occ[i]=occ[j];
                    occ[j]=t1;
                    }
                }
            }
        }
        for(i=1;i<=n;i++)
        {
            System.out.println(s[i]+" "+arr[i]+" "+occ[i]);
        }
	}
}
