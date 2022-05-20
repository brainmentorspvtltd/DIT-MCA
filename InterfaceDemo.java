interface IPlayer {
    void walk();    // public abstract void walk();
    void run();
    void jump();
    void punch();
    void kick();
    int JUMP_HEIGHT = 100;  // public static final int JUMP_HEIGHT = 100;
}

abstract class CommonFeatures implements IPlayer {

    // abstract void show();

    @Override
    public void walk() {
        
    }

    @Override
    public void run() {
        
    }

    @Override
    public void jump() {
        
    }
}

class Eddy extends CommonFeatures implements IPlayer {

    @Override
    public void punch() {
        
    }

    @Override
    public void kick() {
        
    }
    
}

class King extends CommonFeatures implements IPlayer {

    @Override
    public void punch() {
        
    }

    @Override
    public void kick() {
        
    }
    
}

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
