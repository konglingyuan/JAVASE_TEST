package com.konglingyuan.test;

public class test06_erfen {

    /**
     * 二分查找，必须是有序数列
     */

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        int num = 9;

        //定义坐标
        int start = 0;
        int end = n.length - 1;
        int middle = (start + end) / 2;

        while (start <= end) {
            if (n[middle] == num) {
                System.out.println("找到了" + n[middle]);
                break;
            }else if (n[middle] > num) {
                end = middle - 1;
            } else if (n[middle] < num) {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("没找到");
        }
    }
}
