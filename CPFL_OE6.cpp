#include<iostream>


using namespace std;

void TryAgain();
void search(int in[], int count);
void sortasc(int in[], int count);
void sortdesc(int in[], int count);

const int size = 100;
int main()
{
    int in[size], count, a;

    system("cls");
    cout << endl;
    cout << "Enter Number of Elements in Array: ";
    cin >> count;

    cout << "Enter " << count << " Numbers \n";
    
    for(int i = 0; i < count; i++)
    {
        cin >> in[i];
    }

    do
    {
        system("cls");
        cout << "<<< ARRAY PRGORAMMING >>>" << endl;
        cout << "[1] Searching Array" << endl;
        cout << "[2] Sorting Array (Ascending)" << endl;
        cout << "[3] Sorting Array (Descending" << endl; 
        cout << "[0] Exit the Program" << endl;
        cout << "Enter your choice: ";
        cin >> a;



        system("cls");
        switch (a)
        {
            case 1:{
                system("cls");
                cout << "<<< SEARCHING ARRAY >>>" << endl;
                search(in,count);
                TryAgain();
                break;
            }

            case 2:{
                system("cls");
                cout << "<<< SORTING ARRAY (ASCENDING) >>>" << endl;
                sortasc(in,count);
                TryAgain();
                break;
            }

            case 3:{
                system("cls");
                cout << "<<< SORTING ARRAY (DESCENDING) >>>" << endl;
                sortdesc(in,count);
                TryAgain();
                break;
            }
            case 0:{
                TryAgain();
                cout << "================================== \n";
                cout << "   ARRAY PROGRAMMING TERMINATED\n THANK YOU FOR USING THE PROGRAM" << endl;
                cout << "==================================\n";
                system("pause");
                return 0;
            }
            default:{
                cout << "Invalid Input\n";
               system("pause");
            }
        }
    }
    while(true);
     
}

void TryAgain()
{
    cin.ignore(100,'\n');
    cout << "\n Please Enter or Return to continue...";
    cin.get();
}

void search(int in[], int count)
{
    for(int x = 0; x < count; x++)
    {
        cout << "Unsortted Array Element [" << x << "] " << in[x] << endl;
    }
}

void sortasc(int in[], int count)
{
    int x, y, z;

    for (y = 0; y < count; y++)
    {
        for (x = y + 1; x < count; x++)
        {
            if(in[x] < in[y])
            {
                z = in[y];
                in[y] = in[x];
                in[x] = z;
            }
        }
    }
    cout << "Elements of array in sorted ascending order: " << endl;
    for ( y = 0; y < count; y++)
    {
        cout << in[y] << endl;
    }
}






void sortdesc(int in[], int count){

    int x, y, z;

    for (y = 0; y < count; ++y)   //  
    {
        for (x = y + 1; x < count; ++x)
        {
            if (in[y] < in[x])
            {
                z = in[y];
                in[y] = in[x];
                in[x] = z;
            }
        }
    }

    cout<<"\n Numbers in Descending Order : \n";
    for (y = 0; y < count; ++y)
    {
        cout<<" ";
        cout<<in[y];
        cout<<"\n";
    }
}

