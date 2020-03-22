
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat vas = new Cat();
        Cat mur = new Cat();
        Cat murzik = new Cat (new Double(2000) );


        System.out.println("total cats " + cat.getCount());

        System.out.println("cat " + cat.getWeight());
        System.out.println("vas " + vas.getWeight());
        System.out.println("mur " + vas.getWeight());
        System.out.println("murzik " + vas.getWeight());

        cat.feed( new Double (9000));
        vas.drink( new Double(5000));
        mur.meow(new Double(80));
        murzik.feed( new Double (9000));

        System.out.println("cat " + cat.getStatus());
        System.out.println("vas " + vas.getStatus());
        System.out.println("mur " + mur.getStatus());
        System.out.println("murzik " + mur.getStatus());
        System.out.println("total cats " + cat.getCount());

    }
}