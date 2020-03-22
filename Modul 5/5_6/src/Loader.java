import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class Loader {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        test (treeSet);
    }

    public static void test (Set <String> set){

        long start = System.currentTimeMillis();
        ArrayList<String> blat = new ArrayList<String>();
        for (; ; ) {
            // формируем массивы для госномера
            Integer[] gosnomberreg = new Integer[95]; // массив региона
            for (int a = 0; a < 95; a++) {
                gosnomberreg[a] = a + 1;
            }
            Integer[] gosnomber = new Integer[9]; // массив 1-ой цифры в номере
            for (int b = 0; b < 9; b++) {
                gosnomber[b] = b + 1;
            }
            Integer[] gosnomber1 = new Integer[9]; // массив 2-ой цифры в номере
            for (int c = 0; c < 9; c++) {
                gosnomber1[c] = c + 1;
            }
            Integer[] gosnomber2 = new Integer[9]; // массив 3-й цифры в номере
            for (int d = 0; d < 9; d++) {
                gosnomber2[d] = d + 1;
            }
            String[] gosnomberser = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"}; // буквы номера
            String number = null;
            for (int item : gosnomberreg) { // регион  //System.out.format("%02d%n", item);
                int reg = item;
                for (int item1 : gosnomber) {// госномер 1 цифра
                    int e = item1;
                    for (int item5 : gosnomber1) { // госномер 2 цифра
                        int g = item5;
                        for (int item6 : gosnomber2) { // госномер 3 цифра
                            int f = item6;
                            for (String item2 : gosnomberser) { // первая буква
                                String e1 = item2;
                                for (String item3 : gosnomberser) { // вторая буква
                                    String e2 = item3;
                                    for (String item4 : gosnomberser) { // третья буква
                                        String e3 = item4;

                                        if (e == g & g == f & e == f & e1 == e2 & e2 == e3 & e1 == e3) {
                                            number = "";
                                            number += e1;
                                            number += e;
                                            number += g;
                                            number += f;
                                            number += e2;
                                            number += e3;
                                            number += reg;
                                            blat.add(number);

                                            // System.out.println(blat); // проверка вывода номера
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Scanner reader = new Scanner(System.in);
            System.out.println("Введите номер машины");
            String numbercar = reader.nextLine().trim().toUpperCase().replaceAll("\\s+", ""); //numbercar.toUpperCase(); numbercar.trim();

            System.out.println(numbercar);


            if (blat.contains(numbercar)) {
                System.out.println("есть");
            } else
                System.out.println("нет");


            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("время выполнения: " + timeConsumedMillis + " ms");
        }

    }
}



