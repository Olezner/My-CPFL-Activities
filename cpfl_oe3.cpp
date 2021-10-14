//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Prof: Sir. Isaac MOrallo
/*Description: We are tasked to create a salary program in C++ with additional inputs such as; emloyee id,
hours worked and rate per hour. The program should be able to compute if how many percent the tax will be.
*/
#include<iostream>
#include<string>

using namespace std;

int main(){
    
    string emid,ename;
    int num_hours_work;
    double rate_per_hour,net_pay;
    double gross_pay,VAT;


        cout << "Enter Employee ID             : ";
        getline(cin,emid);
        cout << "Enter Employee Name           : ";
        cin >> ename;
        cout << endl;
        

       
        cout << "Enter rate per hour             :";
        cin >> rate_per_hour;
        cout <<"Enter number of hours worked    :";
        cin >> num_hours_work;

        if(num_hours_work == 0 || rate_per_hour == 0) {
            cout << "You did not input anything!";
        }

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);

        cout << endl;
        cout << "Number of hours worked : " << num_hours_work << endl;
        cout << endl;
        cout << "Your Gross Pay        :>> " << (gross_pay = num_hours_work * rate_per_hour) << endl;
        

        if(gross_pay > 40000) {
        VAT = gross_pay * 0.12; // 12% VAT
        }
        else if(gross_pay < 20000) {
        VAT = gross_pay * 0.05; // 5% VAT
        }
        else if(gross_pay >= 30000 && gross_pay <= 40000) {
        VAT = gross_pay * 0.10; // 10% VAT
        }
        cout << "VAT AMOUNT            :>> " << VAT << endl;
        cout << "\n--------------------------------------" << endl;
        cout << emid<< endl;
        cout << "Hello  " << ename << endl;
        cout << "Your Net Pay         :>> " << (net_pay = gross_pay - VAT) << endl;
     
        return 0;
}