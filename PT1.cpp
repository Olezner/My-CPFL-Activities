//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: September 10, 2021
//Performance Task #1
//Description: We are tasked to do an identifier whether if it is odd or even but only a set of 5 numbers.

#include<iostream>

using namespace std;

int main(){

    int range;
    int num;

        cout << "Enter Set of Numbers : ";
        cin >> range;
        
        cout << "Enter Consecutive Numbers: ";
        cin >> num;

    if (num %2 == 0){
        cout << num << " Even Number \n";

    }

    else{
        cout << num << " Odd Number \n";
    
    }

    while(num != range)
    {
        cin >> num;

    if (num  %2 == 0){
        cout << num << " Even Number \n";
        }

    else {
        cout << num << " Odd Number \n";
        }
        
    }
    

    return 0;
}