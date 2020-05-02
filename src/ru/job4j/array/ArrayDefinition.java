package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Andrei Hincu";
        names[1] = "Sergey Mayer";
        names[2] = "Rail Shamsemuhametov";
        names[3] = "Korobeinikov Stas";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
