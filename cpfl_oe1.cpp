//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: September 10, 2021
//Activity OE1
// Description: We are asked to input name, gender, age, address, year & section, course, and contact number and display the output using cout.


#include <iostream>
#include <string>
using namespace std;

int main(){
	
	std::string name,gender,address,yrsc,number;
	
	cout << "-------------------------------------------" <<endl;
	cout << "\tHello Students of CS and IT" << endl;
	cout << "Welcome to Computer Programming Fundamentals" << endl;
	cout << "-------------------------------------------" <<endl;
	cout << "Enter Your Name          : ";
	getline(cin,name);
	cout << "Enter Your Gender        : ";
	getline(cin,gender);
	cout << "Enter Your Address       : ";
	getline(cin,address);
	cout << "Enter Your Year/Section  : ";
	getline(cin,yrsc);
	cout << "Enter Your Contact Number: "; 
	getline(cin,number);
	

	//OUTPUT DISPLAY 
	cout << "-------------------------------------------" <<endl;
	cout << "\nYour name is      :" << name;
	cout << "\nGender            :" << gender;
	cout << "\nAddress           :" << address;
	cout << "\nYear/Section      :" << yrsc;
	cout << "\nContact Number    :" << number;
	
 	return 0;
} 