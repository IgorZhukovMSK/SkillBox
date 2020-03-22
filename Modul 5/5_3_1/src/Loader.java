import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Loader {


    public static void addNumber(String e1, int e, int g, int f, String e2, String e3, int iteam) throws IOException {
        String number = "";
        number += e1;
        number += e;
        number += g;
        number += f;
        number += e2;
        number += e3;
        number += iteam; // не правильный формат ((( региона, должно быть 2 цифры и ноль учитываться

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner reader = new Scanner (System.in);
//        System.out.println("Введите номер машины");
//        String numbercar = reader.readLine().trim();

        System.out.println(number);

        Scanner reader = new Scanner(System.in);
        System.out.println("Введите номер машины");
        String numbercar = reader.nextLine().trim();

        ArrayList<String> blat = new ArrayList<>();
        blat.add(number);
        for (String item7 : blat) {
            String blat1 = item7;

            if (blat1.contains (numbercar)) {
                System.out.println("есть");
            }
            else
                System.out.println("нет");
            }
    }


    public static void main(String[] args) throws IOException {

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


            for (int item : gosnomberreg) { // регион

                //System.out.format("%02d%n", item);


                for (int item1 : gosnomber) {// госномер 1 цифра
                    int e = item1;
                    for (int item5 : gosnomber1) { // госномер 2 цифра
                        int g = item5;
                        for (int item6 : gosnomber2) { // госномер 3 цифра
                            int f = item6;

                            //System.out.format("%03d%n", item1);


                            for (String item2 : gosnomberser) { // первая буква
                                String e1 = item2;
                                for (String item3 : gosnomberser) { // вторая буква
                                    String e2 = item3;
                                    for (String item4 : gosnomberser) { // третья буква
                                        String e3 = item4;

                                        //  System.out.println(item2);


                                        if (e == g & g == f & e == f & e1 == e2 & e2 == e3 & e1 == e3) {

                                            addNumber(e1, e, g, f, e2, e3, item);
                                        }
                                        // проверка что бы цифры все были одинаковые типа 111, 222
                                        // и т.д после этого вывод на печать номера
//                                        {
//
//                                            System.out.print(item2 + " ");
//                                            System.out.print(e);//System.out.format("%03d", item1);
//                                            System.out.print(g);
//                                            System.out.print(f);
//                                            System.out.print(" ");
//                                            System.out.print(item3);
//                                            System.out.print(item4);
//                                            System.out.print(" ");
//                                            System.out.format("%02d", item);
//                                            System.out.println("  ");
//
//
//                                        }


                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }





