interface AutoShapes
{
    void draw();
    void colorfill();
    void rotate();
    void zoom();
    void changesize();
    void cut();
    void copy();
    void paste();

}

abstract class ShapesAdapter implements AutoShapes
{
// Adapter class it only defines the method without any body
    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }

    @Override
    public void colorfill() {
        // TODO Auto-generated method stub

    }

    @Override
    public void rotate() {
        // TODO Auto-generated method stub

    }

    @Override
    public void zoom() {
        // TODO Auto-generated method stub

    }

    @Override
    public void changesize() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub

    }

    @Override
    public void copy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void paste() {
        // TODO Auto-generated method stub

    }

}

class Square extends ShapesAdapter
{

    public void zoom()
    {
        System.out.println("zoom");
    }

    public void copy() {
        // TODO Auto-generated method stub
        System.out.println("copy");

    }

    @Override
    public void paste() {
        // TODO Auto-generated method stub
        System.out.println("paste");
    }

}


public class Adapter {
    public static void main(String[] args) {
        Square s1=new Square();
        s1.zoom();
        s1.copy();
        s1.paste();
    }

}
