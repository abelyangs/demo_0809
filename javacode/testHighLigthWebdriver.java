package com.gloryroad.testcase;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.AfterMethod;
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.Test;
 
import com.gloryroad.Demo.JavaScriptExcutor;
 
public class TestHighLightWebElement {
 
public WebDriver driver;
 
private String url="http://www.sogou.com";
 
public JavascriptExecutor js;
 
@BeforeMethod
 
public void setUp(){
 
driver=new FirefoxDriver();
 
driver.get(url);
 
}
 
@AfterMethod
 
public void tearDown(){
 
driver.close();
 
}
 
@Test
 
public void testHighLigthWebdriver(){
 
WebElement searchInput=driver.findElement(By.id("query"));
 
WebElement submitButton=driver.findElement(By.id("stb"));
 
highLightElement(searchInput);
 
searchInput.sendKeys("Good");
 
highLightElement(submitButton);
 
submitButton.click();
 
}
 
public void highLightElement(WebElement element){
 
js=(JavascriptExecutor) driver;
 
for (int i = 0; i < 3; i++) {
 
js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"background:yellow ;border:3px solid green;");
 
try {
 
Thread.sleep(1000);
 
js.executeScript("arguments[0].removeAttribute('style',arguments[1]);", element,"background:yellow ;border:3px solid green;");
 
} catch (Exception e) {
 
// TODO: handle exception
 
}
 
}
 
}
 
}
