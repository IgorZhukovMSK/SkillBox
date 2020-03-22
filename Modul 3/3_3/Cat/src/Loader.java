
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        cat.feed(new Double(20));

        System.out.println(cat.getFood());



        System.out.println(cat.getStatus());
    }
}