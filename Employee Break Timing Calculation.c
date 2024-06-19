// Online C compiler to run C program online
/*The program must accept the N entry time and exit time records of an employee during a day as the input. N records are given in chronological order. The opening time of the office will be the first entry time of the employee. The closing time of the office will be the last exit time of the employee. The program must print the total duration the employee takes the break based on the following format. X Hours Y Minutes If X is 1, then the format will be 1 Hour Y Minutes. 
Note: Entry time and exit time will be in the 24-hour format (HH:MM). 
Entry time and exit time do not occur at the same time. 
Boundary Condition(s): 
2 <= N <= 100 
Input Format: 
The first line contains N. 
The next N lines, each contains the entry time and exit time separated by a space. 
Output Format: 
The first line contains the total duration the employee takes the break. 
Example Input/Output 1: 
Input: 
2 
09:30 11:30 
11:45 14:00 
Output: 
0 Hours 15 Minutes 
Explanation: 
Here N = 2. 
The opening time of the office is 09:30. The closing time of the office is 14:00. 
In the first record, the employee will be inside the office for 2 Hours 0 Minutes. 
In the second record, the employee will be inside the office for 2 Hours 15 Minutes. 
The total duration the employee takes the break is 0 Hours 15 Minutes. Hence the output is 0 Hours 15 Minutes Example 
Input/Output 2: 
Input: 
4 
08:00 10:10 
10:30 13:50 
14:30 17:15 
17:25 19:11 
Output: 
1 Hour 10 Minutes
*/
#include <stdio.h>

int main() {
    // Write C code here
    int n;
    scanf("%d",&n);
    int i,s[9000],k[9000],S[90000],K[90000];
    for(i=1;i<=n;i++)
    {
        printf("\nthe first time %d :",i);
        scanf("%d",&s[i]);
        scanf("%d",&k[i]);
        printf("\nthe second time %d :",i);
        scanf("%d",&S[i]);
        scanf("%d",&K[i]);
    }
    for(i=1;i<=n;i++)
    {
        printf("%d : %d %d : %d",s[i],k[i],S[i],K[i]);
        printf("\n");
    }
    int tot=0,u=0;
    for(i=2;i<=n;i++)
    {
      if(s[i]==S[i-1])
      {
          tot+=k[i]-K[i-1];;
      }
      else if(s[i]>S[i-1])
      {
          int h=k[i],r=s[i];
          u=0;
         H:
         if(h==K[i-1] && r==S[i-1] )
         {
           tot+=u;
         }
         else
         {
             u++;
             h--;
             if(h==-1)
             {
                 h=59;
                 r--;
             }
             goto H;
         }
          
      }
      
    }
    if(tot<60)
    {
       printf("\n0 Hours %d Minutes",tot); 
    }
    else
    {
        if(tot/60==1)
        {
          printf("\n %d Hour %d Minutes",tot/60,tot%60);  
        }
        else
        {
          printf("\n %d Hours %d Minutes",tot/60,tot%60);
        }
        
    }

    return 0;
}