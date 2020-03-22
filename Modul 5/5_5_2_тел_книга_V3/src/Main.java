import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, Integer> abonent = new TreeMap<>();

        String key = null;
        Integer value = 0;

        for (; ; ) {

            System.out.println("Введите имя аббонента или его телефон ");

            String name = br.readLine();

            if (name.equals("LIST")) {

                Set<Map.Entry<String, Integer>> entrySet = abonent.entrySet();

                for (Map.Entry<String, Integer> pair : entrySet) {

                    System.out.println("name abonenta " + pair.getKey() + " - num abonenta " + pair.getValue());

                }
                break;
            }

            if (name.matches("(\\+)?\\d*")) { // номер в цифрах

                value = Integer.parseInt(name);

                if (abonent.containsValue(value)) {

                    Set<Map.Entry<String, Integer>> entrySet = abonent.entrySet();

                    for (Map.Entry<String, Integer> pair : entrySet) {
                        if (value.equals(pair.getValue())) {
                            System.out.println("name abonenta " + pair.getKey());

                        }
                    }
                } else {

                    System.out.println("Введите имя аббонента");
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

                    key = br1.readLine();

                    abonent.put(key, value);

                }
            }

            if (name.matches("\\D*")) {

                key = name;

                if (abonent.containsKey(key)) {
                    Set<Map.Entry<String, Integer>> entrySet = abonent.entrySet();

                    for (Map.Entry<String, Integer> pair : entrySet) {
                        if (key.equals(pair.getKey())) {
                            System.out.println("num abonenta " + pair.getValue());

                        }
                    }

                } else {                    //в базе данных нет имени - просим ввести телефон и заносим данные
                    System.out.println("Введите номер аббонента");
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

                    value = Integer.parseInt(br1.readLine());

                    abonent.put(key, value);
                }
            }
        }
    }
}




