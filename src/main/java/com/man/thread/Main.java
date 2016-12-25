package com.man.thread;

public class Main {
    public static void main(String[] args){
        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");
        
        t1.start();
        t2.start();
    }
}
