import jdk.nashorn.api.tree.DebuggerTree;

import java.io.InputStream;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("введите количесво ящиков: ");
        int box = a.nextInt();

        // вычисляем сколько нужно контейнеров, уточнить, почему у меня не получилось округлить в большую сторону с ceil
        int container = (box / 27) + 1;


        // вычисляем количество грузовиков
        int truck = (container / 12) + 1;
        System.out.println("необходимо грузовиков: " + truck);
        System.out.println("необходимо контейнеров: " + container);


//        int c = 1;
//        int b = 1;


        //int g = 1;


        //for (int i = 1; i <= truck; i++) ;
        //{
        //int i = 0;
        //while (i <= truck){
        //  System.out.println("Грузовик:" + g);
        //g++;
        //i++;

//        int j = 0;
//        while (j < 12 && c <= container) {
        for (int j = 0; j <= 12 && c <= container; j++) {
            System.out.println("Контейнер: " + c++);
            //j++;


//            int k = 0;
//            while (k <= 27 && b <= box) {

                for (int k = 0; k <= 27 && b <= box; k++) {
                    System.out.println("Ящик: " + b++);
                    //k++;

                    //j++;
                    //k++;
                    //i++;

                    //System.out.println();

                }

            }
        }
    }















