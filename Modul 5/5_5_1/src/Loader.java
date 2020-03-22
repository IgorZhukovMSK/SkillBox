import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap <String , String> statenumber = new HashMap<>();
        for (;;)
        {
            System.out.println("Поажлуйста введите номер машины: ");
            String number = reader.readLine().trim();
            if (statenumber.containsKey(number) ) {

               System.out.println("гос номер: " + number + " владелец авто: " + statenumber.get(number));

            }

            else{
                    String ownerCar = statenumber.get(number);
                    if (ownerCar == null) {
                        System.out.println("Введите имя владельца авто: ");
                        ownerCar = reader.readLine().trim();
                    }

                    statenumber.put(number, ownerCar);

            }
        }

    }
}
