//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: November 08, 2021
//Midterms
// Description: This program that I made will convert Kilogram to Grams, Kilogram to Milligrams, Pound to Ounce, Long Ton to Pound. 


#include <iostream>

using namespace std;


void promptAndWait();
void KilogramstoGrams(float Grams, unsigned Kilograms );
void KilogramToMilligrams(float Milligrams, unsigned Kilogram );
void PoundToOunce(float Ounce, unsigned Pound);
void LongTontoPound(float Long_Ton, unsigned Pound);

int main()
{

    int c, ans=0;
    double Ounce, Grams, Milligrams; 
    double Kilogram, Pound, Long_Ton, Kilograms;

    do{
    system("cls");
        cout << endl;
        cout << "[1] Kilogram to Grams" << endl;
        cout << "[2] Kilogram to Milligrams" << endl;
        cout << "[3] Pound to Ounce" << endl;
        cout << "[4] Long Ton to Pound" << endl;
        cout << "[5] Exit" << endl;
        cout << "Select Program of Conversion: ";
        cin >> c;

        system("cls");
        switch(c){

            case 1:{
                cout << "\n<<<-----Convert Kilogram to Grams----->>>" << endl;
                KilogramstoGrams(Grams = 1000, Kilograms=1); 
                cout << "\nEnter a Kilogram: ";
                cin >> Kilograms;
                KilogramstoGrams(Grams, Kilograms); 
                promptAndWait(); 
                break;
                
            }
            
            case 2:{
                cout << "\n<<<-----Convert Kilograms to Milligrams----->>>" << endl;
                KilogramToMilligrams(Milligrams =1000000, Kilogram = 1); 
                cout << "\nEnter a Kilogram: ";
                cin >> Kilogram;
                KilogramToMilligrams(Milligrams, Kilogram); 
                promptAndWait(); 
                break;
            }

            case 3:{
                cout << "\n<<<-----Convert Pound to Ounce----->>>" << endl;
                PoundToOunce(Ounce = 16, Pound = 1); 
                cout << "\nEnter a Pound: ";
                cin >> Pound;
                PoundToOunce(Ounce, Pound); 
                promptAndWait(); 
                break;
            
            }

            case 4:{
                cout << "\n<<<-----Convert Long Ton to Pound----->>>" << endl;
                LongTontoPound(Long_Ton = 1, Pound = 2240); 
                cout << "\nEnter a Long Ton: ";
                cin >> Long_Ton;
                LongTontoPound(Long_Ton, Pound); 
                promptAndWait(); 
                break;
            
              
                
                break;
            }

            case 5:{
                promptAndWait();
                cout << "Thank you for using this Conversion Program";
                return 0;
            }

            default:{
                cout << "Invalid Input!";
                promptAndWait();
            }
        }
    
    }
    while(ans==0);
    
};

void promptAndWait()
{
    cin.ignore(100, '\n');
    cout << "\nPress Enter or Return to continue...";
    cin.get();
}

void KilogramstoGrams(float Grams, unsigned Kilograms )
{
        
    cout.setf(ios::fixed);
    cout.precision(0);

    
    
    cout << Kilograms << " Kilogram" << " = " << (Grams * Kilograms) << " Grams \n";
    
}

void KilogramToMilligrams(float Milligrams, unsigned Kilogram )
{
        
    cout.setf(ios::fixed);
    cout.precision(0);
    
    
    cout << Kilogram << " Kilogram" << " = " << (Milligrams * Kilogram) << " Milligrams \n";
    
}

void PoundToOunce(float Ounce, unsigned Pound)
{
        
    cout.setf(ios::fixed);
    cout.precision(0);
    
    
    
    cout << Pound << " Pound" << " = " << (Pound * Ounce) << " Ounce \n";
    
}

void LongTontoPound(float Long_Ton, unsigned Pound)
{
        
    cout.setf(ios::fixed);
    cout.precision(0);
    
    
    
    cout << Long_Ton << " Long Ton" << " = " << (Pound * Long_Ton) << " Pound \n";
    
}

