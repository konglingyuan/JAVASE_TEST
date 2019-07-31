package com.konglingyuan.test;

public class test05_maopao1 {

    /**
     *
     * @param args
     *
     * 冒泡法排序
     */

    public static void main(String[] args) {

        int[] n = {890,32,54,862,902,6784,23,23,672,4};

        /*由小到大*/
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - i -1; j++) {
                if (n[j] > n[j+1]) {
                    int t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }

    }
}
