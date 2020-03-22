import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.Character.isDigit;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> abonent = new TreeMap<>();

        for (; ; ) {
            System.out.println("Пожалуйста введите номер телефона или имя аббонента: ");
            String name = reader.readLine().trim();

            if (name.matches("(\\+)?\\d*")) {
                String number = abonent.get(name);

                for (Map.Entry<String, String> entry : abonent.entrySet()){
                    if (entry.equals(number)){
                        System.out.println(number);
                    }
                }



              System.out.println(number); // проверка правильности

                if (abonent.containsValue(number)) {
                    System.out.println("аббонент1: " +  abonent.get(name) + " номер: " + number);

//                    if (name != null) {
//                        System.out.println("??????");
//                        number = reader.readLine().trim();
//                        System.out.println("имя " + name + "номер " + number); // проверка точно ли туда записалось?

                    } else {

                            System.out.println("Аббонента в тел книги нет, введите имя: ");
                            name = reader.readLine().trim();
                            if (name.isEmpty()) {
                                System.out.println("Не правильно указано имя");
                            } else {
                                abonent.put(name , number);
                                System.out.println("Аббонент сохранен");
                                System.out.println("имя " + abonent.keySet() + " номер " + abonent.entrySet()); // проверка точно ли туда записалось?




                    //String number = name;

                    //String value;
                    //while (name.isEmpty()  value = scanner.nextLine());

                    //String number = reader.readLine().trim();
//                number = abonent.get(name);

//
//                String value;
//                while (!isDigit(value = scanner.nextLine());

                    //String number = scanner.nextLine();
                    //String nomber = value;
//                    System.out.println(name);
//                    System.out.println(number);
//                    if (abonent.containsKey(number)) {
//                        System.out.println("аббонент1: " + abonent.get(name) + " номер: " + number);


//                        if (number != null) {
//                            System.out.println("Имя аббонента: " + name + " Номер " + name);
//
//                        } else {
//                            System.out.println("Аббонента в тел книги нет, введите имя: ");
//                            name = reader.readLine().trim();
//                            if (name.isEmpty()) {
//                                System.out.println("Не правильно указано имя");
//                            } else {
//                                abonent.put(name, number);
//                                System.out.println("Аббонент сохранен");
                            }

                    }

                    }

                }
            }
        }


