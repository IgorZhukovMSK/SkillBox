import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> numberReys = new ArrayList<>(); //массив в котором хранятся номера рейсов


        for (; ; ) { // бесконечный цикл
            System.out.println("Номер рейса: ");
            String reys = reader.readLine().trim().replaceAll("\\s+", ""); // вводим номер рейса
            numberReys.add(reys);
            String exitAll = "exitAll"; //команда вывод всех самолетов со стоянки

            if (reys.contains(exitAll)) {
                System.out.println("Список самолетов: " + numberReys);

            }

            if  (numberReys.size() > 5) {  // массив не больше 5
                System.out.println("Мест нет, отправляйтесь на дополнительный круг");



                // contains
//                if (reys.contains(exitAll)) {
//                    System.out.println("Список самолетов: " + numberReys);
//
//                    System.out.println("qqq" + reys);
//                }
                continue;
            }
        }
    }
}


