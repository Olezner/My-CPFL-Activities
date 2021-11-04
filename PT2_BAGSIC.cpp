//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: September 10, 2021
//Performance Task #1
//Description: The program given to us is used to convert Peso to Dollar and vice versa, but there are a lot of errors such as typos and wrong implementation of functions.
#include <iostream>

using namespace std;


struct group_facet: public numpunct<char> {
    protected:
        string do_grouping() const { return "\003"; }
};


void promptAndWait()
{
    cin.ignore(100, '\n');
    cout << "\nPress Enter or Return to continue...";
    cin.get();
};


void dollarsToPeso(float conversionRate, unsigned dollarsIn )
{
        
    cout.setf(ios::fixed);
    cout.precision(2);

    
    cout.imbue(locale(cout.getloc(), new group_facet));
    cout << "\n$" << dollarsIn << " US = " << (conversionRate * dollarsIn) << " Pesos. \n";
};

void PesoTodollars(float conversionRate, unsigned dollarsIn )
{

  
    cout.setf(ios::fixed);
    cout.precision(2);

   
    cout.imbue(locale(cout.getloc(), new group_facet));
    cout << "\nP " << dollarsIn << " PHP = " << (conversionRate * dollarsIn) << " Dollar. \n";
};

int main() 
{
   
    float conversionRate; 
    unsigned dollarsIn;
    int ch, ans=0;

    

    do
    {
        system("cls");
        cout << endl;
        cout << "Dollar to Peso Conversion App" << endl;
        cout << "[1] Dollar to Peso" << endl;
        cout << "[2] Peso to Dollar" << endl;
        cout << "[0] Exit the Coversion App" << endl;
        cout << "Select Conversion : ";
        cin >> ch;


        system("cls");
        switch(ch){
            
            case 1:{
            cout.setf(ios::fixed);
            
            cout.precision(2);

                cout << "\n<< Convert Dollar to Peso >>" << endl;
                dollarsToPeso(conversionRate = 501.73, dollarsIn = 1); 
               
                cout << "Enter a US dollar amount (without the dollar sign, commas or a decimal) :";
                cin >> dollarsIn;
                dollarsToPeso(conversionRate, dollarsIn); 
                promptAndWait(); 
                break;
            }

        
            case 2:{
                cout << "\n<< Convert Peso to Dollar >>" << endl;
               
                PesoTodollars(conversionRate = 0.02, dollarsIn = 1); 
               
                cout << "Enter a PHP Peso amount to convert dollar: ";
                cin >> dollarsIn;
                PesoTodollars(conversionRate, dollarsIn); 
                promptAndWait(); 
                break;
            }

            case 0:{
                promptAndWait();
                cout << "Conversion App Terminated \nThank you for using the app!" << endl;
                return 0;
            }

            default:{
                cout << "Invalid Input!";
                promptAndWait();
            }
        }
    }
    while(ans == 0);
}; 

