#include<iostream>
using namespace std;

int Addition(int no1, int no2)
{
    int ans = 0;
    ans = no1+no2;
    return ans;
}

float AdditionF(float no1, float no2)
{
    float ans = 0;
    ans = no1+no2;
    return ans;
}

double AdditionD(double no1, double no2)
{
    double ans = 0;
    ans = no1+no2;
    return ans;
}

int main()
{   
    int iRet = 0;
    float fRet = 0.0f;
    double dRet = 0.0;

    iRet = Addition(10,11);
    fRet = Addition(10.0f,11.0f);
    dRet = Addition(10.0,11.0);

    return 0;
}