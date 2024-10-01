package learn_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.TreeMap;

public class SeleniumChrome {
    public static void main(String[] args) throws InterruptedException {
        // C:\Users\khali\eclipse-workspace\start_selenium\src\main\resources\chromedriver.exe

        // chromedriver directory
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator
                + "main" + File.separator + "resources" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        // initialize  chrome
        // Webdriver is an interface
        // driver reference variable
        WebDriver driver = new ChromeDriver();
        // get website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");










    }
}
