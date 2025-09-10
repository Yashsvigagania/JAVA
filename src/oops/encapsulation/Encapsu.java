package oops.encapsulation;


import java.lang.reflect.Field;

class employee{
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary>0){
                this.salary = salary;

                System.out.println(salary);}
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private double salary;
        private String name;
    }
    public class Encapsu{
        public static void main(String[] args) throws Exception{
            System.out.println("Hello");
            employee emp=new employee();
            Field fsalary=employee.class.getDeclaredField("salary");
            fsalary.setAccessible(true);
            System.out.println("salary" +emp.getSalary());
            emp.getSalary();
            System.out.println();
        }
    }

// binding the data together in one class
// private within same class access

