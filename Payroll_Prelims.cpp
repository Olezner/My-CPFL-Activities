#include<iostream>

using namespace std;

int main(){
    const double tax = 0.12;
    std::string ename,emnumber,date;
    float hprate;
    int hwork;
    int paysum,paydate;
    double ph,S3,ibig;
    double gross_pay,whtax,net_pay;

    
    cout << "Enter Your Name    :";
    getline (cin,ename);
    cout << "Employee Number    :";
    getline(cin,emnumber);
    cout << "Date of Payday     :";
    getline(cin,date);
    
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

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    cout << "You worked " << hwork << " hours and earned " << hprate << "per hour" << endl;

    gross_pay = hprate * hwork;
    whtax = gross_pay * tax;
    ph = 150;
    S3 = 250;
    ibig = 200;
    net_pay = gross_pay - whtax - ph - S3 - ibig;

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
