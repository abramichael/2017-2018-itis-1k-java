package models;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender.getUsername() +
                ", receiver=" + receiver.getUsername() +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public Date getDate() {
        return date;
    }
}
