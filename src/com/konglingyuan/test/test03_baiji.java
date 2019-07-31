package com.konglingyuan.test;

/**
 * 百鸡问题
 * 100块钱买100只鸡，公鸡3块钱，母鸡5块钱，小鸡一块钱
 * 问，有多少种买法
 */

public class test03_baiji {
    public static void main(String[] args) {
        int mj, gj, xj;
        for (mj = 0; mj <= 20; mj++) {
            for (gj = 0; gj <= 33; gj++) {
                xj = 100 - mj - gj;
                if ((mj * 5) + (gj * 3) + (xj / 3) == 100 && (xj % 3 == 0)) {
                    System.out.println(mj + "," + gj + "," + xj);
                }
            }
        }
    }
}
