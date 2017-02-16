#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
    int i,c,t,flag1=0,flag2=0;
    long long x,a,b,j;
    scanf("%d",&t);
    for(i=0;i<t;i++)
        {
        scanf("%lld %lld",&a,&b);        
        if(sqrt(a)==(int)sqrt(a))
            {
            c=(int)(((sqrt(b)))-(int)((sqrt(a))))+1;
        }
        else
            {
            c=(int)(((sqrt(b)))-(int)((sqrt(a))));
        }
        
        printf("%d\n",c);
    }
    return 0;
}
