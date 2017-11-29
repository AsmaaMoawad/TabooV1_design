package com.example.asmaa.asmaa_task2_taboogh.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Asmaa on 25-Nov-17.
 */

public class SupplierModel implements Serializable {
    Integer id;
    String Type;
    String Name;
    String NameAr;
    String Brief;
    String BriefAr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNameAr(String nameAr) {
        NameAr = nameAr;
    }

    public void setBrief(String brief) {
        Brief = brief;
    }

    public void setBriefAr(String briefAr) {
        BriefAr = briefAr;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public void setCommission(Integer commission) {
        Commission = commission;
    }

    public void setContactPerson(String contactPerson) {
        ContactPerson = contactPerson;
    }

    public void setContactPersonAr(String contactPersonAr) {
        ContactPersonAr = contactPersonAr;
    }

    public void setContactPersonMobile(String contactPersonMobile) {
        ContactPersonMobile = contactPersonMobile;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        ContactPersonEmail = contactPersonEmail;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setModifyDate(Date modifyDate) {
        ModifyDate = modifyDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        LastLoginDate = lastLoginDate;
    }

    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }

    public String getNameAr() {
        return NameAr;
    }

    public String getBrief() {
        return Brief;
    }

    public String getBriefAr() {
        return BriefAr;
    }

    public String getLogo() {
        return Logo;
    }

    public String getEmail() {
        return Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPhone() {
        return Phone;
    }

    public String getFax() {
        return Fax;
    }

    public Integer getCommission() {
        return Commission;
    }

    public String getContactPerson() {
        return ContactPerson;
    }

    public String getContactPersonAr() {
        return ContactPersonAr;
    }

    public String getContactPersonMobile() {
        return ContactPersonMobile;
    }

    public String getContactPersonEmail() {
        return ContactPersonEmail;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public Boolean getStatus() {
        return Status;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public Date getModifyDate() {
        return ModifyDate;
    }

    public Date getLastLoginDate() {
        return LastLoginDate;
    }

    String Logo;
    String Email;
    String Mobile;
    String Phone;
    String Fax;
    Integer Commission;
    String ContactPerson;
    String ContactPersonAr;
    String ContactPersonMobile;
    String ContactPersonEmail;
    Date CreatedDate;
    Boolean Status;
    String Username;
    String Password;
    Date ModifyDate;
    Date LastLoginDate;

}
