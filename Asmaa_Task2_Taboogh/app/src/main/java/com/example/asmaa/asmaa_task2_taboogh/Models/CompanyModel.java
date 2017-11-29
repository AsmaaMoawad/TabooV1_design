package com.example.asmaa.asmaa_task2_taboogh.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Asmaa on 25-Nov-17.
 */

public class CompanyModel implements Serializable {
    Integer id;
    Integer Type;
    String Name;
    String NameAr;
    String Brief;
    String BriefAr;
    int logo; // for test only
    //     String logo; // the actual data type is string not int
    String Email;
    String Mobile;
    String Phone;
    String Fax;
    Boolean Status;
    Integer Commission;
    String ContactPerson ;
    String ContactPersonAr;
    String ContactPersonMobile;
    String ContactPersonEmail;
    String Password;
    Date CreatedDate ;
    Date ModifyDate ;
    Date LastLoginDate ;
    String Username;



    public String getName() {
        return Name;

    }

    public void setName(String name) {
        Name = name;
    }


    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }




}





