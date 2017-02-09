package org.fasttrackit.automation;


import com.sdl.selenium.web.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage {
    @FindBy(name ="password")
    private WebElement currentPasswordField;// driver.findElement(By.name("password"));
    @FindBy (name = "newPassword")
    private WebElement newPasswordField; // driver.findElement(By.name("newPassword"));
    @FindBy(name = "newPasswordRepeat")
    private WebElement repeatPasswordField; // driver.findElement(By.name("newPasswordRepeat"));
    //To Do save button;


    public void changePassword (String currentPass, String newPass, String repeatPass) {
        currentPasswordField.sendKeys("wrong.pass");
        newPasswordField.sendKeys("new.pass");
        repeatPasswordField.sendKeys("new.pass");
        //To Do save button;
    }
}
