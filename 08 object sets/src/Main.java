

import models.Message;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MessagesDateComparator implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        return -1 * o1.getDate().compareTo(o2.getDate());
    }
}

public class Main {
    public static void printChat(String username1, String username2) {
        ArrayList<Message> msgs = new ArrayList<>();
        for (Message message : Database.messages) {
            if (message.getReceiver().getUsername().equals(username1) &&
                message.getSender().getUsername().equals(username2) ||
                message.getReceiver().getUsername().equals(username2) &&
                message.getSender().getUsername().equals(username1)) {
                //                System.out.println(message);
                msgs.add(message);
            }
        }
        Collections.sort(msgs, new MessagesDateComparator());
        System.out.println(msgs);
    }

    public static void main(String[] args)
            throws FileNotFoundException, ParseException {

        Database.loadUsers();
        Database.loadMessages();
        //System.out.println(Arrays.toString(Database.users));
        //System.out.println(Arrays.toString(Database.messages));
        //System.out.println(Database.messages[1].getSender().getEmail());
        printChat("daler", "dima");
    }
}
