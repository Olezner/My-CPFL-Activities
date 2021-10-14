//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Prof: Sir. Isaac MOrallo'
//Description: We are tasked to make a Pyramid of Gizah using C++ and asterisk and putting how much height we want to. It should also be 3 pyramids, horizontally to be precised.

#include <iostream>
using namespace std;

int main()
{
    int h;

   
    cout << "Enter the height of the triangle : "; 
    cin >> h;

  
    for (int i = 1; i <= h; i++)
    {
       
        for (int j = 1; j <= (h - i); j++)
        {
            cout << " ";
        }

        for (int k = 1; k <= i * 2 - 1; k++)
        {
            
            if (k == 1 || k == i * 2 - 1)
            {
                cout << "*";
            }
            else if (i == h)
            {
                
                cout << "*";
            }
            else
            {
                
                cout << " ";
            }

        }
        
         cout << "  ";

        for (int j = 1; j <= (h - i); j++)
        {
            cout << "  ";
        }

        
        for (int k = 1; k <= i * 2 - 1; k++)
        {
            
            if (k == 1 || k == i * 2 - 1)
            {
                cout << "*";
            }
            else if (i == h)
            {
                
                cout << "*";
            }
            else
            {
                
                cout << " ";
            }

        }
        cout << "  ";

        for (int j = 1; j <= (h - i); j++)
        {
            cout << "  ";
        }

        
        for (int k = 1; k <= i * 2 - 1; k++)
        {
            
            if (k == 1 || k == i * 2 - 1)
            {
                cout << "*";
            }
            else if (i == h)
            {
                
                cout << "*";
            }
            else
            {
                
                cout << " ";
            }

        }

        cout << endl;
    }
    return 0;
}