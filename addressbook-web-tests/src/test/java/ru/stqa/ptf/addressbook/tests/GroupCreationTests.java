package ru.stqa.ptf.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.ptf.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test99", "test2", "test2"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
