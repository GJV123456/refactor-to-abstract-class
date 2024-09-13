package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜 {

    public 清炒菜心(String name) {
        super(name);
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 放佐料() {
        System.out.println("放酱油");
        System.out.println("放盐");
    }
}
