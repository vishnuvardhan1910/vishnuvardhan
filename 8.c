#include<stdio.h>
#include<conio.h>
int main()
{
int n;
printf("enter the year");
scanf("%d",&n);
if(n%4==0)
{
printf("the year is leap year");
}
else
printf("the year is not leap");
return 0;
}
