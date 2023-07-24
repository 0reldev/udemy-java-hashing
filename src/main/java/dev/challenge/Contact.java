package dev.challenge;

import java.util.HashSet;
import java.util.Set;

public class Contact {

    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String email) {
        this.name = name;
        if (null != email && !email.isEmpty() && !email.isBlank()) {
            emails.add(email);
        }
    }

    public Contact(String name, long phone) {
        this.name = name;
        if (0 != phone) {
            phones.add(convertPhone(phone));
        }
    }

    public Contact(String name, String email, String phone) {
        this(name, phone);
        if (null != email && !email.isEmpty() && !email.isBlank()) {
            emails.add(email);
        }
    }

    public String convertPhone(long phone) {
        String phoneString = Long.toString(phone);
        return "(" + phoneString.substring(0, 3) + ") " + phoneString.substring(3, 6) + "-" + phoneString.substring(6);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }

}
