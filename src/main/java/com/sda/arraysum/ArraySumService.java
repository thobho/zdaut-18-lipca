package com.sda.arraysum;

public class ArraySumService {
    public int sumArrayElements(int[] tab) {
        if (tab == null){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        return sum;
    }
}
