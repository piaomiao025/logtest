package com.man.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class Thread1 extends Thread {
	org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	Logger logger4j = Logger.getLogger(Thread1.class);

	java.util.logging.Logger loggerj = java.util.logging.Logger.getLogger("Thread1");

	Log log = LogFactory.getLog(Thread1.class);

	private String name;

	public Thread1(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			// logger.info("{}运行：{}", name, i);
			// logger4j.info(name + "运行--log4j：" + i);
			loggerj.info("java log 打印的log，运行：" + i);

			// log.info("apache log 打印的log，运行" + i);

			try {
				sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static {
		SLF4JBridgeHandler.install();
	}
}
