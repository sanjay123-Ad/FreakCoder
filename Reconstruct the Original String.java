/*A string S is given in a matrix format of size R*C in a vertical zig-zag fashion. The empty cells are denoted by a hyphen. The program must reconstruct the original value of S and print that as the output. 
Boundary Condition(s): 
1 <= R, 
C <= 100 
1 <= Length of S <= 10^4 
Input Format: 
The lines, each contains the characters. 
Output Format: The first line contains S. 
Example Input/Output 1: 
Input: 
sckms 
kapa- 
irrr- 
llog- 
Output: 
skillrackprograms 
Explanation: 
There are 4 rows in the given matrix, so the value of R = 4. There are 5 columns in the given matrix, so the value of C = 5. The characters present in the vertical zig-zag fashion are given below. 
s k i l l r a c k p r o g r a m s - - -  The orginal value of S is skillrackprograms, which is printed as the output.
Example Input/Output 2: 
Input: 
ChBe-r 
aco-Pe 
nr--e- 
do-tnp 
ltoop- 
e-kna- 
Output: 
CandletorchBooknotePenpaper
*/
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String[] line=new String[9000];
		int a=1;
        while (sc.hasNextLine()) {
            line[a] = sc.nextLine();
            if (line[a].isEmpty()) {
                break;
            }
            a++;
            
        }
       int[] len=new int[9000];
       for(int i=1;i<a;i++)
       {
           len[i]=line[i].length();
       }
       for(int i=1;i<a;i++)
       {
           System.out.println(line[i]+" "+len[i]);
           
       }
       if(a-1!=1)
       {
       char[][] C=new char[900][900];
       for(int i=1;i<a;i++)
       {
           char[] ch=line[i].toCharArray();
           for(int j=0;j<ch.length;j++)
           {
               
               C[i][j]=ch[j];
               
               
           }
          
       }
       char[][] up=new char[900][900];
       for(int i=1;i<a;i++)
       {
           for(int j=0;j<len[i];j++)
           {
               
               up[j][i]=C[i][j];
           }
           
           
       }
      
       for(int i=0;i<len[2];i++)
       {
           if(i%2==0)
           {
               for(int j=1;j<a;j++)
           {
               if(up[i][j]!='-')
               {
                    System.out.print(up[i][j]+" ");
               }
           }
          
           }
           else{
               for(int j=a-1;j>=1;j--)
               {
                   if(up[i][j]!='-')
               {
                    System.out.print(up[i][j]+" ");
               }
               }
           }
           
       }
       }
       else{
           for(int i=1;i<a;i++)
           {
               char[] ch=line[i].toCharArray();
               for(int j=0;j<ch.length;j++)
           {
               
               if(ch[j]!='-')
               {
                   System.out.print(ch[j]);
               }
           }
           }
       }
      
      
         
	}
}