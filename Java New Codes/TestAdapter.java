abstract class Shape
{
  abstract void fill();
  abstract void rotate();
  void show()
  {
      System.out.println("show..");
  }

}

class ShapeAdapter extends Shape
{

    @Override
    void fill() {
        // TODO Auto-generated method stub

    }

    @Override
    void rotate() {
        // TODO Auto-generated method stub

    }

}

class Angle extends ShapeAdapter
{
    @Override
    void rotate() {
        // TODO Auto-generated method stub
        System.out.println("rotate");
    }

}




public class TestAdapter {

}
