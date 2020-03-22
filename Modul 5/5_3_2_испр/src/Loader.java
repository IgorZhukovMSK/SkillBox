import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Cleaner;
import java.util.EmptyStackException;
import java.util.Stack;

public class Loader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> numberReys = new Stack <String>();
        String exitAll = "exitAll"; //команда вывод всех самолетов со стоянки
        String exitLast = "exitLast"; //команда вывод последнего самолета со стоянки


        for (; ; ) { // бесконечный цикл

            System.out.println("Номер рейса: ");
            String reys = reader.readLine().trim().replaceAll("\\s+", ""); // вводим номер рейса
            //numberReys.size();

            //numberReys.push(reys); // добавляем рейсы в стек

            if (reys.equals(exitAll)) {
                //for (int i : numberReys.size()) {
//                    for (int i = 0; i < numberReys.size(); i++){
//                        i = -1; // не пойму зачем -1 ставить? Но без него не работает (((

            while (!numberReys.empty()) {
                System.out.println("Покинул стоянку самолет №: " + numberReys.pop());
            }
                System.out.println("Стоянка свободна ");
            } else if (reys.equals(exitLast)) {
                System.out.println("Покинул стоянку самолет №: " + numberReys.pop());
                // обработка exitLast
                System.out.println("Список самолетов на стоянке: " + numberReys);

            } else {

                if (numberReys.size() >= 5) {  // массив не больше 5
                    System.out.println("Мест нет, отправляйтесь на дополнительный круг");
                    continue;
                }
            }
                numberReys.push(reys); // добавляем рейсы в стек
            }
        }
    }



