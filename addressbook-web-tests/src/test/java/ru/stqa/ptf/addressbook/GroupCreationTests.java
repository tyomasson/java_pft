package ru.stqa.ptf.addressbook;


import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm("test2", "test2", "test2");
    submitGroupCreation();
    returnToGroupPage();
  }

}
