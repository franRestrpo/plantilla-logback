package com.fryck.principal;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fryck.log.ConfigLogger;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws IOException {
		ConfigLogger.IniciarLoger();
		logger.info("Example log from {}", App.class.getName());
		logger.info(System.getProperty("appli.config.path"));
		logger.info(System.getProperty("log.dir"));
		logger.info(System.getProperty("loggerFileName"));
		
    }
}