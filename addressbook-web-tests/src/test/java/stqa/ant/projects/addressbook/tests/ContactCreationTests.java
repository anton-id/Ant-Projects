package stqa.ant.projects.addressbook.tests;

import org.testng.annotations.*;


public class ContactCreationTests extends TestBase {

  @Test
  public void createNewContact() throws Exception {

    app.getNavigationHelper().gotoAddNewTab();
    app.getContactHelper().addNewAddressBook("John","Doe","1012345678");
    app.getContactHelper().submitCta();
  }
}
