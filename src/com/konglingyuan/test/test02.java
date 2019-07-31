package com.konglingyuan.test;

public class test02 {
    /**
     *
     * @param args
     *
     * 变量：先声明，再赋值
     * 声明初始化 例如：int a=1
     * java中可以在任意地方定义变量，从定义的位置开始，到所在的第一个 } 结束
     *
     * 基本数据类型
     *
     *引用数据类型：类  接口  数组
     * 类：自定义的数据类型
     * 接口：自定义的数据类型
     */
    public static void main(String[] args) {

        System.out.println(1 > 2);
        System.out.println("你的结果是;" + ( 2 > 1 ) + "正确!");

        /*
        字符串
         */
        String s = new String();
        s = "djkaf;ds";
        System.out.println(s);

        /*
        分支结构
         */

        switch (10){
            case 1:
                break;
        }

        if (true) {

        }else {

        }

        /*
        循环选择
        for  明确循环此时
        while  不明确，有可能是0次
        do-while 至少执行一次

        break：终止当前循环
        continue：跳至下一次循环
        */

        for (int i =1;i < 10; i++) {
            System.out.println(1);
        }
    }
}
