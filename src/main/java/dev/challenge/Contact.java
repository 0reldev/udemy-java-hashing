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
        this.name = name;
        this.emails = emails;
        this.phones = phones;
    }

    public String convertPhone(long phone) {
        return "";
    }
}
