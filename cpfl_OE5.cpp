//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: November 04, 2021
//Outcome Evaluation #5
//Description: The program should be able to revers a string or integer inputted by the user.

#include <iostream>
#include <string>

using namespace std;

int ans=1, a, i, k=0,num;
char ch[30];
void reverse();
void TryAgain();
void reversenum();



int main(){
    
    do{
    system("cls");
        cout << endl;
        cout << "[1] Reverse a String" << endl;
        cout << "[2] Reverse an Unsigned Integer" << endl;
        cout << "[3] Exit" << endl;
        cout << "Select Program :";
        cin >> a;

        switch (a){

            case 1:{
            system("cls");
            cout << "Enter key String:";
            cin.ignore();
            cin.getline(ch,30);
            reverse();
            TryAgain();
            break;
            }

            case 2:{
            cout << "Enter a Number [0-9]:";
            cin.ignore();
            cin.getline(ch,30);
            reversenum();
            TryAgain(); 
            break;    
            }

            case 3:{
                cout << "Thank you for using this program!!!";
            return 0;
            }

            default:{
                cout << "Invalid Input";
            break;
            }
        }
    }while(ans=1);
    return 0;
}   


    void reverse(){
    

    for (i=0; ch[i]!='\0';i++)
    {  
        k++;
    }
    cout << "Reverse String: ";

    for (i=k-1;i>=0;i--)
    {
        cout << ch[i];
    }
   
}

void reversenum(){

    for (i=0; ch[i]!='\0';i++)
    {  
        k++;
    }
    cout << "Reverse String: ";

    for (i=k-1;i>=0;i--)
    {
        cout << ch[i];
    }
}

void TryAgain(){
    
    cout << endl << "------------------------------------" << endl;
    cout << "Do you want to try again"<< endl;
    cout << "1 = to continue" << endl;
    cout << "0 = to exit" << endl;
    cout << "------------------------------------"<< endl;
    cin >> ans;
}
