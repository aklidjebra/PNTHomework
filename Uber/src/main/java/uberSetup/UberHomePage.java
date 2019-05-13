package uberSetup;

import basePackage.BaseClass;
import org.openqa.selenium.By;

public class UberHomePage extends BaseClass {


    public void uberHome (){
        System.out.println(driver.getTitle());
    }
    public void Uberlogin(){
        driver.findElement(By.xpath("//*[@id=\"/sign-in/\"]/div/span")).click();
    }
    public void ridersignin(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/div/div/div/div/div[8]/div/div[2]/a")).click();
    }
    public void inputemail(String email){
        driver.findElement(By.id("useridInput")).sendKeys(email);
        //driver.findElement(By.className("push-small--right")).click();
    }
}
