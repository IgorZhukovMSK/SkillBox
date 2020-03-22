import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String number = a.nextLine();


        
        System.out.println(number.replaceAll("[^0-9]", ""));


           }

    }

