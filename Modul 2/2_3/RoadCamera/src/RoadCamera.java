import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera {
    public static void main(String[] args) throws IOException {
        //Параметры программы
        //Переменная maxOncomingSpeed максимальная встречная скорость
        Integer maxOncomingSpeed = 60; // km/h
        //Переменная speedFineGrade скорость превышения
        Integer speedFineGrade = 20; // km/h
        //Переменная finePerGrade размер штрафа
        Integer finePerGrade = 1000; // RUB
        //Переменная criminalSpeed максимальная скорость на которую можно превысить
        Integer criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Integer oncomingSpeed
        // Переменная oncomingSpeed вычисление встречной скорости
        Integer oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
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
    }
}