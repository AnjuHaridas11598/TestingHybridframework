package com.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
		public void LaunchURL() throws IOException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			FileInputStream FS=new FileInputStream("src/test/resources/Properties/Facebook.Properties");
			prop=new Properties();
			prop.load(FS);
			prop.getProperty("browser").equalsIgnoreCase("chrome");
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		public void closeURL() {
			driver.close();

		}
		
				
	}


