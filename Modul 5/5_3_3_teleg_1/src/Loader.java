import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.javagram.response.object.UserContact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Loader  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 334859, "8e1c7a4429a8f9c38d010147c97cc049");
        System.out.println("Please, type phone numbers: ");
        String phoneCode = reader.readLine().trim();
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(phoneCode);

        bridge.authSendCode(phoneCode);
        System.out.println("Please, type SMS-code: ");
        AuthAuthorization authSignIn = bridge.authSignIn(reader.readLine());

        System.out.println("User name is: " + authSignIn.getUser().getFirstName());

        ArrayList <UserContact> users = bridge.contactsGetContacts();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getLastName() + " " + users.get(i).getPhone());
        }



    }
}