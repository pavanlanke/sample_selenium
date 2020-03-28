package pavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavan lanke\\eclipse-workspace\\pavan\\src\\test\\resources\\binaries\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	     
	    driver.get("https://www.tutorialspoint.com/java/java_basic_syntax.htm");
	    driver.manage().window().maximize();
	    driver.close();

	}

}
