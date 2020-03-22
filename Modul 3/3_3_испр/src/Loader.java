
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat vas = new Cat();
        {
            System.out.println("cat " + cat.getWeight());


            cat.feed(new Double(40));

            System.out.println();


            System.out.println("vasyka " + vas.getWeight() );
            System.out.println("vasyka feed");

                vas.feed(new Double(20));
                System.out.println (" vasyka" + vas.getWeight());

                System.out.println("vasyka food: " + vas.getFood());


                System.out.println("vasyka:" + vas.getStatus());



            System.out.println("vasyka " + vas.getWeight() );
            System.out.println("vasyka gotray");

                vas.gotray(new Double(20));
                System.out.println(" vasyka " + vas.getWeight());

                System.out.println("vasyka: " + vas.getStatus());
        }
    }
}