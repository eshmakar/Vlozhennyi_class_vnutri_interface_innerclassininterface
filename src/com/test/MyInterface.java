package com.test;

public interface MyInterface {
    void info();
    static class MyClass implements com.test.MyInterface {
        public void info(){
            System.out.println("info()");
        }

        public static void main(String[] args) {
            MyClass m = new MyClass();
            m.info();
        }
    }
}
