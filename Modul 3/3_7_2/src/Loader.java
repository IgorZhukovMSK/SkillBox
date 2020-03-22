import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.40:443", 334859, "8e1c7a4429a8f9c38d010147c97cc049");
        System.out.println("Please, type phone numbers: ");

        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().trim());

        AuthSentCode sentCode = bridge.authSendCode(reader.readLine());

        AuthAuthorization authSignIn = bridge.authSignIn(reader.readLine());

        System.out.println("User name is: " + authSignIn.getUser().getFirstName());

    }
}