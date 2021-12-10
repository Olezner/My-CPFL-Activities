// NAME: Oriean lezner R. Bagsic
// SECTION: BSCS 1-1
// DATE: December 10, 2021
// DESCRIPTION: This program is a simple banking system where a client can deposit, withdraw and check their account balance.
// admin can check the credit card of the client to see if their account is still valid or invalid.

#include<iostream>
#include<string>
#include<fstream>



using namespace std;

    const int d = 6;

    bool isNumberString(const string& s) {
    int len = s.length();
    for (int i = 0; i < len; i++) {
        if (s[i] < '0' || s[i] > '9')
            return false;
    }
    return true;
}
    char intro();
    char mainMenu();
    void createAccount(); 
    char bankingMenu();
    class bank{ 
    public :
    int bal;
    void deposit(void); 
    void withdraw(void); 
    void login(void);
    void displaybal();
    void showtranshist();}; // G
    void TryAgain();
    char client();
    char admin();
    char clientmenu();
    void validchecker();
    void showtranshist();
int main()
{   
    
    char choice;
    bank account;
    while (choice != '0')
    {
        choice = intro();
        if (choice == '0')
        {
            cout << "Thank You for stopping by at Oriean's Bank!";
            break;
        }

        switch (choice)
        {

        case 1:
            client();
            break;
        case 2:
            admin();
            break;
        case 0:
            cout << "Exiting the Program";
            TryAgain();
            return 0;
        default:
            cout << "Invalid Input \n";
            break;
        }
    }
  
}

char admin()
{ 
    bank decision;
    int loginAttempt=0;
    string username,userpassword;

        
    while (loginAttempt < 5)
    {   
 
        cout << "Please enter your user name: ";
        cin >> username;
        cout << "Please enter your user password: ";
        cin >> userpassword;

        system("cls");
        if (username == "ADMIN" && userpassword == "@dminC0de123")
        {
            cout << "Welcome ADMIN!\n";
            break;
        }
        else if (username == "Admin" && userpassword == "@dminC0de123")
        {
            cout << "Welcome Admin!\n";
            break;
        }
        else if (username == "admin" && userpassword == "@dminC0de123")
        {
            cout << "Welcome admin!\n";
            break;
        }
        else
        {
            cout << "Invalid login attempt. Please try again.\n" << '\n';
            loginAttempt++;
        }
    }
    if (loginAttempt == 5)
    {
            cout << "Too many login attempts! The program will now terminate.";
            

    }

    cout << "Thank you for logging in.\n";
    
     do{
        int a;
        bank decision;
        system("cls");
        cout << "[1] Credit Card Valid Checker" << endl;
        cout << "[0] Back To Main Menu" << endl;  
        cout << "Enter your choice: ";
        cin >> a;

        switch(a)
        {

            case 1:
            {
                validchecker();
               break;
            }
            case 0:
            {
                cout << "Back to Main Menu" << endl;
                return 0;

                break;
            }
        
            default:
            {
                cout << "Invalid choice!" << endl;
            }
        }
    }
    while(true);
}

char intro()
{
    int a;
    cout << "MAIN MENU" << endl;
    cout << "[1] Client" << endl;
    cout << "[2] Admin" << endl;
    cout << "[0] Exit" << endl;
    cout << "Enter Your Choice: ";
    cin >> a;
    return a;
}

char mainMenu() 
{
    char ch;
    cout << "********** MAIN MENU ********** " << endl << endl;
    cout << "[1] Create New Account " << endl;
    cout << "[2] Login " << endl;
    cout << "[0] Back" << endl;
    cout << "Enter your choice:";
    cin >> ch;
    return ch;

}

char client()
{   
    char choice;
    bank account;
    while (choice != '0')
    {
        choice = mainMenu();
        switch (choice)
        {
            case '1':
            {
                createAccount();
                cin.ignore();
                break;
            }
            case '2':
            {
                account.login();
                break;
            }
            case '0':
            { 
                break;
                
            }    
            default:
            cout << "Invalid choice!" << endl;
            break;
        }
    }
    return 0;
}
void createAccount() 
{
   string username;
   string password;
   cout << "Please create a username" << endl;
   cin >> username;
   cout << "Please create a password" << endl;
   cin >> password;
   ofstream createaccount;
   createaccount.open("accounts.txt", ios::app); 
   createaccount << username << " " << password << endl;
   createaccount.close();
   cout << "Account created!" << endl;

}

void bank :: login(void) 
{
   string username;
   string password;
   char choice;
   bank decision;
   ifstream savedaccount;
   savedaccount.open("accounts.txt");
   cout << "Enter your username:" << endl;
   cin >> username;
   cout << "Enter your password:" << endl;
   cin >> password;

   string username2, password2;
   savedaccount >> username2 >> password2;
   savedaccount.close();
    if (username != username2 || password != password2)
    cout << "Incorrect login! Create new account or try again." << endl;
    while(username == username2 && password == password2) 
    {
        choice = clientmenu(); 
    }
}

char clientmenu()
{
      do{
        int a;
        bank decision;
        system("cls");
        cout << "********* BANKING MENU *********" << endl << endl;
        cout << "[1] Deposit Money" << endl;
        cout << "[2] Withdraw Money" << endl;
        cout << "[3] Check Balance" << endl;
        cout << "[0] Exit" << endl;
        cout << "Enter your choice:";
        cin >> a;

        

        switch(a)
        {
            case 1:{
                
                decision.deposit();
                TryAgain();
                break;
            }

            case 2:
            {
                decision.withdraw();
                TryAgain();
                break;
            }

            case 3:
            {
                decision.displaybal();
                TryAgain();
                break;
            }
        
            case 0:
            {   
                cout << "Thanks for stopping by Oriean's Bank!" << endl;
                system("pause");
                return 0;
            }
            default:
            {
                cout << "Invalid choice!" << endl;
                system("pause");
            }
        }
    }
    while(true);
}

void bank :: deposit(void) 
{   
   long deposit,bal;     
   cout << "Enter how much you would like to deposit: ";
   cin >> deposit;
   bal = deposit+bal;
   cout << "You have deposited: Php" << deposit << endl;
   if (deposit >= 100000)
    cout << "Now that is a lot of money!" << endl; // Easter egg

}

void bank :: withdraw(void) 
{
    long withdraw,bal;
    cout << "Enter how much you would like to withdraw: ";
    cin >> withdraw;
    if (bal > withdraw || bal == withdraw){
    bal= bal - withdraw;
    cout << "You have withdrawn: Php" << withdraw << endl;}
    else if (bal < withdraw)
    cout << "You don't have enough funds to cover your withdraw request!" << endl;
}

void bank :: displaybal() 
{
    cout << "Your current balance is: Php" << bal << endl;
    if (bal >= 1000000)
        cout << "Wow, you're a high roller!" << endl; 
}

void validchecker()
{   
    
    string ccNumber;

    cout << "You can quit by just entering [0]" << endl;
    cout << endl;
    while (true) {
        
        cout << "Please enter a CC number to validate (NO SPACES): ";
        cin >> ccNumber;
        
        if (ccNumber == "0")
        {   
            
            break;
        }
        else if (!isNumberString(ccNumber)) {
            cout << "Bad input!" << endl;
            continue;
        }
            
        int len = ccNumber.length();
        int doubleEvenSum = 0;

        for (int i = len - 2; i >= 0; i = i - 2) {
            int dbl = ((ccNumber[i] - 48) * 2);
            if (dbl > 9) {
                dbl = (dbl / 10) + (dbl % 10);
            }
            doubleEvenSum += dbl;
        }
        
   
        
        for (int i = len - 1; i >= 0; i = i - 2) {
            doubleEvenSum += (ccNumber[i] - 48);
        }
        
       
        
        cout << (doubleEvenSum % 10 == 0 ? "Valid!" : "Invalid!") << endl;
        
        continue;      
    }
}

void TryAgain()
{
    cin.ignore(100, '\n');
    cout << "\nPress Enter or Return to continue...";
    cin.get();
} 