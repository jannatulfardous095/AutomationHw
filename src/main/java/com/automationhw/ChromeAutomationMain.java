package com.automationhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAutomationMain {
    public static WebDriver driver;

    public static void main(String[] args) {
        launchChrome();
    }

    public static void launchChrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.bitm.org.bd/");
    }
}
