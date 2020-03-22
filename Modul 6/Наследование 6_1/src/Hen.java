public class Hen extends fly

{

    public void dabGrains() {

    }

    public void eat() {
        dabGrains();
        super.eat();
    }

    @Override
    public void move() {

    }

    public void haveWings() {

       int fluff = 2;

    }

    @Override
    public void voice() {
        System.out.println("Ko-Ko");
    }
}
