package stqa.ant.projects.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {

    super(wd);
  }
public void addNewAddressBook (String fname, String lname, String mphone) throws InterruptedException {
    Thread.sleep(2000);
    type(By.cssSelector("input[name='firstname']"), fname);
    type(By.cssSelector("input[name='lastname']"), lname);
    type(By.cssSelector("input[name='mobile']"), mphone);
}
public void submitCta (){
    click(By.name("submit"));
  }

  public void selectAddressBook() {
    click(By.cssSelector("[type='checkbox']"));
  }
  public void deleteButton(){
    click(By.cssSelector("input[value='Delete']"));
  }
  public  void closeDialogwindow() {
    wd.switchTo().alert().accept();

  }
}
