public class Loader {
    public static void main(String[] args) {


        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String fragments[] = text.split("\\s*,\\s*");
        int fragmentsCount = fragments.length;
        System.out.println(fragmentsCount); // сколько в массиве данных
        int sum = 0;
        for (int i = 0; i < fragmentsCount; i++) {
            fragments[i] = fragments[i].replaceAll("[^0-9]", "");
            int a = Integer.parseInt(fragments[i]); //перевод из строки в цифру

            System.out.println(a); // вывод заработка каждого

            sum = sum + a;
        }
        System.out.println("сумма: " + sum); // общая сумма

    }
}



