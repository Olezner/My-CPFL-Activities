#include<iostream>

using namespace std;

int main(){
    const double tax = 0.12;
    string ename,emnumber,date;
    float hprate;
    int hwork;
    int paysum,paydate;
    double ph,S3,ibig;
    int cttl, pbtr_1,pbtr_2,reg;
    int s_cttl,s_pbtr,s_reg;
    double gross_pay,whtax,net_pay;

    
    cout << "Enter Your Name    :";
    getline (cin,ename);
    cout << "Employee Number    :";
    cin >> emnumber;
    cout << "Date of Payday     :";
    cin >> date;
    cout << endl;

    cout << "Hourly Pay Rate     :";
    cin >> hprate;
    cout << "Hours Worked        :";
    cin >> hwork;
    cout << endl;

    cout << "Payroll Summary for :" << ename << endl;
    cout << "Employee No.        :" << emnumber << endl;
    cout << "Payroll Date        :" << date << endl;
    cout << endl;

    cout << "You earned " << hprate << " at " << hwork << endl;

    gross_pay = hprate * hwork;
    whtax = gross_pay * tax;
    ph = 150;
    S3 = 250;
    ibig = 200;
    net_pay = gross_pay - whtax - ph - S3 - ibig;


    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);


    cout << "Gross Pay:                                 " << "Php " << gross_pay << endl;
    cout << "Withholding Tax:                           " << whtax << endl;
    cout << "Philhealth:                                " << ph << endl;
    cout << "SSS:                                       " << S3 << endl;
    cout << "Pagibig:                                   " << ibig << endl;
    cout << "---------------------------------------------------------------------" << endl;
    cout << "Net Pay                                    " << "Php " << net_pay << endl;

    if (net_pay < 5000){
        cout << "Employee Status : Contractual";
    }
    else if (net_pay >= 5000 && net_pay <= 10000){
        cout << "Employee Status : Probationary";
    }   
    else if (net_pay > 10000){
        cout << "Employee Status : Regular";
    }      
    return 0;
}