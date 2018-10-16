package ru.stqa.ptf.addressbook.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.ptf.addressbook.appmanager.ApplicationManager;
import ru.stqa.ptf.addressbook.model.ContactData;

import static org.testng.Assert.fail;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

   /* @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      driver = new FirefoxDriver();
      baseUrl = "https://www.katalon.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/index.php");
      login("admin", "secret");
    }*/

    /*private void login(String username, String password) {
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.id("LoginForm")).submit();
    }*/


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

        String verificationErrorString = app.verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }

    /*@AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }*/

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }
}
