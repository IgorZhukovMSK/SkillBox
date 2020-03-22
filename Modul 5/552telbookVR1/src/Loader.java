import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Loader {

    private static boolean isNumber(String input) {
        return input.chars().noneMatch(Character::isLetter) && input.chars().anyMatch(Character::isDigit);
    }
//if (command.equals("List")){
//                for (String name : items){
//                    System.out.println(name);
                                                                    //containsKey и containsValue
    private static boolean isName(String s) {
        if (!isNumber(s) && !s.equals("LIST")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap <String, String> cleverBook = new HashMap<>();
        for (; ; ) {
            System.out.println("Введите номер или имя аббонента: ");
            String number = reader.readLine().trim();

            String name = cleverBook.get(number);
//
//            if (number.equals("List")){
//                for (number  : cleverBook) {
//                    System.out.println(name);
//                }

            if (name != null) {
                System.out.println("Имя аббонента: " + name + " Номер " + number);

            } else {
                System.out.println("Аббонента в тел книги нет, введите имя: ");
                name = reader.readLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Не правильно указано имя");
                } else {
                    cleverBook.put(number, name);
                    System.out.println("Аббонент сохранен");
                }
            }

            if (!isNumber(number)) {
                for (String o : cleverBook.keySet()) {
                    if (cleverBook.get(o).equals(name)) {
                        cleverBook.put(number, name);
                        System.out.println("This number  in book: " + number + " : " + name);
                    }
                }
            } else if (!isName(name)) {
                System.out.println("Wrong input");
            }

        }
    }
}