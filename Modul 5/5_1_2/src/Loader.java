public class Loader {
    public static void main(String[] args) {


       String letter [] = { "A", "B", "C", "D", "E", "F", "G", "H"};
       int number [] = {1, 2, 3, 4, 5, 6, 7, 8}; // не пойму почему здесь нужно ставить 0, безе него не считаевт

        for (int i = number.length-1; i >= 0; i--) // и здесь нужно указывать -1, тоже что то не понимаю (
        {
            for (int j = 0; j < letter.length; j++){

                System.out.print(letter[j] + number[i] +" " );

            }
            System.out.println();
        }
    }
}
