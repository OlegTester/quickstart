package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App {
    private static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException {

        getDriver();
        test1(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        test2(driver);
        driver.quit();

    }

    @Before
    public static void getDriver () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public static void test1 (WebDriver driver) {
        System.out.println("Тест 1");
        driver.get("https://www.diary.ru/");
        WebElement input = driver.findElement(By.id("drop-login"));
        input.click();
        WebElement login = driver.findElement(By.id("usrlog2"));
        login.click();
        login.sendKeys("Tester555");
        WebElement input3 = driver.findElement(By.id("usrpass2"));
        input3.click();
        input3.sendKeys("qwerty555");
        input3.sendKeys(Keys.ENTER);
        WebElement logout = driver.findElement(By.id("drop"));
        logout.click();
        WebElement exitLink = driver.findElement(By.linkText("Выход"));
//        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(exitLink));
        String exitLinkString = exitLink.getTagName();
        System.out.println(exitLinkString);
        System.out.println(exitLink.getAttribute("href"));
        exitLink.click();


    }
    public static void test2(WebDriver driver) {
        System.out.println("Тест 2");
        driver.get("https://www.diary.ru/");
        WebElement input = driver.findElement(By.id("drop-login"));
        input.click();
        WebElement login = driver.findElement(By.id("usrlog2"));
        login.click();
        login.sendKeys("Tester555");
        WebElement input3 = driver.findElement(By.id("usrpass2"));
        input3.click();
        input3.sendKeys("qwerty555");
        input3.sendKeys(Keys.ENTER);
        WebElement newPost = driver.findElement(By.className("i-menu-newpost"));
        newPost.click();
        WebElement title = driver.findElement(By.id("postTitle"));
        title.click();
        title.sendKeys("Geekbrains-DZ");
        WebElement massage = driver.findElement(By.id("message"));
        massage.click();
        massage.sendKeys("вроде что-то работает");
        WebElement button = driver.findElement(By.cssSelector("input[value='Опубликовать']"));
        button.click();
        WebElement logout = driver.findElement(By.id("drop"));
        logout.click();
        WebElement exitLink = driver.findElement(By.linkText("Выход"));
//        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(exitLink));
        String exitLinkString = exitLink.getTagName();
        System.out.println(exitLinkString);
        System.out.println(exitLink.getAttribute("href"));
        exitLink.click();


    }




//        lesson
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//
//        driver.get("https://.google.com");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement input = driver.findElement(By.cssSelector("input[title='Поиск']"));
//        input.click();
//        input.sendKeys("github");
//        input.sendKeys(Keys.ENTER);
////        String wikiLink = "https://ru.wikipedia.org/wiki/GitHub";
//        WebElement wikiLink = driver.findElement(By.linkText("Википедия"));
//        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(wikiLink));
//        String wikiLinkString = wikiLink.getTagName();
//        System.out.println(wikiLinkString);
//        System.out.println(wikiLink.getAttribute("href"));
//        wikiLink.click();
//        System.out.println(wikiLinkString);
//        List<WebElement> divElements = driver.findElements(By.tagName("div"));
//        System.out.println(divElements.size());
//        driver.quit();
//    }



//    public static WebDriver driver = getPreparedDriver();
//
//    private static ChromeOptions getChromeCapabilities() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//
//        return options;
//    }
//
//    private static WebDriver getPreparedDriver() {
//
//            return new ChromeDriver(getChromeCapabilities());

//            DesiredCapabilities desiredCapabilities new DesiredCapabilities();
//            desiredCapabilities.setJavascriptEnabled(true);
//            System.err.println("Browser name wrong");
//            return new ChromeDriver(desiredCapabilities);
//        }
    }
