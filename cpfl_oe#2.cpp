//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: September 17, 2021
//Activity OE2
// Description: We are asked to create a Point of Sales System using C++ according to our lesson video uploaded on MS Teams 

#include<iostream>
#include<string>

using namespace std;

int main(){

    std::string cname,pn1,pn2,pn3,prdct_id1, prdct_id2, prdct_id3;;
    const double TAX = 0.12;
    int qty_1, qty_2, qty_3;
    int prp1,prp2,prp3;
    double VAT;
    double pr_1, pr_2, pr_3, t_price,total;

    cout << "Enter Customer Name    :";
    getline (cin,cname);
    cout << "Enter product 1 Name   :";
    cin >> pn1;
    cout << "Enter Product ID 1     :";
    cin >> prdct_id1;
    cout << "Enter Product Quantity :";
    cin >> qty_1;
    cout << "Enter Product Price    :";
    cin >> pr_1;
    cout << endl;
    cout << "Enter product 2 Name   :";
    cin >> pn2;
    cout << "Enter Product ID 2     :";
    cin >> prdct_id2;
    cout << "Enter Product Quantity :";
    cin >> qty_2;
    cout << "Enter Product Price    :";
    cin >> pr_2;
    cout << endl;
    cout << "Enter product 3 Name   :";
    cin >> pn3;
    cout << "Enter Product ID 3     :";
    cin >> prdct_id3;
    cout << "Enter Product Quantity :";
    cin >> qty_3;
    cout << "Enter Product Price    :";
    cin >> pr_3;

    t_price = (qty_1 * pr_1) + (qty_2 * pr_2) + (qty_3 * pr_3);
    VAT = t_price * TAX;
    total = t_price + VAT;

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    cout << "\n-----------------------------"<< endl;
    cout << "-          RECEIPTS         -" << endl;
    cout << "-----------------------------" << endl;
    cout << "Customer Name      :" << cname << endl;
    cout << "Product Name       :" << pn1 << endl;
    cout << "Product ID 1       :" << prdct_id1 << endl;
    cout << "Quantity           :" << qty_1 << endl;
    cout << "Price              :" << "P" << pr_1 << endl;

    cout << "\t\t    P" << prp1 << endl;
    cout << "Product Name       :" << pn2 << endl;
    cout << "Product ID 2       :" << prdct_id2 << endl;
    cout << "Quantity           :" << qty_2 << endl;
    cout << "Price              :" << "P" << pr_2 << endl;

    cout << "\t\t    P" << prp2 << endl;
    cout << "Product Name       :" << pn3 << endl;
    cout << "Product ID 3       :" << prdct_id3 << endl;
    cout << "Quantity           :" << qty_3 << endl;
    cout << "Price              :" << "P" << pr_3 << endl;
  
    cout << "\t\t    P" << prp3 << endl;
    cout << "\n-----------------------------"<< endl;
    cout << "TOTAL AMOUNT       :" << "P" << total << endl;
    cout << "-----------------------------"<< endl;


    return 0;
}
