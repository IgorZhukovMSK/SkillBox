import core.*;
import core.Camera;

public class RoadController {
    // максимальный вес легкового автомобиля
    public static double passengerCarMaxWeight = 3500.0; // kg
    // Максимальная высота легкового автомобиля
    public static int passengerCarMaxHeight = 2000; // mm
    // Максимальная высота контроллера
    public static int controllerMaxHeight = 3500; // mm

    // легковой автомобиль цена
    public static int passengerCarPrice = 100; // RUB
    // Грузовой автомобиль Цена
    public static int cargoCarPrice = 250; // RUB
    // цена автомобиля
    public static int vehicleAdditionalPrice = 200; // RUB

    // максимальная встречная скорость
    public static int maxOncomingSpeed = 60; // km/h
    // скорость Fine Grade
    public static int speedFineGrade = 20; // km/h
    // штрафа за класс
    public static int finePerGrade = 500; // RUB
    // криминальная скорость
    public static int criminalSpeed = 160; // km/h

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");

            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
            boolean policeCalled = false;
            for (String criminalNumber : Police.getCriminalNumbers()) {
                String carNumber = car.getNumber();
                if (carNumber.equals(criminalNumber)) {
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break; }
            }

            /**
             * Пропускаем автомобили спецтранспорта
             */
            if (Police.wasCalled()) {
                continue; }

            if (car.isSpecial()) {
                openWay();

                continue; }

            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             */
            int carHeight = car.getHeight();
            int price = 0;
            if (carHeight > controllerMaxHeight) {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            } else if (carHeight > passengerCarMaxHeight) {
                double weight = WeightMeter.getWeight(car);
                //Грузовой автомобиль
                if (weight > passengerCarMaxWeight) {
                    price = cargoCarPrice;
                    if (car.hasVehicle()) {
                        price = price + vehicleAdditionalPrice; }
                }
                //Легковой автомобиль
                else {
                    price = passengerCarPrice; }
            } else {
                price = passengerCarPrice; }

            /**
             * Проверка скорости подъезда и выставление штрафа
             */
            int carSpeed = Camera.getCarSpeed(car);
            if (carSpeed > criminalSpeed) {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            } else if (carSpeed > maxOncomingSpeed) {
                int overSpeed = carSpeed - maxOncomingSpeed;
                int totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine; }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб."); }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!"); }

    public static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason); }
}