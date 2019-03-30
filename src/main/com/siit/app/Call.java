package main.com.siit.app;

import java.util.Date;

public class Call {

    private String phoneNo;
    private Date date;

    public Call(String phoneNo) {
        this.phoneNo = phoneNo;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return " on " + date;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
