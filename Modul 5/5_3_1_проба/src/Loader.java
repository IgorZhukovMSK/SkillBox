public class Loader {


    public static void addNumber(char ch_1, int i, int j, int k, char ch_2, char ch_3, int g) {
        String number = "";
        number += ch_1;
        number += i;
        number += j;
        number += k;
        number += ch_2;
        number += ch_3;
        number += g;
        System.out.println(number);
    }

    public static void main(String[] args) {
        for (char ch_1 = 'а'; ch_1 <= 'я'; ch_1++) {
            for (char ch_2 = 'а'; ch_2 <= 'я'; ch_2++) {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        for (int k = 0; k <= 9; k++) {
                            for (int g = 0; g <= 99; g++) {
                                for (char ch_3 = 'а'; ch_3 <= 'я'; ch_3++) {
                                    addNumber(ch_1, i, j, k, ch_2, ch_3, g);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


