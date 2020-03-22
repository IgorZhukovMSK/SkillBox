package cyberforum;
import java.util.Arrays;
import java.util.Scanner;

public class Loader {

        private static int [] generatAnyNumbers(int countNum) {
            int [] result = new int[countNum];
            for (int i = 0; i < countNum; i++) {
                result[i] = (int)(Math.random()*countNum);
            }

            return result;
        }

        private static void isNumInArr(int [] arr, int num) {
            int tmp = Arrays.binarySearch(arr,num);
            if (tmp > 0)
                System.out.print(" - Это число есть в списке!\n");
            else System.out.print(" - Число не найдено\n");
        }

        public static void main(String[] args)  {
            int [] numbers = generatAnyNumbers(10);
            Arrays.sort(numbers);
            int searchNum;
            Scanner reader = new Scanner(System.in);
            System.out.println("Какой номер вы ищете?");
            while(true) {
                searchNum = reader.nextInt();
                isNumInArr(numbers, searchNum);
                System.out.println("Попробуйте ввести другое ");
            }
        }
    }





