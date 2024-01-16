#include<stdio.h>

int main()
{
    char Arr[20];

    printf("Enetr your name : \n");
    scanf("%[^'\n']s",Arr);

    printf("Your name is : %s\n",Arr);
    

    return 0;
}