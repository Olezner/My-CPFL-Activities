//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Prof: Sir. Isaac MOrallo
// My learnings in this OE I think getline() takes all the sequence 
//of the input characters whereas cin only takes the first part until it meets a white space character but I don't know the exact mechanism of the two functions

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