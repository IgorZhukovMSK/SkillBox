
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 0; // ml
        Integer powderAmount = 0; // g
        Integer eggsCount = 0; // items
        Integer sugarAmount = 0; // g
        Integer oilAmount = 0; // ml
        Integer appleCount = 80;

        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 100 && oilAmount >= 30)
        //powder - 400 g, sugar - 10 g, milk - 100, oil - 30 ml
        System.out.println("Pancakes");

        else if (powderAmount >= 5 && milkAmount >= 300 && eggsCount >= 5)
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");

        else if (powderAmount >= 300 && milkAmount >= 100 && appleCount >= 3 && eggsCount >= 4)
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");

        else
            System.out.println("))))))");

    }
}