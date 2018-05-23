package com.mindtree.controller;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerExample
{
	private final static Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void setUpLogger()
	{
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.WARNING);
		logger.addHandler(ch);
	}
	public static void main(String[] args) {
		LoggerExample.setUpLogger();
		
		logger.warning("My first Log");
		logger.severe("Second log");
	}
}
