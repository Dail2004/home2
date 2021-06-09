package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {-1.2, 5.2, 5.6, 6.2, 7.56, 9.2, -6.66, -4.72, -8.2, -2.64, -4.6, -7.42, -3.16, 5.24, 4.88};
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            double temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
