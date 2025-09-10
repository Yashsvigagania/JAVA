package oops;

public class student {
    //Atrributes == properties == state == variable
        String Name;
        long roll_no;
        String Branch = "CS";
        char Section = 'D';
        int aMarks[]=new int[10];
        //Methods = function in C == procedure
        void checkResult(){
            System.out.println("Hello");
        }
        public static void main(String[] args){
            //creating an object
            student st1= new student();
            student st2= new student();
            student st3= new student();
            //No. class is according to the RAM
            st1.Name="abhi";
            st2.Name="ashi";
            st3.roll_no=12;
            System.out.println("Student Name is "+st1.Name);


        }

}
