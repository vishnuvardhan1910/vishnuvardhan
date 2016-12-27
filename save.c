#include<stdio.h>
#include<conio.h>
int main()
{
int n,sum=0,i;
printf("\n enter the numbers");
scanf("%d",&n);
for(i=0;i<=n;i++)
{
sum+=i;
}
printf("sum=%d",sum);
return 0;
}

