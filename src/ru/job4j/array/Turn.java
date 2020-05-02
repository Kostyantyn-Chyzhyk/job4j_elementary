package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tem;
        for (int i = (array.length % 2 == 1) ? (array.length - 1) / 2 : array.length / 2; i <= array.length - 1; i++) {
            tem = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tem;
        }
        return array;
    }
}