#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("\n enter the alphabet");
scanf("%c",&ch);
if(isalpha(ch))
{
printf("\n the alphabet");
}
else
printf("not an alphabet");
return 0;
}
