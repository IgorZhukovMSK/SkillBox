import java.sql.Array;
import java.util.Scanner;

public class Loader {
    private static String ArrayFIO;

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String FIO = a.nextLine();
        System.out.println("Вы ввели: " + FIO);


        String[] parts = FIO.split(" ");

        // необходимо сделать массив и из него распечатывать как в 7.4.2 примерно так

        System.out.println("Фамилия: " + parts[0]);
        System.out.println("Имя: " + parts[1]);
        System.out.println("Отчестсво: " + parts[2]);

    }
}