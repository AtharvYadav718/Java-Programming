#include<stdio.h>
void Fun_Value( int No)
{
    No++;
} 
void Fun_Address(int *ptr)
{
    (*ptr)++;
}
void Fun_Reffernce(int &ref)
{
    ref++;
}
int main()
{
   int i = 10 , j = 10, k = 10;

   Fun_Value(i);
   Fun_Address(&j);
   Fun_Reffernce(k);

   printf("Call by value : %d\n",i);
   printf("Call by Address : %d\n",j);
   printf("Call by Reffernce : %d\n",k);


    return 0;
}