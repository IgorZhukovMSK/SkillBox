import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Loader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet <String> items = new TreeSet<>();

        for (;;)
        {
            System.out.println("Please, type next drug: ");
            String command = reader.readLine().trim();
            if (command.equals("List")){
                for (String name : items){
                    System.out.println(name);
                }
            }
            else {
                items.add(command);
            }

        }
    }
}
