import java.util.Scanner;

class Employee //class
{
    int id,sum=10; //instance variable
    String name;

    void getData() //instance method
    {
        System.out.println("Enter the employee id ");
        id=new Scanner(System.in).nextInt();

        System.out.println("Enter the name of employee ");
        name=new Scanner(System.in).nextLine();
    }

    void showData()
    {
        System.out.println("employee id is "+id);
        System.out.println("Employee name is "+name);
    }
}


class TestEmp{
    public static void main(String[] args) {
        Employee emp=new Employee(); //object
        emp.getData();
        emp.showData();
        System.out.println("sum is "+emp.sum);
    }
}