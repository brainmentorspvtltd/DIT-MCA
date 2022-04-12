import java.util.Scanner;

class Publication
{
    String title;
    double price;

    Publication()
    {
        System.out.println("Welcome in our Publication House..Plz enter the details asking below...");
    }

    void getData(String a)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the "+ a+ " Title...");
        title=scan.nextLine();

        System.out.println("Enter the "+ a+ " price...");
        price=scan.nextDouble();

    }

    void putData()
    {
        System.out.println("Title is "+title);
        System.out.println("Price is "+price);
    }
}

class Book extends Publication
{
int page_count,no_books,no_pages;

Book()
{
    super();//calls the
    System.out.println("Enter the book Details....");

}
void getData()
{
super.getData("book");
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of books ");
no_books=scan.nextInt();
System.out.println("Enter the number of pages ");
no_pages=scan.nextInt();
}

void putData()
{
    super.putData();
    page_count=no_books*no_pages;
    System.out.println("Book count is "+page_count);

}

}

class Tape extends Publication
{
  float playing_time,no_tapes,no_min;

  {
      System.out.println("Enter the Tape Details...");
  }
  void getData()
  {
      super.getData("tape");
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the no of tapes ");
      no_tapes=scan.nextFloat();

      System.out.println("Enter the no of minutes ");
      no_min=scan.nextFloat();
  }

  void putData()
  {
      super.putData();
      playing_time=no_tapes*no_min;
      System.out.println("Playing time is "+playing_time);
  }

}

public class PublicationTest {

    public static void main(String[] args) {

        Book book=new Book();
        book.getData();
        book.putData();

        Tape tape=new Tape();
        tape.getData();
        tape.putData();
    }

}
