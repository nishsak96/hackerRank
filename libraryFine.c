#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int d1; 
    int m1; 
    int y1; 
    scanf("%d %d %d",&d1,&m1,&y1);
    int d2; 
    int m2; 
    int y2; 
    scanf("%d %d %d",&d2,&m2,&y2);
    int days[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    if(y2>=y1)
        {
        if(m2>=m1)
            {
            if(d2>=d1)
                printf("0");
            else
                printf("%d",15*abs(d2-d1));
        }
        else
            printf("%d",500*abs(m2-m1));
    }
    else
        printf("1000");
    return 0;
}
