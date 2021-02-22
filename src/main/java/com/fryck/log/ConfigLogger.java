package com.fryck.log;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * @author fryck
 * 
 * metodo de configuración para layout modificado de logback
 * @return void 
 *
 */
public class ConfigLogger {
	
	

	private static final File TEST_DIR = new File(System.getProperty("java.io.tmpdir"), "logbakdir");

	public static void IniciarLoger() throws IOException {

		System.setProperty("appli.config.path", ClassLoader.getSystemClassLoader().getResource("logback.xml").getPath());
        System.setProperty("log.dir",TEST_DIR.toString());        
		TEST_DIR.mkdirs();
		FileUtils.cleanDirectory(TEST_DIR);
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
		JoranConfigurator configurator = new JoranConfigurator();
		configurator.setContext(context);
		context.reset();
		configureLoggerContext(ClassLoader.getSystemClassLoader().getResource("logback.xml").getFile());
		MDC.put("loggerFileName", "log");
	}
	
	
	 private static void configureLoggerContext(String logbackConfigFileUrl) {
		    File file = new File(logbackConfigFileUrl);
		    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		    loggerContext.reset();
		    JoranConfigurator configurator = new JoranConfigurator();
		    configurator.setContext(loggerContext);
		    try {
		        configurator.doConfigure(file);
		    } catch (JoranException je) {
		        throw new RuntimeException(je.getMessage());
		    }
		}
	

}
