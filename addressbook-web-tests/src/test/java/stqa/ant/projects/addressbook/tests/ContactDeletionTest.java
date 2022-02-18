package stqa.ant.projects.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

  @Test
  public void deleteContactAddress(){
app.getContactHelper().selectAddressBook();
app.getContactHelper().deleteButton();
app.getContactHelper().closeDialogwindow();

  }
}
