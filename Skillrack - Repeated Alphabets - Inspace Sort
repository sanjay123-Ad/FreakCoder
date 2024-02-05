#include <stdio.h>

int main() {
    // Write C code here
    char s[900];
    scanf("%s",s);
    int i,k,t=0;
    for(i=0;s[i];i++)
    {
        t++;
    }
    char p[900];
    for(i=0;s[i];i++)
    {
        p[i]=s[i];
    }
    int j;
    printf("%d",t);
    for(i=0;s[i];i++)
    {
        for(j=i+1;s[j];j++)
        {
            if(s[i]==s[j])
            {
                for(k=j;s[k];k++)
                {
                    s[k]=s[k+1];
                }
                j=j-1;
            }
            
        }
    }
    printf("\n");
    for(i=0;s[i];i++)
    {
        printf("%c ",s[i]);
    }
    int n=0,r[900],C=0;
    for(i=0;s[i];i++)
    {
        for(j=0;p[j];j++)
        {
            if(s[i]==p[j])
            {
                C++;
            }
        }
        r[n]=C;
        n++;
        C=0;
        
    }
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("\n%c : %d",s[i],r[i]);
    }
    char temp1;
    int temp2;
    
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(s[i]>s[j])
            {
                temp1=s[i];
                temp2=r[i];
                s[i]=s[j];
                r[i]=r[j];
                s[j]=temp1;
                r[j]=temp2;
            }
            
        }
    }
    printf("\n");
     for(i=0;i<n;i++)
    {
        printf("\n%c : %d",s[i],r[i]);
    }
    printf("\n");
    for(i=0;p[i];i++)
    {
        printf("%c",p[i]);
    }
    printf("\n");
    int y=0;
    for(i=0;i<n;i++)
    {
        if(r[i]!=1)
        {
            s[y]=s[i];
            r[y]=r[i];
            y++;
        }
    }
    int q=0,b=0;
    for(i=0;p[i];i++)
    {
        for(j=0;j<y;j++)
        {
            if(p[i]==s[j])
            {
                p[i]=s[q];
                b++;
                break;
            }
        }
        if(b==r[q])
        {
            q=q+1;
            b=0;
        }
    }
    for(i=0;p[i];i++)
    {
        printf("%c",p[i]);
    }

    return 0;
}