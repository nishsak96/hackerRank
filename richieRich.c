#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int k,i,j,a,b,c=0; 
    int d=k;
    scanf("%d %d",&n,&k);
    char* number = (char *)malloc(10240 * sizeof(char));
    scanf("%s",number);
    for(i=0,j=strlen(number)-1;i<j;i++,j--)
        {
        if(k>0)
            {
            if(number[i]!=number[j])
                {
                k--;
                c++;
                if(number[i]>number[j])
                    {
                    number[j]=number[i];
                }
                if(number[i]<number[j])
                    {
                    number[i]=number[j];
                }
            }
        }
        else
        {
            printf("-1");
            exit(0);
        }

        if((d/2-c)>=1)
            {
            
            //a=(k-c)%2;
            b=(d/2-c);
            
            for(i=0,j=strlen(number)-1;i<=b;i++,j--)
                {
                number[i]='9';
                number[j]='9';
            }
            
        }
    }
    printf("%s",number);    
    return 0;
}
