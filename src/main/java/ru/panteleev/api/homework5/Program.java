package ru.panteleev.api.homework5;

public class Program {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();

        pb.add("qwer","1234");
        pb.add("asdf","2345");
        pb.add("zxcv","3456");
        pb.add("qwer","4567");

        System.out.println(pb.get("qwer"));
        System.out.println(pb.get("asdf"));
    }
}
