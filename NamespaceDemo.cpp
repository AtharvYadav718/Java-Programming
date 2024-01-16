#include<iostream>

namespace Marvellous
{
    void Display()
    {
        std::cout<<"Inside Display of Marvellous\n";
    }
}
namespace Infosystem
{
    void Display()
    {
        std::cout<<"Inside Display of Infosystem\n";
    }
}
int main()
{   
    Marvellous::Display();
    Infosystem::Display();

    return 0;
}