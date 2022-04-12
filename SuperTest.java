class Teacher
{
    int x=10;
    Teacher()
    {
        System.out.println("Teacher default constructor..."+x);
    }
   Teacher(int x)
    {
        System.out.println("Teacher Single Parametrized constructor... "+x);
    }
}
class Student extends Teacher
{
int x=20;
Student()
{
   // super();//calls parent class default constructor
    System.out.println("Student default constructor..."+x);

}

Student(int x)
{
  //  super(500); //calls parent class single parametrized constructor
    System.out.println("Student Single Parametrized...."+this.x);
}
}

public class SuperTest
{
public static void main(String[] args) {
    Student stu1=new Student();//calls student default constructor
    Student stu2=new Student(200);//calls the student parameterized constructor
}
}
