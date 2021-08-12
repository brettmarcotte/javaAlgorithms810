package com.company;

public class arrayOfMultiples {

    public static int[] main(String[] args) {

        public static int[] arrayOfMultiples(int num, int length) {

            int[] multiples = new int[length];

            for (int i = 0; i < length; i++) {
                multiples[i] = num * (i + 1);
            }
            return multiples;
        }
    }
}
