public class Loader {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat murka = new Cat();
        Cat vasyka = new Cat();
        Cat kisa = new Cat();
        Cat puchok = new Cat();

        {
            System.out.println("ves murzik: " + murzik.getWeight);
            System.out.println("ves murka: " + murka.getWeight);
            System.out.println("ves vasyka: " + vasyka.getWeight);
            System.out.println("ves kisa: " + kisa.getWeight);
            System.out.println("ves puchok: " + puchok.getWeight);
        }


        // мурзик мяукает 9000 раз
        {
            System.out.println("murzik");
            System.out.println("murzik meow");

            int meow = 9000;
            while (meow > 0) {
                // как убрать с экрана мяу? Что бы и расчет шел и не видно было. Как вопрос для самообразования.
                murzik.meow;

                System.out.println(" murzik Meow " + meow);
                System.out.println("murzik " + murzik.getWeight);
                meow--;
                if (murzik.getWeight() < 1000)
                    break;  }

            System.out.println("murzik:" + murzik.getStatus); }

        {
            System.out.println("murka");
            System.out.println("murka meow ");
            for (int meow = 10; meow > 0; meow--) {
                murka.meow;
                System.out.println(" murka Meow " + meow);
                System.out.println(murka.getWeight); }
            System.out.println("murka:" + murka.getStatus); }

        System.out.println("vasyka feed");
        {
            vasyka.feed(new Double(20));
            System.out.println(" vasyka" + vasyka.getWeight); }
        {
            System.out.println("vasyka:" + vasyka.getStatus); }
        {
            System.out.println("kisa ");
            System.out.println("kisa feed");
            {
                kisa.feed(new Double(50));
                System.out.println(" kisa" + kisa.getWeight); }
            {
                System.out.println("kisa:" + kisa.getStatus); }
        }
        {
            System.out.println("puchok ");
            System.out.println("puchok feed");
            {
                for (int Double = 0; Double < 1000; Double++) {
                    if (puchok.getWeight > 9000)
                        break;
                    puchok.feed(new Double(100));
                    System.out.println("puchok feed ");

                    System.out.println(" puchok " + puchok.getWeight); }
                {
                    System.out.println("puchok: " + puchok.getStatus); }
            }

        }
    }
}