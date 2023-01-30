package com.utility;

import java.io.FileInputStream;
import java.util.Properties;
public class readConfig {
	public Properties ps;
	String path="C:\\Users\\ksagar\\practice\\automatecrm\\Configration\\config.properties";
	public readConfig( ) {
		try {
			this.ps = new Properties();
			FileInputStream fis =new FileInputStream(path);
			ps.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Load the configuration file

		public String getUrl()
		{
			String value =ps.getProperty("url");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("Url not specified in the file");
		}
		public  String getBroser()
		{
			String value =ps.getProperty("browser");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("browser not specified in the file");
		}
		public  String getFirstName()
		{
			String value =ps.getProperty("fname");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("FirstName not specified in the file");
		}
		public  String getLastName()
		{
			String value =ps.getProperty("lname");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("LastName not specified in the file");
		}
		public  String getEmailID()
		{
			String value =ps.getProperty("email");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("Email not specified in the file");
		}
		public  String getUsername()
		{
			String value =ps.getProperty("uname");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("Username not specified in the file");
		}
		public  String getPassword()
		{
			String value =ps.getProperty("psw");
			if(value!=null)
				return value;
			else
				throw new RuntimeException("Password not specified in the file");
		}

		

}
