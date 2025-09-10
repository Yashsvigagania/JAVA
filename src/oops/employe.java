package oops;
//import java.util.Scanner
class employe {
    int nEmp;
    String sName;
    long nSal;

    void nCalcIncomeTax(long nSal) {
        System.out.println("Return income tax");
    }


    public static void main(String[] args) {
       employe e1 = new employe();
        e1.nEmp = 1234;
        e1.sName = "abhi";
        e1.nSal = 20000;
        System.out.println("e1 employe id is" + e1.nEmp);
        System.out.println("e1 employe is" + e1.sName);
    }
}
//every class is a user defined data type
// constructor intialize the value
/*relationship:
Association(has-a)
dependency(uses-a) we create a object in method interview question
inheritance(is-a)
weak- aggregaton
string-composition
this is current instance
staic final not used in non processor cconstructor not have non access modifer no return type
 */
