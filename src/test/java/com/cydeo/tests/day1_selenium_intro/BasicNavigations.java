package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    private static String currentTitle;

    public static void main(String[] args)  throws InterruptedException{

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();   // browser drivveri kurduk

        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser

        WebDriver driver = new ChromeDriver(); // bu kod empty browser aciyor

        //This line will maximize the browser size


        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");  // tesla.com a giriyoruz.

        // use selenium to navigate back
        driver.navigate().back();  // sayfaya geri donuyor


        //Stop code execution for 3 seconds
        Thread.sleep(3000);  // sayfa acildiktan sonra 3 saniye bekliyor


        // use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);


        // use selenium to navigate refresh
        driver.navigate().refresh();

        Thread.sleep(3000);
        // use navigate().to():
       driver.navigate().to("https://www.google.com"); // ustteki islemlerden sonra google.com a giriyor


        currentTitle = driver.getTitle();
        // currentTitle = Google
       // sitenin ismini bize veriyor aciklamali


        //get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());

        //driver.getTitle() = Google

        System.out.println("currentTitle = " + currentTitle);
        // sitenin ismini bize veriyor aciklamali
        // teslanin site ismi: Electric Cars, Solar & Clean Energy | Tesla  HTML den bakilabilir.

        // get the current URL using selenium
         String currentURL =   driver.getCurrentUrl();

        






    }
}
