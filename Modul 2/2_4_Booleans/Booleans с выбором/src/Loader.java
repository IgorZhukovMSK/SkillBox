import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javax.xml.bind.DatatypeConverter.parseInt;


public class Loader {
    public static void main(String[] args) throws IOException {
        Integer milkAmount = 200; // ml
        Integer powderAmount = 5; // g
        Integer eggsCount = 3; // items
        Integer sugarAmount = 5; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;

        System.out.println("milk:");
        Integer milk = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("powder:");
        Integer powder = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("eggs:");
        Integer eggs = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("sugar:");
        Integer sugar = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("oil:");
        Integer oil = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("apple:");
        Integer apple = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        if (milk >= 100 && powder >= 400 && eggs >= 0 && sugar >= 10 && oil >= 30 && apple >= 0) {
            //powder - 400 g, sugar - 10 g, milk - 100 ml, oil - 30 ml
            System.out.println("Вы сможите приготовить - Pancakes");

        } else if (milk >= 300 && powder >= 5 && eggs >= 5 && sugar >= 0 && oil >= 0 && apple >= 0)

            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Вы сможите приготовить - Omelette");

        else if (milk >= 100 && powder >= 300 && eggs >= 4 && sugar >= 0 && oil >= 0 && apple >= 3)

            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Вы сможите приготовить - Apple pie");

        else
            System.out.println("Вы ничего не сможите приготовить");

    }
}