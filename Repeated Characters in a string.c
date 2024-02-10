// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    char s[900];
    scanf("%s",s);
    int i,j;
    int t=0;
    for(i=0;s[i];i++)
    {
        t++;
    }
    int h=1;
    char p[900];
    int y=0,e=1,q[900];
    printf("hello");
    printf("\n");
    for(i=0;i<t;i++)
    {
        if(i==y)
        {
        for(j=i+1;j<t;j++)
        {
            if(s[i]==s[j])
            {
                h++;
                y++;
            }
            else
            {
                break;
            }
        }
        p[e]=s[i];
        q[e]=h;
        y=y+1;
        h=1,e++;
        }
        
    }
    printf("\n");
    for(i=1;i<e;i++)
    {
        printf("%c",p[i]);
        printf("%d",q[i]);
    }
  

    return 0;
}

