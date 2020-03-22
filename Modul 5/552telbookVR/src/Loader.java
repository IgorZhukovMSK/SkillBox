import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Loader {
    private static boolean isNumber(String input) {
        return input.chars().noneMatch(Character::isLetter) && input.chars().anyMatch(Character::isDigit);
    }


    private static boolean isName(String s) {
        if (!isNumber(s) && !s.equals("LIST") && !s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static String numberEntering() throws IOException {
        boolean b = false;
        String number = null;
        while (!b) { //Номер вводим пока оно не соответствует isName()
            System.out.println("Enter the number: ");
            number = reader.readLine().trim();
            if (isNumber(number))
                b = true;
            else System.out.println("Number is incorrect, try again");
        }
        return number;
    }

    /*
     * Имя вводим пока оно не соответствует isName()
     * */
    private static String nameEntering() throws IOException {
        boolean b = false;
        String name = null;
        while (!b) {
            System.out.println("Enter the name: ");
            name = reader.readLine().trim();
            if (isName(name))
                b = true;
            else System.out.println("Name is incorrect, try again");
        }
        return name;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> cleverBook = new HashMap<>();
        for (; ; ) {
            System.out.print("Please type: ");
            String something = reader.readLine().trim();

            if (!isNumber(something)) { //если ввели не Номер, то проверяем на Имя
                if (isName(something)) { //если Имя, то ищем его в HashMap, и выводим все Номера с таким Именем
                    int count = 0; //счетчик, чтобы узнать сколько Номеров у данного Имени
                    for (Map.Entry entry : cleverBook.entrySet()) {
                        if (entry.getValue().equals(something)) {
                            count++;
                            System.out.println("Name: " + something + " Number: " + entry.getKey());
                        }
                    }
                    if (count == 0) { //если Имени не присвоен номер, то сохраняем это имя, и запрашиваем для него новый Номер
                        cleverBook.put(numberEntering(), something);
                    }
                } else {
                    System.out.println("Wrong input");
                }

            } else{
                if (cleverBook.get(something) == null) {
                    cleverBook.put(something, nameEntering());
                } else {
                    System.out.println("Number: " + something + " Name: " + cleverBook.get(something));
                }
            }

            if (something.equals("LIST")) {
                List<String> ordnung = new ArrayList<String>();
                for (Map.Entry<String, String> e : cleverBook.entrySet()) {
                    ordnung.add(e.getKey() + " - " + e.getValue());
                }
                String all = String.join(",", ordnung);
                System.out.println(all);
            }
        }
    }
}