package com.konglingyuan.test;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {
        //命令行参数使用
        //使用命令行编译代码时，后缀参数，此时，编译后会输出参数内容
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("直接输入main  就能调用main方法");
        System.out.println("class文件是编译后文件");
        System.out.println("代码要进行实时保存");
        System.out.println("源文件  目标文件");
        System.out.println("ceshi");
    }
}
