// Online C compiler to run C program online
/*In a dice roll game, when a player rolls a die and gets 6, he gets another chance to roll the die. Two players A and B are playing the game and the player A always starts the game. If a player gets X on the die, then he/she gets X points. The program must accept N integers representing the results of the dice roll by the two players as the input. The program must print the total points earned by the players A and B as the output. 
Boundary Condition(s): 
2 <= N <= 100 
1 <= Each integer value <= 6 
Input Format: 
The first line contains N. 
The next N lines, each contains an integer. 
Output Format: 
The first line contains two integers representing the total points earned by the players A and B. 
Example Input/Output 1: 
Input: 
4 
1 
6 
3 
4 
Output: 
5 9 
Explanation: 
The player A rolls the die and gets 1. The player B rolls the die and gets 6 and gets another chance to roll the die, so the player B rolls the die and gets 3. The player A rolls the die and gets 4. The total points earned by the player A is 5 (1 + 4). The total points earned by the player B is 9 (6 + 3). Hence the output is 5 9 Example 
Input/Output 2: 
Input: 
5 
1 
5 
4 
6 
4 
Output: 
5 15
*/
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,s[9000];
    for(i=1;i<=n;i++)
    {
        scanf("%d",&s[i]);
    }
    int a=1;
    int k[9000];
    k[1]=0,k[2]=0;
    for(i=1;i<=n;i++)
    {
        if(s[i]==6)
        {
            if(a==0)
            {
                k[2]+=s[i];
                a=0;
            }
            else
            {
                k[1]+=s[i];
                a=1;
            }
        }
        else if(a==1)
        {
            k[1]+=s[i];
            a=0;
        }
        else
        {
            k[2]+=s[i];
            a=1;
        }
       
    }
     printf("%d %d",k[1],k[2]);
    return 0;
}