#include <iostream>

int main(){
    std::cout<< "Enter a number between 20 and 30 ";
    int num{};
    
    std::cin>>num;


    for(int x = 0; x <= 10; x++)
    {
        std::cout<<x*num;
        std::cout<<"\n";    

    }
}