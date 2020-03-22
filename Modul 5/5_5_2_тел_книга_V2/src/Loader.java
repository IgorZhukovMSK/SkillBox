import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Loader {

    private static Pattern PatternNumber = Pattern.compile ("(\\+)?\\d*");
    private static Pattern PatternName = Pattern.compile("\\D*");

    public static boolean isPhone (String string){
    return PatternNumber.matcher(string).matches();
    }
    public static boolean isName (String string){
        return PatternName.matcher(string).matches();
    }

    public static boolean isList (String string){
        return string.equals("LIST");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map <String, String> phonebook = new HashMap<>();

        for (;;){
            System.out.println("Пожалуйста введите номер телефона или имя аббонента:");
            String command = scanner.nextLine();
            command = command.trim();

            if (isList (command)){

                }else if (isPhone(command)){
                    if (phonebook.containsKey(command)){

                        System.out.println("номер телефона: " + phonebook.get(command));
                    }else {
                        System.out.println("Введите имя " + command);
                        String name = scanner.nextLine();
                        if (isName(name)){
                            System.out.println("аббонент сохранен");
                            phonebook.put(command, name);
                            //break;
                            }else {
                            System.out.println("Вы ввели не правильное имя, введите имя");
                        }
                    }

                    }else if (isName(command)){
                        boolean found = false;

                           for (Map.Entry <String, String> entry : phonebook.entrySet()){
                               if (entry.getValue().equals(command)){
                                   System.out.println(command + "номер телефона " + entry.getKey());
                                   found = true;
                               }
                            }
                        if (!found){
                            System.out.println("Введите имя или номер телефона");
                            String number = scanner.nextLine();
                            if (!isPhone(number)){
                                System.out.println("Вы ввели не правильное имя, введите имя");
                                }else {
                                if (phonebook.containsKey(number)){
                                    System.out.println("Номер занят");
                                    System.out.println("аббонент сохранен");
                                    phonebook.put(number, command);
                                }
                            }else {
                                System.out.println("Вы ввели не правильное имя, введите имя");
                            }
                        }


                        }
                        }else {
                            System.out.println("Не правильно введены данные");
            }


    }