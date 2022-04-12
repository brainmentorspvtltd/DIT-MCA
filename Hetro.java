import java.util.ArrayList;
import java.util.Scanner;

class Emp{
    int id;
    String name;
    double salary;
    Emp(int id , String  name, double salary){
        this.id  = id;
        this.name = name;
        this.salary = salary;
    }
    void print(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);
    }
}
public class Hetro {
    public static void main(String[] args) {
        Emp emps [] = new Emp[5];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i<emps.length; i++){
            System.out.println("Enter the id");
            int id = scanner.nextInt();
            System.out.println("Enter the Name");
            String name = scanner.next();
            System.out.println("Enter the Salary");
            double salary = scanner.nextDouble();
            Emp emp  = new Emp(id, name, salary);
            emps[i] = emp;
        }
            ArrayList<Object> o = new ArrayList<>();
        o.add(10);
        o.add("Abcd");
        o.add(true);

        //  Working with Dynamic Array
        ArrayList<Emp> empList = new ArrayList<>();
        while(true){

            System.out.println("Enter the id");
            int id = scanner.nextInt();
            System.out.println("Enter the Name");
            String name = scanner.next();
            System.out.println("Enter the Salary");
            double salary = scanner.nextDouble();
            Emp emp  = new Emp(id, name, salary);
            empList.add(emp); // Adding object in arrayList
            System.out.println("Do u want to continue Y or N");
            char choice = scanner.next().charAt(0);
            if(choice == 'y' || choice == 'Y'){
                break;
            }
        }

        for(Emp e : emps){
            e.print();
        }
        scanner.close();
    }
}
