class Loan
{    void show()
    {
        System.out.println("Loan class...");
    }}
class HomeLoan extends Loan
{    void show()
    {
        super.show();//parent show
        System.out.println("Home loan...");
    }}

class CARLoan extends Loan
{    void show()
    {
        super.show();
        System.out.println("CAR loan...");
    }}

class EduLoan extends Loan
{
    void show()
    {
        super.show();
        System.out.println("Education loan...");
    }
}

public class HierarcialInherit {

    public static void main(String[] args) {

        HomeLoan hl=new HomeLoan();
        CARLoan cl=new CARLoan();
        EduLoan el=new EduLoan();

        hl.show();
        cl.show();
        el.show();


    }

}
