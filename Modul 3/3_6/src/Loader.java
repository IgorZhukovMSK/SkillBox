
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        Cat murzik = cat.CreateTwin();



        System.out.println(cat.getStatus());
        System.out.println(murzik.getStatus());

        System.out.println(cat.getWeight());
        System.out.println(murzik.getWeight());
    }
}