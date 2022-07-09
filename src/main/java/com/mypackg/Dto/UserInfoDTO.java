package com.mypackg.Dto;

public class UserInfoDTO {
    private String Yourname;
    private String CrushName;

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "Yourname='" + Yourname + '\'' +
                ", CrushName='" + CrushName + '\'' +
                '}';
    }

    public String getYourname() {
        return Yourname;
    }

    public void setYourname(String yourname) {
        Yourname = yourname;
    }

    public String getCrushName() {
        return CrushName;
    }

    public void setCrushName(String crushName) {
        CrushName = crushName;
    }
}
