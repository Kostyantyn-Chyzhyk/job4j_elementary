package ru.job4j.converter;

/**
 * 5.8. JavaDoc. Code convention[#266793]
 * @author Kostyantyn
 * @version 2
 */
public class Converter {

    /**
     * Method rubleToEuro.
     * @param value rubles to convert
     * @return euros
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     *Method rubleToDollar.
     * @param value rubles to convert
     * @return dollars
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(300);
        System.out.println("300 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollar + " dollars.");
    }
}