import java.lang.reflect.Array;

public class Loader {
    public static void main(String[] args) {

//серии взяты http://ingvarr.net.ru/ufms/seriya

// reg - регион выдавший паспорт
        // по хорошему можно было создать массив который сам в себя запишет все регионы, но как из них убрать которыъ нет (((
//        int reg[] = {01, 03, 04, 05, 07, 8, 11, 12, 14, 15, 17, 19, 20, 20, 22, 24, 25, 26, 27, 28, 29, 32, 33, 34, 36, 37, 38, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61,
//                62, 63, 64, 65, 66, 67, 68, 69, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
// year - год в который выдан паспорт начал с 2000 года по 2019
        //int year [] ={00,01,02,03,04,05,06,07,8,9,10,11,12,14,15,17,19};

        Integer[] year = new Integer[20];
        for (int i = 0; i < 20; i++) {
            year [i] = i;
            }

        Integer[] reg = new Integer[99];
        for (int j = 0; j < 99; j++) {
            reg [j] = j+1;
            }

            for (int item : reg)       //(int i = 0; i < reg.length; i++)
            {
                for (int item1 : year) {    //(int j = 0; j < year.length; j++){

                    System.out.format("%02d", item);  //reg[j] + year[i] + "   "
                    System.out.print(" ");
                    System.out.format("%02d", item1);
                    System.out.print("    ");
                }
                System.out.println();

            }

        }
    }


