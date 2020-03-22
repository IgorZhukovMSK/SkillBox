import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Loader {
    private Double weight1;
    public static void main(String[] args) {


        {
            Cat cat = new Cat();


            Kitty vas  = new Kitty();


            Integer weight1 = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            if (oncomingSpeed >= criminalSpeed) {
                System.out.println("Вызов полиции...");
            } else if (oncomingSpeed > maxOncomingSpeed) {
                // Переменная overSpeed превышение скорости
                Integer overSpeed = oncomingSpeed - maxOncomingSpeed;
                // Переменная gradesCount на сколько умножается размер штрафа
                Integer gradesCount = overSpeed / speedFineGrade + 1;
                // переменная fine размер штрафа
                Integer fine = finePerGrade * gradesCount;
                System.out.println("Сумма штрафа: " + fine);
            } else {
                System.out.println("Скорость не превышена");
            }


            System.out.println(vas.getKittyWeight());
        }
    }
}
