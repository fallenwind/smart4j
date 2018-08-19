package org.smart4j.chapter2.model;

public class Customer {

    private long id;
    private String name;
    //联系人
    private String contact;
    private String telephone;
    private String email;
    //备注
    private String remark;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

//    public Customer(long id, String name, String contact, String telephone, String email, String remark) {
//        this.id = id;
//        this.name = name;
//        this.contact = contact;
//        this.telephone = telephone;
//        this.email = email;
//        this.remark = remark;
//    }

}
