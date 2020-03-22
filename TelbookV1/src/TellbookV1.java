import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TellbookV1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, String> abonent = new TreeMap<>();

        Integer key = 0;
        String value = null;

        for (; ; ) {

            System.out.println("Введите имя аббонента или его телефон ");

            String name = br.readLine();

            if (name.equals("LIST")) {

                Set<Map.Entry<Integer, String>> entrySet = abonent.entrySet();



                for (Map.Entry<Integer, String> pair : entrySet) {

                    System.out.println("Имя аббонента " + pair.getValue() + " - номер аабонента " + pair.getKey());
                }
                break;
            }

            if (name.matches("(\\+)?\\d*")) { // номер в цифрах

                key = Integer.parseInt(name);

                if (abonent.containsKey(key)) {

                    Set<Map.Entry<Integer, String>> entrySet = abonent.entrySet();

                    for (Map.Entry<Integer, String> pair : entrySet) {
                        if (key.equals(pair.getKey())) {
                            System.out.println("Имя аббонента " + pair.getValue());

                        }
                    }
                } else {

                    System.out.println("Введите имя аббонента");
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

                    value = br1.readLine();

                    abonent.put(key, value);

                }
            }

            if (name.matches("\\D*")) {

                value = name;

                if (abonent.containsValue(value)) {
                    Set<Map.Entry<Integer, String>> entrySet = abonent.entrySet();

                    for (Map.Entry<Integer, String> pair : entrySet) {
                        if (value.equals(pair.getValue())) {
                            System.out.println("Номер аббонента " + pair.getKey());

                        }
                    }

                } else {                    //в базе данных нет имени - просим ввести телефон и заносим данные
                    System.out.println("Введите номер аббонента");
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

                    value = br1.readLine();

                    abonent.put(key, value);
                }
            }

            if (!name.matches("(\\+)?\\d*") && !name.matches("\\D*")) {
                System.out.println("Вы ввели не правильные данные, попробуйте еще раз" + "\n");
            }
        }

    }
}




