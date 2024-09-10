/*In a video game, a boy has four options to move in the four directions U, D, L and R representing Up, Down, Left and Right directions. The initial position of the boy is always (0, 0). The program must accept a string S containing only U, D, L and R (both upper case and lower case) as the input. The program must print YES if the boy returns to the starting position after finishing all the moves. Else the program must print NO as the output. 
Boundary Condition(s): 
2 <= Length of S <= 1000 
Input Format: 
The first line contains S. 
Output Format: 
The first line contains YES or NO. 
Example Input/Output 1: 
Input: 
URdL 
Output: 
YES 
Explanation: 
The initial position of the boy is (0, 0). In the first move U, the boy moves up. So the current position of the boy becomes (0, 1). In the second move R, the boy moves right. So the current position of the boy becomes (1, 1). In the third move d, the boy moves down. So the current position of the boy becomes (1, 0). In the fourth move L, the boy moves left. So the current position of the boy becomes (0, 0). After finishing all the moves, the final position of the boy is (0, 0) which is the starting position. So YES is printed as the output. 
Example Input/Output 2: 
Input: 
dddlruuuu 
Output: 
NO
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int i;
        char[] ch=s.toCharArray();
        int a=0,b=0;
        for(i=0;i<s.length();i++)
        {
            if(ch[i]=='R' || ch[i]=='r')
            {
        
                a++;
               
            }
            else if(ch[i]=='U'||ch[i]=='u')
            {
                b++;
                
            }
            else if(ch[i]=='L'||ch[i]=='l')
            {
                a--;
                
            }
            else if(ch[i]=='D'||ch[i]=='d')
            {
                b--;
               
            }
        }
        if(a==0 && b==0)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println(a+" "+b);
        }
        
    }
}