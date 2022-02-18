package stqa.ant.projects.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {


  public NavigationHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void gotoGroupPage() {

    click(By.linkText("groups"));
  }
  public void gotoAddNewTab() {
    click(By.cssSelector("li:nth-of-type(2) > a"));
  }


}
