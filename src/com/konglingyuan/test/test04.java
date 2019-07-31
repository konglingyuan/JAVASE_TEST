package com.konglingyuan.test;

/**
 * 数组
 */
public class test04 {

    public static void main(String[] args) {
        int[] n = {1,2};

        /* 声明式的定义 准确写法*/
        int[] n1 = new int[]{1,2};

        int[] n2 = new int[2];
        n2[0] = 1;
        n2[1] = 2;

        System.out.println(n2.length);
    }
}
