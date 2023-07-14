package ru.panteleev.api.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    HashMap<String, List<String>> phonebook;
    Phonebook(){
        phonebook = new HashMap<>();
    }
    public void add(String surName, String phone) {
        if (phonebook.containsKey(surName)) {
            phonebook.get(surName).add(phone);
        } else {
            ArrayList<String> lst = new ArrayList<>();
            lst.add(phone);
            phonebook.put(surName, lst);
        }
    }
    public List<String> get(String surName) {
        return phonebook.get(surName);
    }
}
