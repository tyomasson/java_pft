package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.ContactData;

public class NewContactTests extends TestBase {

    @Test
    public void testNewContactTests() {

        app.iniContactCreation();
        app.fillContactForm(new ContactData("Done", "Olegovich", "Goncharenko", "Tomash",
                "QA", "Best company", "Kyiv, best crypto street 9", "9999999",
                "888888", "33333333", "2312312312321", "work@bitcoin.com", "3",
                "June", "1920", "none", "none", "test execution"));
        app.submitContactCreation();
    }

}
