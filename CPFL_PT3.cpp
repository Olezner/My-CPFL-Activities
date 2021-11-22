//Name: Oriean Lezner R. Bagsic
//Section: BSCS 1-1
//Date: September 17, 2021
//Performance task #3
// Description: We are task to use the I/O implementation, it is when a customer inputs their purchases the receipt should store a customer log on a file.

#include<iostream>
#include<string>
#include<fstream>
#include<time.h>

using namespace std;

struct group_facet: public numpunct<char> {
    protected:
        string do_grouping() const { return "\003"; }
};

const double TAX = 0.12;
int main(){

    
    string cname,pn1,pn2,pn3,prdct_id1, prdct_id2, prdct_id3;;
    
    int qty_1, qty_2, qty_3;
    int prp1,prp2,prp3;
    double VAT;
    double pr_1, pr_2, pr_3, t_price,total;
    ifstream in_stream;
    ofstream out_stream;
    time_t timetoday;
    time (&timetoday);
    in_stream.open("customer.txt");
    out_stream.open("customer_logs.txt", ios::app);

    system("cls");

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
    VAT= t_price * TAX;
    total = t_price + VAT;

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    cout << "\n-----------------------------"<< endl;
    cout << "-          RECEIPTS         -" << endl;
    cout << "-----------------------------" << endl;
    cout <<  asctime(localtime(&timetoday)) << endl;
    cout << "Customer Name      :" << cname << endl;
    cout << endl;
    cout << "Product Name       :" << pn1 << endl;
    cout << "Product ID 1       :" << prdct_id1 << endl;
    cout << "Quantity           :" << qty_1 << endl;
    cout << "Price              :" << "P" << pr_1 << endl;
    cout << endl;
    cout << "Product Name       :" << pn2 << endl;
    cout << "Product ID 2       :" << prdct_id2 << endl;
    cout << "Quantity           :" << qty_2 << endl;
    cout << "Price              :" << "P" << pr_2 << endl;
    cout << endl;
    cout << "Product Name       :" << pn3 << endl;
    cout << "Product ID 3       :" << prdct_id3 << endl;
    cout << "Quantity           :" << qty_3 << endl;
    cout << "Price              :" << "P" << pr_3 << endl;
    cout << endl;
    cout << "\n-----------------------------"<< endl;
    cout.imbue(locale(cout.getloc(), new group_facet));
    cout << "TOTAL AMOUNT       :" << "P" << total << endl;
    cout << "-----------------------------"<< endl;


    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);

    cout.imbue(locale(cout.getloc(), new group_facet));
    
    out_stream
    << "\n-----------------------------"<< "\n"
    << "-          RECEIPTS         -" << "\n"
    << "-----------------------------"<< "\n"
    << asctime(localtime(&timetoday))
    << "Customer name      :" << cname << "\n" << "\n"
    << "Product Name       :" << pn1 << "\n" 
    << "Product ID 1       :" << prdct_id1 << "\n"
    << "Quantity           :" << qty_1 << "\n" 
    << "Price              :" << "P" << pr_1 << "\n" << "\n"
    << "Product Name       :" << pn2 << "\n"
    << "Product ID 2       :" << prdct_id2 << "\n"
    << "Quantity           :" << qty_2 << "\n"
    << "Price              :" << "P" << pr_2 << "\n" << "\n"
    << "Product Name       :" << pn3 << "\n"
    << "Product ID 3       :" << prdct_id3 << "\n"
    << "Quantity           :" << qty_3 << "\n"
    << "Price              :" << "P" << pr_3 << "\n" << "\n"
    << "\n-----------------------------"<< "\n"
    << "TOTAL AMOUNT       :" << "P" << total << "\n"
    << "-----------------------------"<< "\n";

    in_stream.close();
    out_stream.close();

   
    return 0;
}
