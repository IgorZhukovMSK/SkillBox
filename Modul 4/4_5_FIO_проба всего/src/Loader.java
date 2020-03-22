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
        System.out.println("Фамилия: " + parts[0]);
        System.out.println("Имя: " + parts[1]);
        System.out.println("Отчестсво: " + parts[2]);

        // вывод в столбик все слова разеделенные пробелом
//        System.out.println();
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : FIO.split(" ", 3)) {
//            System.out.println(retval);
//            System.out.println("Фамилия: " + ArrayFIO  );


//        char old = ' ';
//        char notold = '\n';
//        String FIOWithN = FIO.replace(old, notold);
            //String FIOWithN = FIO.
//        System.out.println("Фамилия: " + FIOWithN); //+ "Имя: " + FIOWithN + "Отчество: " + FIOWithN);
//        System.out.println("Имя: " + FIOWithN);
//        System.out.println("Отчество: " + FIOWithN);
            //%s  Age: %d  Height: %.2f

            // индексы всех пробелов в строке, введенноё пользователем с клавиатуры:
//

            //System.out.println("Фамилия: %s Имя: %d Отчество: %.2f" + FIO); // не правильно
//            System.out.println("Фамилия: \n Имя: \n Отчество: \n" + FIOWithN); // правильно
        }
    }








//        return FIO;
//    }
//
//    private static String toUpperCaseForFirstLetter(String FIO) {
//
//
//        StringBuilder builder = new StringBuilder(FIO);
//
//
//        // попытка сделать все вывод ФИО заглавными буквами, пока не получилось(((
//        if (Character.isAlphabetic(FIO.codePointAt(0))) ;
//
//        builder.setCharAt(0, Character.toUpperCase(FIO.charAt(0)));
//
//
//        for (int i = 1; i < FIO.length(); i++) {
//            if (Character.isAlphabetic(FIO.charAt(i)) && Character.isSpaceChar(FIO.charAt(i - 1))) ;
//            builder.setCharAt(i, Character.toUpperCase(FIO.charAt(i)));
//
//        }
//        return builder.toString();
//
//
//    }
//}
//

















