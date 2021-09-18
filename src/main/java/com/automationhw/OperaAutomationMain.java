package com.automationhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaAutomationMain {
    public static WebDriver driver;

    public static void main(String[] args) {
        launchOpera();
    }

    public static void launchOpera(){
        String path = "C:\\Users\\tarun\\Documents\\AutomationHW\\src\\main\\resources\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Users\\tarun\\AppData\\Local\\Programs\\Opera\\79.0.4143.22\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        driver=new OperaDriver(options);
        driver.get("http://www.bitm.org.bd/");
    }
}
