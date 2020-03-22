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

        int k = 0;
        int t = 0;

        for (int i = 0; i < box; i++) {

            if (i % 27 == 0) {
                k++;
                System.out.println();
                System.out.println("Контейнер: " + k);
                System.out.println();
            }
            System.out.println("Ящик: " + (i + 1));

        }

    }
}




