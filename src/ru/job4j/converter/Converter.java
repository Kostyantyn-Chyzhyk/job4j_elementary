package ru.job4j.converter;

public class Converter {


    public static int rubleToEuro(int value) {
        return value / 70;
    }


    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in1 = 140;
        int in2 = 120;
        int expected = 2;
        int out1 = rubleToEuro(in1);
        int out2 = rubleToDollar(in1);
        boolean passed1 = expected == out1;
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed1);
        System.out.println("120 rubles are 2. Test result : " + passed2);
    }
}
