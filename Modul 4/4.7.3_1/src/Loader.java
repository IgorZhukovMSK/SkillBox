import java.sql.Array;
import java.util.Scanner;

public class Loader {
    private static String ArrayFIO;

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String FIO = a.nextLine();
        System.out.println("Вы ввели: " + FIO);

        String fragments[] = FIO.split("\\s* \\s*");

        int fragmentsCount = fragments.length;

        for (int i = 0; i < fragmentsCount; i++) {
            System.out.println(fragments[i]);
        }
    }
}
