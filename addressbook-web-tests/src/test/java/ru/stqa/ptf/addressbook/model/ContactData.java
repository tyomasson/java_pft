package ru.stqa.ptf.addressbook.model;

public class ContactData {
    private String firstname;
    private String middlename;
    private String lastname;
    private String nick;
    private String title;
    private String company;
    private String address;
    private String homenumber;
    private String mobphone;
    private String workphone;
    private String fax;
    private String email;
    private String bday;
    private String bmonth;
    private String byear;
    private String address2;
    private String phone2;
    private String notes;

    public ContactData(String firstname, String middlename, String lastname, String nick, String title, String company, String address, String homenumber, String mobphone, String workphone, String fax, String email, String bday, String bmonth, String byear, String address2, String phone2, String notes) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nick = nick;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homenumber = homenumber;
        this.mobphone = mobphone;
        this.workphone = workphone;
        this.fax = fax;
        this.email = email;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNick() {
        return nick;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomenumber() {
        return homenumber;
    }

    public String getMobphone() {
        return mobphone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getNotes() {
        return notes;
    }
}
