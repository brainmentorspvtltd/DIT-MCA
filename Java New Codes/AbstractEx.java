import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

abstract class Loan
{
   abstract void l_emi();
   abstract void paidloan();
   abstract void unpaidloan();

   void show()
   {
       System.out.println("show");
   }
}

class AdapterLoan extends Loan
{

    @Override
    void l_emi() {
        // TODO Auto-generated method stub
        //define ...its a method without body
    }

    @Override
    void paidloan() {
        // TODO Auto-generated method stub

    }

    @Override
    void unpaidloan() {
        // TODO Auto-generated method stub

    }

}

class HomeLoan extends AdapterLoan
{
    void l_emi()
    {
        System.out.println("10%");
    }


    void paidloan()
    {
        System.out.println("paid loan");
    }
}

class EduLoan extends AdapterLoan
{

    @Override
    void l_emi() {
        // TODO Auto-generated method stub
        //No emi Loan
    }

    void show()
    {
        System.out.println("show...");
    }
}

class AutoLoan extends AdapterLoan
{

    @Override
    void l_emi() {
        // TODO Auto-generated method stub
        System.out.println("8%");

    }

}

class A implements MouseInputListener
{

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}

class B extends MouseInputAdapter
{

}

public class AbstractEx {

    public static void main(String[] args) {
    //    Loan loan=new Loan(); can't instantiated


    }

}
