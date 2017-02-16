#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    char grid[15][15];
	int a,b,i,j;
	printf("%d %d",&a,&b);
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			scanf(" %c",&grid[i][j]);
		}
	}
	for(i=0;i<a;i++)
	{
		for(j=0;j<b;j++)
		{
			printf(" %c",grid[i][j]);
		}
	}
    return 0;
}
