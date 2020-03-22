import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> carInfo = new TreeMap<>();

        for (; ;){
            System.out.println("Please, type car number:");
            String number = reader.readLine().trim();

            if (carInfo.containsKey(number)) {
                for (String name : carInfo.keySet()) {
                    System.out.println(number + " car belongs to: " + carInfo.get(number));
                }
            }
            else {
                String ownerName = carInfo.get(number);
                if (ownerName == null) {
                    System.out.println("This car belongs to?");
                    ownerName = reader.readLine().trim();
                }
                carInfo.put(number, ownerName);
            }
        }
    }
}