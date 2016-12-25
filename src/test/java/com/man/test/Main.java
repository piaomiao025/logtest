package com.man.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.man.thread.Thread1;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args){
        
        
        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");
        
        t1.start();
        t2.start();
        
        logger.info("执行结束咯！");
    }
}
