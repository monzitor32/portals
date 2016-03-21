package com.custman.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class Log {

//Initialize Log4j logs

//private static Logger Log = Logger.getLogger(Log.class.getName());//
	
	private static Logger Log = Logger.getLogger(Log.class);//
	
	//private static Logger Log = Logger.getLogger("TestLogger");//

// configure log4j properties file
//PropertyConfigurator.configure("Log4j.properties");


//DOMConfigurator.configure("log4j.xml");	
    // Here we need to create logger instance so we need to pass Class name for 
    //which  we want to create log file in my case Google is classname
       // Logger logger=Logger.getLogger("Google");
       

      // configure log4j properties file
    //PropertyConfigurator.configure("Log4j.properties");	

	
	
	// This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

public static void startTestCase(String sTestCaseName){

	Log.info("****************************************************************************************");

	Log.info("****************************************************************************************");

	Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

	Log.info("****************************************************************************************");

	Log.info("****************************************************************************************");

	}

	//This is to print log for the ending of the test case

public static void endTestCase(String sTestCaseName){

	Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

	Log.info("X");

	Log.info("X");

	Log.info("X");

	Log.info("X");

	}

	// Need to create these methods, so that they can be called  

public static void info(String message) {

		Log.info(message);

		}

public static void warn(String message) {

   Log.warn(message);

	}

public static void error(String message) {

   Log.error(message);

	}

public static void fatal(String message) {

   Log.fatal(message);

	}

public static void debug(String message) {

   Log.debug(message);

	}

}