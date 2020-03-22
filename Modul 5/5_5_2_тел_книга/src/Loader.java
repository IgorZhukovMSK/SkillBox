import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Loader {

    public static String getKeyByValue(TreeMap <String, String> map, String value){
        for (Map.Entry<String,String> entry : map.entrySet()){
            if (entry.getValue().equals(value)){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, String> abonent = new TreeMap<>();
       //String key = getKeyByValue(map, value);

        for (; ; ) {
            System.out.println("Пожалуйста введите номер телефона или имя аббонента: ");
            String name = reader.readLine().trim();
            String number = abonent.get(name);

            if (name.equals("List")) {
                for (Map.Entry<String, String> entry : abonent.entrySet()) {
                    System.out.println("аббонент: " + entry.getKey() + " номер: " + entry.getValue()); // не выводиттся имя
                }
            }
                if (abonent.containsKey(name)) {
                    System.out.println("аббонент1: " + abonent.get(number) + " номер: " + number);
                }
                if (abonent.values().contains(number)) {
                    System.out.println("аббонент2: " + abonent.values() + " номер: " + abonent.keySet());
                    //System.out.println("fffff" + entry.getKey() + "cccc" + entry.getValue());

                }



                if (name.matches("(\\+)?\\d*")) {
                    System.out.println("ошибка " + name);
                    System.out.println("не ошибка номер: " + number);

                    if (name != null) {
                        System.out.println("Имя аббонента: " + name + " Номер " + number);

                    } else {
                        System.out.println("Аббонента в тел книги нет, введите имя: ");
                        name = reader.readLine().trim();
                        if (name.isEmpty()) {
                            System.out.println("Не правильно указано имя");
                        } else {
                            abonent.put(name, number);
                            System.out.println("Аббонент сохранен");
                        }
                    }
                }

                if (name.matches("\\D*")) {       //( \D* )  [a-zA-Zа-яА-Я]
                    System.out.println(number);

                    for (String i : abonent.keySet()) {    //.keySet()
                        if (abonent.keySet().equals(name)) {  //.get(i)
                            abonent.put(name, number);
                            System.out.println("This number  in book: " + number + " : " + name);
                        }


                        if (number != null) {
                            System.out.println("Имя аббонента - 8: " + name + " Номер " + number);

                        } else {
                            System.out.println("Номера в тел книги нет, введите номер: ");
                            number = reader.readLine().trim();
                            if (number.isEmpty()) {
                                System.out.println("Не правильно указан номер");
                            } else {
                                abonent.put(name, number);
                                System.out.println("Номер сохранен");

//                }
//            } else if (!isName(name)) {
//                System.out.println("Wrong input");
//            }


//                if (abonent.containsValue(name)){
//                    System.out.println("Имя аббонента: " + name + " Номер " + number);
//                }
//                System.out.println(number);}
//                if (name != null) {
//                    System.out.println("Имя аббонента: " + name + " Номер " + number);
//                } else {
//                    System.out.println("Номера в тел книги нет, введите номер: ");
//                    number = reader.readLine().trim();
//                    if (number.isEmpty()) {
//                        System.out.println("Не правильно указан номер");
//                    } else {
//                        abonent.put(number, name);
//                        System.out.println("Номер сохранен");

                            }
//            }
//            else {
//                String name2 = abonent.get(number);
//                if (name2 == null) {
//                    System.out.println("Пожалуйста введите имя аббонента: ");
//                    name2 = reader.readLine().trim();
//                }
//
//
//                abonent.put(number, name2);
//
//
//            }

                            // необходима проверка номер это или имя


//                if (abonentNum.containsKey(number)) {
//
//                    System.out.println("номер телефона: " + number + " имя абонента: " + abonentNum.get(number));
//                }
//                if (abonentNum.containsValue(number)){
//
//
//
//                } else {
//

                        }
                    }

                }
            }
        }
    }












