package com.man.thread;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread{
    org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    Logger logger4j = Logger.getLogger(Thread1.class);
    
    Logging logj = null;
    
    private String name;
    
    public Thread1(String name){
        this.name = name;
    }
    
    public void run(){
        for(int i = 0 ; i < 500 ; i++){
            logger.info("{}运行：{}", name, i);
//            logger4j.info(name + "运行--log4j：" + i);
            
            
            try{
                sleep((int)Math.random() * 100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

