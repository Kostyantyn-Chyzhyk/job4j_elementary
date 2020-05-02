package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int num = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = num;
                num++;
            }
        }
    }
}
