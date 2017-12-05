import models.Message;
import models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Database {
    final static int numberOfUsers = 3;
    final static int numberOfMessages = 4;
    static User [] users = new User[numberOfUsers];
    static Message [] messages= new Message[numberOfMessages];

    public static User[] loadUsers() throws FileNotFoundException{

        Scanner scanner = new Scanner(new File("resources/users.txt"));
        for (int i = 0; i < numberOfUsers; i++) {
            long id = Long.parseLong(scanner.nextLine());
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            String email = scanner.nextLine();
            users[i] = new User(id, username, password, email);
        }
        return users;
    }

    public static Message[] loadMessages() throws FileNotFoundException, ParseException {


        Scanner scanner = new Scanner(new File("resources/messages.txt"));

        for (int i = 0; i < numberOfMessages; i++) {
            long sender_id = Long.parseLong(scanner.nextLine());
            long receiver_id = Long.parseLong(scanner.nextLine());
            String text = scanner.nextLine();
            String dateString = scanner.nextLine();

            messages[i] = new Message();
            for (User user: users) {
                if (user.getId() == sender_id) {
                    messages[i].setSender(user);
                    break;
                }
            }
            for (User user: users) {
                if (user.getId() == receiver_id) {
                    messages[i].setReceiver(user);
                    break;
                }
            }
            messages[i].setText(text);
            DateFormat df = new SimpleDateFormat("dd-mm-yyyy, HH:mm:ss");
            Date date = df.parse(dateString);
            messages[i].setDate(date);
        }
        return messages;
    }

}
