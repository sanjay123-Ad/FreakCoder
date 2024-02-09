// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int a,b,i,j,s[900][900],u=1,r=1,g=1,B[900];
    scanf("%d%d",&a,&b);
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=b;j++)
        {
            printf("Enter the num[%d][%d]:",i,j);
            scanf("%d",&s[i][j]);
        }
    }
    int h[900],y[900],p=1,t=1;
    V:
    for(i=1;i<=a;i++)
    {
        for(j=u;j<=b;j++)
        {
            if(s[i][j]%2==0)
            {
                h[p]=s[i][j];
                p++;
                break;
            }
            else
            {
                y[t]=s[i][j];
                t++;
                break;
            }
        }
    }
    p--,t--;
    
    for(i=1;i<=(p+t);i++)
    {
        if(i<=t)
        {
            B[i]=y[r];
            r++;
        }
        else
        {
            B[i]=h[g];
            g++;
        }
    }
    for(i=1;i<=a;i++)
    {
        s[i][u]=B[i];
    } 
    if(u<=b)
    {
        p=1,t=1,u++,r=1,g=1;
        goto V;
    }
   for(i=1;i<=a;i++)
   {
       for(j=1;j<=b;j++)
       {
           printf("%d ",s[i][j]);
       }
       printf("\n");
   }
   
    return 0;
}